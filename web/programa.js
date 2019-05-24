class Chocotorta {

    static main() {
        document.querySelector("#enviarBtn").setAttribute("onclick", "Chocotorta.enviar();");
        document.querySelector("#consultarBtn").setAttribute("onclick", "Chocotorta.consultar();");

    }

    static consultar() {
        fetch("PostChocotorta", {
            method: "GET"
        });

    }
    static enviar() {
        let miChocotorta = {};
        miChocotorta.nombre = document.querySelector("#nombre").value;
        miChocotorta.precio = document.querySelector("#precio").value;


        let miChocotortaJson = JSON.stringify(miChocotorta);
        fetch("PostChocotorta", {
            method: "POST",
            body: miChocotortaJson
        });


    }
}
Chocotorta.main();





