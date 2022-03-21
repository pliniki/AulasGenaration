/*
Case Sensitive: Reconhece letras, maiusculas e minusculas

Por tag: getElementByTagName()
Por ID: getElementById()
Por NOme: getElementsByName()
Por Classe: getElementsByClassName()
Por Seletor: querySelector()
*/

//Variaveis
let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false
let mapa = document.querySelector('#mapa')

nome.style.width = '100%'
email.style.width = '100%'
assunto.style.width = '100%'

//Validador de Nome do forms
function validarNome() {
  let txtNome = document.querySelector('#txtNome')
  if (nome.value.length < 3) {
    txtNome.innerHTML = 'Nome invalido'
    txtNome.style.color = 'red'
    nomeOk = false
  } else {
    txtNome.innerHTML = 'Nome valido'
    txtNome.style.color = 'blue'
    nomeOk = true
  }
}

//Validador de Email do forms
function validarEmail() {
  let txtEmail = document.querySelector('#txtEmail')
  if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
    txtEmail.innerHTML = 'Email invalido'
    txtEmail.style.color = 'red'
  } else {
    txtEmail.innerHTML = 'Email valido'
    txtEmail.style.color = 'blue'
    emailOk = true
  }
}

//Validador de Assunto do forms
function validarAssunto() {
  let txtAssunto = document.querySelector('#txtAssunto')
  if (assunto.value.length > 100) {
    txtAssunto.innerHTML =
      'Texto muito grande, digite no maximo 100 caracteres.'
    txtAssunto.style.color = 'red'
  } else {
    txtAssunto.innerHTML = ''
    assuntoOk = true
  }
}

//Enviar Formulario
function enviar() {
  if (nomeOk == true && emailOk == true && assuntoOk == true) {
    alert('Formulario enviado com sucesso!')
  } else {
    alert('Preencha o formulario corretamente!')
  }
}

//Zoom no Mapa

function mapaZoom() {
  mapa.style.width = '800px'
  mapa.style.height = '600px'
}

function mapaNormal() {
  mapa.style.width = '400px'
  mapa.style.height = '250px'
}
