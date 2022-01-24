programa
{

 /*
 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
 * trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável 
 * E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do 
 * processamento imprimir o salário total e o salário excedente.
*/
	
	funcao inicio(){
        real C, N, E, Salario
        caracter s, n

        escreva("Codigo do operario         ")
        leia(C)
        escreva("Horas de trabalho         ")
        leia(N)

        E= N-50

        se (N >    50) {escreva ("Horas excedidas\n",     E)}
        senao{
         escreva("0\n         ")}

        escreva("\nDeseja imprimir seu saldo?[s] = sim [n] = nao\n")
        leia(s)
        
        se (s == s){escreva("Salario         ", N*10, "\nValor excedente         ", E*20)}
        
        senao{
         escreva("Obrigado por nos consultar")

        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */