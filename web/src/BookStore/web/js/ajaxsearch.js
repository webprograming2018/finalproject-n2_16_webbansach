$(function () {
    $('#name').keyup(function () {
        var name = $("#name").val();
        $.ajax({
            type: "GET",
            url: "../SearchBook", //Tên servlet
            data: "name=" + name, //Gán giá trị vào name mục đich để servlet nhận được Parameter
            dataType: "json",
            success: function (result) {
                $table_search_result = $('#table_search_result');
                //Lấy size của list này
                var listSize = Object.keys(result).length;
                //Nếu List lấy từ Dao là null thì thông báo Not found và return
                if (result.check == "fail") {
                    $table_search_result.addClass('hidden');
                    return;
                } 
                //Nếu list tồn tại thì reset thông điệp cảnh báo về rỗng và loop dữ liệu hiển thị ra table
                if (listSize > 0) {
                    $table_search_result.removeClass('hidden');
                    //Khai báo table kiểu global để sử dụng ngoài fuction này
                    table = document.getElementById("row");
                    for (i = 0; i < listSize; i++) {
                        var row = table.insertRow(i);

                        var cell = row.insertCell(0);

                        cell.innerHTML = '<a href="bookdetail.jsp?bookID='+ result[i].id+'">'+result[i].name+'</a>';

                        // Thêm class vào tr
                        row.className += 'trOnColor';// class có tên trOnColor
                        // Thêm class vào td
                        cell.className += 'text-center'; // Class có tên text-center
                       

                    }
                }

            },
            error: function (xhr, status, error) {
//                alert('Error occurred: ' + xhr);
//                console.log();
            }
        });
    });
    //Reset table về trạng thái không có bản ghi nào
    $('#name').keyup(function () {
        var trLength = table.getElementsByTagName("tr").length;
        if (trLength > 0) {
            for (i = 0; i < trLength; i++) {
                table.deleteRow(0);
            }
            ;
        }
    });
});