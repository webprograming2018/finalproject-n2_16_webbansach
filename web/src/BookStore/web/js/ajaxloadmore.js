// Biến dùng kiểm tra nếu đang gửi ajax thì ko thực hiện gửi thêm
var is_busy = false;

// Biến lưu trữ trang hiện tại
var page = 1;

// Biến lưu trữ rạng thái phân trang 
var stopped = false;

//Bien luu so phan tu/trang
var limit = 4;

$(document).ready(function ()
{
    // Khi kéo scroll thì xử lý
    $(window).scroll(function ()
    {
        // Element append nội dung
        $element = $('.content');

        // ELement hiển thị chữ loadding
        $loadding = $('#loadding');

        // Nếu màn hình đang ở dưới cuối thẻ thì thực hiện ajax
        if ($(window).scrollTop() + $(window).height() >= $element.height())
        {
            // Nếu đang gửi ajax thì ngưng
            if (is_busy == true) {
                return false;
            }

            // Nếu hết dữ liệu thì ngưng
            if (stopped == true) {
                return false;
            }

            // Thiết lập đang gửi ajax
            is_busy = true;

            // Tăng số trang lên 1
            page++;

            // Hiển thị loadding
            $loadding.removeClass('hidden');

            // Gửi Ajax
            $.ajax({
                type: 'get',
                dataType: 'json',
                url: '../LoadmoreBook',
                data: {page: page},
                async: true,
                cache: false,
                success: function (result)
                {
                    //Lấy size của list này
                    var listSize = Object.keys(result).length;
                    if (listSize > limit) {                       
                        for (i = 0; i < listSize-1; i++) {
                            var html = '<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">\n';                        
                                html+='<div class="thumbnail">\n';
                                html+='<a href="bookdetail.jsp?bookID='+ result[i].id+'">\n';
                                html+='<img style="width: 200px; height: 300px" class="img-responsive book__image" src=../images/hinhsach/'+ result[i].image+'>\n';
                                html+='</a>\n';
                                html+='<div class="text-center">\n';
                                html+='<h4>'+result[i].name+'</h4>\n';
                                var num = result[i].price/1000;
                                html+='<p>Giá: '+ Math.round(num) + "." + '000Đ'+'</p>\n';
                                html+='<a class="btn btn-primary" href="../CartServlet?command=plus&bookID='+result[i].id+'">Mua ngay</a>\n';
                                html+='<a class="btn btn-default" href="bookdetail.jsp?bookID='+result[i].id+'">Chi tiết</a>\n';
                                html+='</div>\n';
                                html+='</div>\n';
                                html+='</div>\n';
                            $element.append(html);
                        }
                    } else {
                        $loadding.addClass('hidden');
                        for (i = 0; i < listSize; i++) {
                            var html = '<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">\n';                        
                                html+='<div class="thumbnail">\n';
                                html+='<a href="bookdetail.jsp?bookID='+ result[i].id+'">\n';
                                html+='<img style="width: 200px; height: 300px" class="img-responsive book__image" src=../images/hinhsach/'+ result[i].image+'>\n';
                                html+='</a>\n';
                                html+='<div class="text-center">\n';
                                html+='<h4>'+result[i].name+'</h4>\n';
                                var num = result[i].price/1000;
                                html+='<p>Giá: '+ Math.round(num) + "." + '000Đ'+'</p>\n';
                                html+='<a class="btn btn-primary" href="../CartServlet?command=plus&bookID='+result[i].id+'">Mua ngay</a>\n';
                                html+='<a class="btn btn-default" href="bookdetail.jsp?bookID='+result[i].id+'">Chi tiết</a>\n';
                                html+='</div>\n';
                                html+='</div>\n';
                                html+='</div>\n';
                            $element.append(html);
                        }
                        stopped = true;
                    }
                },
                error: function (xhr, status, error) {
                alert('Error occurred: ' + xhr);
//                console.log();
                }
            })
            .always(function (){
                // Sau khi thực hiện xong ajax thì ẩn hidden và cho trạng thái gửi ajax = false
                $loadding.addClass('hidden');
                is_busy = false;
            });
            return false;
        }
    });
});