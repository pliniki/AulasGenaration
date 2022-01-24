programa
{
/*
5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos 
de indústrias que são altamente poluentes do meio ambiente. O índice de poluição 
aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo 
são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias 
do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 
todos os grupos devem ser notificados a paralisarem suas atividades. Faça um sistema que 
leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
*/
	
	inclua biblioteca Matematica --> mat
 	funcao inicio() {

            cadeia nome
            real g1, g2, g3, media

            escreva("indice de poluicao do Grupo 1 ")
            leia(g1)
            escreva("indice de poluicao do Grupo 2 ")
            leia(g2)
            escreva("indice de poluicao do Grupo 3 ")
            leia(g3)

            media = (g1+g2+g3)/3

            escreva("Media: ", media)

            se (media<0.3){ escreva ("\nIndice de poluicao dentro do aceitavel")}
            senao se (media >=0.3 e media<0.4)
            {escreva ("\nIndustrias do setor 1, devem paralizar as operacoes.")}
            senao se (media >=0.4 e media<0.5)
            {escreva ("\nIndustrias do setor 1 e 2, devem paralizar as operacoes.")}
            senao
             {escreva ("\nIndustrias do setor 1, 2 e 3, devem paralizar as operacoes.")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */