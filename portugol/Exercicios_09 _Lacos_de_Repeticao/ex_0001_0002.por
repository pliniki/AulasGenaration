programa
{
	
/*1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/
    funcao inicio()
    {
      inteiro x

      escreva("digite um valo:")
      leia(x)

            enquanto(x <=100){
                x = x *3
                  escreva(" ", x , " ")
            }
    }

/*2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.*/
    funcao inicio()
    {
        real num1, num2, res
        escreva("Entre com o num1:")
        leia (num1)
        escreva("Entre com o num2:")
        leia (num2)

        enquanto (num1>num2){
        res= num1*num2
        escreva("\nMultiplicacao:",res)}   
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */