public class CBBQuestao05 {
    public static void main(String[] args) {
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        int x =0;
        System.out.println("While:\n" );
        while(x < dias.length){
            System.out.println(dias[x]);
            x++;
        }

        System.out.println("Do while:\n ");

        x = 0;
        do {
            System.out.println(dias[x]);
            x++;
        }while (x < dias.length);

        System.out.println("For:\n ");

        for (int i = 0; i<dias.length; i++){
            System.out.println(dias[i]);
        }
    }
}
