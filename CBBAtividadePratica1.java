public class CBBAtividadePratica1 {
    /* implemente e execute uma classe que construa
    um array com capacidade de armazenar 100 inteiros. Inicialize então cada
    elemento do array com os números de 0 até 99 e imprima-os por intermédio de uma
    estrutura for, como foi exemplificado */
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}
