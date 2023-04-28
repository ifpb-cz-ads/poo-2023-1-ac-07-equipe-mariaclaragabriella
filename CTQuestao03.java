import java.util.Scanner;

public class CTQuestao03{
    /* Crie um programa que armazene um vetor com as notas de dez alunos,
       calcule e imprima a média dessas notas e depois informe a quantidade
       de notas acima e abaixo da média calculada. */ 

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0, acima = 0, abaixo = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Informe um valor: ");
            numeros[i] = ler.nextInt();
            soma += numeros[i];
        }
        double media = (double) soma/(numeros.length);
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>media) acima++;
            else if(numeros[i]<media) abaixo++;
        }
        System.out.println("Média: " + media);
        System.out.println("Quantidade de notas acima da média: " + acima);
        System.out.println("Quantidade de notas abaixo da média: " + abaixo);
    }
}