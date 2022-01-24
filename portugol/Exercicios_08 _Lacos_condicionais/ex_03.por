programa
{
/*
3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/	
	funcao inicio(){
        
        real N1, N2, N3, N4, Q1, Q2, Q3, Q4

        escreva("Numero a elevar ao quadrado: ")
        leia(N1)
        escreva("Numero a elevar ao quadrado: ")
        leia(N2)
        escreva("Numero a elevar ao quadrado: ")
        leia(N3)
        escreva("Numero a elevar ao quadrado: ")
        leia(N4)

        Q1 = N1*N1
        Q2 = N2*N4
        Q3 = N3*N4
        Q4 = N4*N4
        
        se (Q1 >=1000) {escreva ("Imprimir e finalizar")}
        senao{escreva("Quadrado: ", Q1,",", Q2,",", Q3,",", Q4, "\nvalores: ", N1, ",",N2,",", N3, ",",N4)}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 857; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */