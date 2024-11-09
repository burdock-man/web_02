$(function() {

    // ============================================================================================
    // 내비
    // ============================================================================================

    var navSpan = $("#navBar .listWrap div span");
    var navLi = $("#navBar .listWrap div.on li");
    var navBar = $("#navBar");

    navSpan.mouseenter(function() {
        navSpan.removeClass("on");
        $(this).addClass("on");
    });

    navBar.mouseleave(function() {
        navSpan.removeClass("on");
    });









});