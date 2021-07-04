$("#login").click(function (){
    $.post("lc",{"correo":$("#correo").val(), "password":$("#password").val()},function (data) {
        alert(data);
    });
});

