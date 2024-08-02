

const mostrar = (elemento, id) => {
    let elementoTexto = document.getElementById(id)
    let texto = elementoTexto.innerText;
    elementoTexto.style.display = "block";
    elementoTexto.innerText = "";
    let parar = false;
    console.log(this);
    elemento.onclick=null;
    elemento.innerText = "Parar";
    elemento.addEventListener("click", () => { parar = true });

    let i = 0;
    let intervalo = setInterval(() => {
        elementoTexto.innerText = texto.substr(0, i);
        i++;
        if (i > texto.length) {
            clearInterval(intervalo);
        }
        if (parar) {
            clearInterval(intervalo);
        }
    }, 100);
}

