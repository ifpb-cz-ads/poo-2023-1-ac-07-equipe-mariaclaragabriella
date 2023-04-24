public class CBBAtividadePratica2 {
    /* Implemente e execute uma nova classe que construa um array com capacidade de armazenar 100 inteiros, 
    mas dessa vez inicialize cada elemento do array com os números de 1 até 100 e imprima-os por meio de uma
    estrutura for, conforme foi exemplificado */
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }
    }
}
