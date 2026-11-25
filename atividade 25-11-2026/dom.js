const campoNome = document.getElementById("nome");
const botao = document.getElementById("enviar");
const mensagem = document.getElementById("mensagem");
const limpar = document.getElementById("limpar")


function bemVindo(){
    const nome = campoNome.value;

    if(nome===""){
        mensagem.textContent = "digite um nome valído!";
        mensagem.style.color = "red";
    }else{
        mensagem.textContent = "Bem-vindo(a), "+nome+ "!";
        mensagem.style.color = "green"; 
    }

}


function Limpar(){
   
        mensagem.textContent = ""
        campoNome.value = ""
}


botao.addEventListener("click", bemVindo)
limpar.addEventListener("click", Limpar)