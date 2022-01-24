programa
{
/*Faça um programa que crie um vetor por leitura com 5 valores de 
pontuação de uma atividade e o escreva em seguida. Encontre após 
a maior pontuação e a apresente. */

	Funcao inicio(){
        real pontuacao[5], maiorpontuacao=0.0
        inteiro x
        
         para(x=0;x<5;x++){
            escreva(" entre com a sua pontuação;")
            leia(pontuacao [x])
          se(maiorpontuacao<pontuacao[x]){
               maiorpontuacao=pontuacao[x]
          }
 	    }
           para(x=0;x<5;x++){
               escreva("\npontuação",x+1,":", pontuacao [x])
           }
            escreva("\nmaiorpontuacao foi de:",maiorpontuacao)
}


/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que 
gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima 
a média aritmética dos lançamentos, contabilize e apresente também quantas foram 
as ocorrências da maior pontuação.*/
programa{
    inclua biblioteca Util    --> u    
    
    funcao inicio()
    {
        inteiro dado[10], x, maiorvalor=0, contador=0
        real somatoria = 0.0, media=0.0
        

        para(x=0;x<=9;x++){
            dado[x] = u.sorteia(1,6)        
            escreva("\nLançamento [",x+1,"]: ",dado[x])
            
            se(maiorvalor<=dado[x]){
                maiorvalor = dado[x]                
            }            

            somatoria = somatoria+dado[x]            
        }    
        para(x=0;x<=9;x++){
            se(maiorvalor==dado[x]){
            contador++
            }
        }        
                
        media = somatoria/10
        
        escreva("\n\nO maior valor lançado no dado foi: ",maiorvalor)
        escreva("\n\nO número de vezes que o maior valor lançado apareceu é: ",contador)
        escreva("\n\nA média de todos os valores lançados é: ",media)
    }
}
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

programa{    
inclua biblioteca Util --> u
    funcao inicio(){   
    	   const inteiro linha = 5, coluna = 7, inicial = 1, final = 10
    }   inteiro N1[linha][coluna], N2[linha][coluna], l, c, M1[linha][coluna], M2[linha][coluna]
        
        para(l=0;l<linha;l++){
            para(c=0;c<coluna;c++){
             N1[l][c]= [u.sorteia(inicial,final)]                
            }
        }
        limpa()
        para(l=0;l<linha;l++){       
            para(c=0;c<coluna;c++){
            N2[l][c]= [u.sorteia(inicial,final)]    
            }
        }
        limpa()
        escreva("\nMatriz N1:")
        escreva("\n")
        para(l=0;l<linha;l++){            
            para(c=0;c<coluna;c++){
            escreva("[",N1[l][c],"]")                        
            }
            escreva("\n")
        }
        escreva("\nMatriz N2:")
        escreva("\n")
        para(l=0;l<linha;l++){
            para(c=0;c<coluna;c++){
            escreva("[",N2[l][c],"]")
            }
            escreva("\n")
        }
        para(l=0;l<linha;l++){
            para(c=0;c<coluna;c++){
            M1[l][c] = N1[l][c]+N2[l][c]     
            }

        escreva("\nMatriz M1:")
        escreva("\n")

        para(l=0;l<linha;l++){
            para(c=0;c<coluna;c++){
            escreva("[",M1[l][c],"]")                        
            }
            escreva("\n")
        }
        para(l=0;l<linha;l++){
            para(c=0;c<coluna;c++){
            M2[l][c] = N1[l][c]-N2[l][c]     
            }
        }
        escreva("\nMatriz M2:")
        escreva("\n")
        
        para(l=0;l<linha;l++){            
            para(c=0;c<coluna;c++){
            escreva("[",M2[l][c],"]")                        
            }
            escreva("\n")
        }
    }
}

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
ou seja, diagonal principal.*/
programa{
    funcao inicio(){
        inteiro linha=5, coluna=5, matriz[5][5], l, c, somatoria=0, diagonal

        para(l=0;l<linha;l++){            
            para(c=0;c<coluna;c++){
                escreva("Entre com um valor para a matriz: ")
                leia(matriz[l][c])    
                somatoria = somatoria+matriz[l][c]
            }
        }
        limpa()
        para(l=0;l<linha;l++){ 
            para(c=0;c<coluna;c++){
                escreva("[",matriz[l][c],"]")                        
            }
            escreva("\n")
        }
        diagonal = matriz[0][0]+matriz[1][1]+matriz[2][2]
        escreva("\nA somatória da diagonal da matriz é: ",diagonal)    
        escreva("\n\nA somatória de todos os valores da matriz é: ",somatoria)    

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 88; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */