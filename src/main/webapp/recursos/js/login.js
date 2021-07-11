$(document).ready(function (){
    eliminar();
});
function  eliminar(){
    localStorage.removeItem("idusuario");
    localStorage.removeItem("username");
}

$("#login").click(function () {
    $.ajax({
        method: "POST",
        url: "lc",
         data: {"correo": $("#correo").val(), "password": $("#password").val()}
    }).done(function (datos) {     
       var d = JSON.parse(datos);
       localStorage.setItem("idusuario", d.idusuario);
       localStorage.setItem("username", d.username);
        window.location="http://localhost:9092/clase04-07-21/main.jsp";
    });
});

