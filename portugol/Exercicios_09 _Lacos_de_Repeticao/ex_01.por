programa
{
/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
*/
    inclua biblioteca Matematica
    funcao inicio()
    {
        real salario[3], filhos[3], mediaF, mediaS, somaS, somaF, maiorS
        inteiro cont

        para(cont=0; cont<3 ; cont++ ){
            escreva ("Qual o seu salario?\n ")
            leia(salario[cont])
            limpa()                        
            }
            somaS=salario[0]+salario[1]+salario[2]/*+salario[3]+salario[4]+salario[5]+salario[6]+salario[7]+salario[8]+salario[9]+salario[10]+salario[11]+salario[12]+salario[13]+salario[14]+salario[15]+salario[16]+salario[17]+salario[18]+salario[19]*/
            escreva("Total de Salarios: ",somaS)
            mediaS = somaS/3
            escreva("\nMedia Salarial: ", mediaS,"\n")
            escreva("Maior salario: ")
            limpa()            
            
        para(cont=0 ; cont<3 ; cont++ ){
            escreva("Numero de filhos: ")
            leia(filhos[cont])
            limpa()
            }
            somaF=filhos[0]+filhos[1]+filhos[2]/*+filhos[3]+filhos[4]+filhos[5]+filhos[6]+filhos[7]+filhos[8]+filhos[9]+filhos[10]+filhos[11]+filhos[12]+filhos[13]+filhos[14]+filhos[15]+filhos[16]+filhos[17]+filhos[18]+filhos[19]*/
            escreva("Total de Salarios: ",somaS)
            
            mediaF = somaF/3
            escreva("\nMedia de filhos: ", mediaF,"\n")    
            limpa()        
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1677; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */