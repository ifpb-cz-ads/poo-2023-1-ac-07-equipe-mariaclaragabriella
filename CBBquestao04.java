public class CBBquestao04 {
    /*
    Implemente e execute no NetBeans uma nova classe semelhante à da
    Atividade 1, mas desta vez modifi que os parâmetros da estrutura for
    para forçar a saída de um erro no sistema, forçando o lançamento de uma Exception
    (vide caixa de ênfase anterior)
     */
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i <= 100; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}

