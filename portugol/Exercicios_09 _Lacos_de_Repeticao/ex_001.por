programa
{
/*
1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
*/    
    funcao inicio(){
    	real numero, somanumero ,somatotal
     real media, contaentradas=1.0, medianumero
     escreva(" vDigite os números para somar, ou zero para parar: ")
     leia(numero)
     somanumero = numero

    enquanto(numero >= 0){
     contaentradas++
     somanumero = somanumero + numero
     media = somanumero / contaentradas
     escreva(" vDigite os números para somar, ou zero para parar: ")
     leia(numero)
     escreva("\ntotal: ",somanumero)
     escreva("\nTotal de numeros ", contaentradas, "entradas")
     escreva("\nmedia total:" , media)
      }        
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */