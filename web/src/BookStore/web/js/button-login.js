window.onscroll = function () {
    scrollFunction()
};

function scrollFunction() {
    if (document.documentElement.scrollTop > 35 || document.body.scrollTop > 35) {
        document.getElementById('sticky-button').style.display = 'block';
    } else {
        document.getElementById('sticky-button').style.display = 'none';
    }
}