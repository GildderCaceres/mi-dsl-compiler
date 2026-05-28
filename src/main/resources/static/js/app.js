async function compilar() {
    const codigo = document.getElementById("codigo").value;
    const resultado = document.getElementById("resultado");
    const mensajes = document.getElementById("mensajes");

    resultado.textContent = "";
    mensajes.innerHTML = "Compilando...";

    try {
        const response = await fetch("/api/compiler/compile", {
            method: "POST",
            headers: {
                "Content-Type": "text/plain"
            },
            body: codigo
        });

        const data = await response.json();

        if (data.exitoso) {
            resultado.textContent = data.jsonGenerado || "";
            mensajes.innerHTML = `
                <span class="msg-success">
                    Compilación realizada correctamente.
                </span>
            `;
        } else {
            resultado.textContent = "";
            mensajes.innerHTML = data.errores
                .map(error => `<div class="msg-error">${error}</div>`)
                .join("");
        }

    } catch (error) {
        mensajes.innerHTML = `
            <span class="msg-error">
                Error al conectar con el compilador.
            </span>
        `;
    }
}

function limpiar() {
    document.getElementById("codigo").value = "";
    document.getElementById("resultado").textContent = "";
    document.getElementById("mensajes").innerHTML = "";
}