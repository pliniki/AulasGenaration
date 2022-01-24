programa
{
/*
7) Receber valores de base e altura de um triângulo e verificar se 
são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/
	inclua biblioteca Matematica --> mat
	funcao inicio() {

            real base, altura, area

            escreva("Base do Triangulo: ")
            leia(base)
            escreva("Altura do Triangulo: ")
            leia(altura)

            area = base*altura/2

            se (area<=0){ escreva ("A = negativo\n")}
            senao {escreva("A = positivo / Area = ", area)}         
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */