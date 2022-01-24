programa
{
/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se 
este número é par ou ímpar, e se é positivo ou negativo.
*/
 inclua biblioteca Matematica --> mat
    
        funcao inicio(){
        inteiro P, I, N

        escreva("Escreva um numero inteiro\n")
        leia(N)

        se
        (N>=0){escreva ("Numero Positivo / ")}
        
        senao {escreva ("Numero Negativo / ")}

        se (N % 2 == 1) {escreva ("Numero Impar ")}    
        senao {escreva ("Numero Par ")}    
        }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 228; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */