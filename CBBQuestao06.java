import java.util.Scanner;

public class CBBQuestao06 {
    public static void main(String[] args) {
        int maior = 0;
        int[] numeros = new int[10];
        for (int x = 0; x < 10; x++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe um numero: ");
            numeros[x] = entrada.nextInt();
            if(numeros[x] > maior){
                maior = numeros[x];
            }
        }

        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.printf("O maior número informado foi: %d", maior);
    }
}
