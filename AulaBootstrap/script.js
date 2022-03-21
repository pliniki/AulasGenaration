var nome = window.document.querySelector('#nome')
var okNome = false
function validarNome() {
  let txtNome = document.getElementById('#txtNome')
  if (nome.value.length < 2) {
    txtNome.innerHTML = 'nome invalido'
    txtNome.style.color = 'red'
    okNome = false
  } else {
    txtNome.innerHTML = 'deu bom'
    txtNome.style.color = 'blue'
    okNome = true
  }
}

function enviar() {
  if (okNome == true) {
    alert('mensagem enviada com sucesso!')
  } else {
    alert('preencha corretamente!')
  }
}
