public class CBBAtividadePratica3 {
    /*Implemente e execute no NetBeans uma classe que construa um array
    com capacidade de armazenar 100 inteiros; inicialize então cada elemento
    do array com os números de 0 até 99 e imprima-os por meio de uma estrutura for
    como já foi exemplifi cado, mas em vez de definir explicitamente o intervalo do looping,
    utilize o atributo lenght do array para definir seu tamanho */
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}
