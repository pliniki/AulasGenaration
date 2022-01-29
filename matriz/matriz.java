public class MATRIX {

  public static void main(System[] args) {
    // Faça um programa que receba três inteiros e diga qual deles é o maior.

    Scanner read = new Scanner(System.in);
    int[] numero = new int[2];
    int maior = 0;
    for (int i = 0; i < 2; i++) {
      System.out.println("digite o valor :");
      numero[i] = read.nextInt();
    }
    for (int i = 0; i < numero.length; i++) {
      if (maior < numero[i]) {
        maior = numero[i];
      }
      System.out.println("Maior valor: " + maior);
    }
  }
}