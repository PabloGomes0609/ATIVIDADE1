public class atividade1 {
    public static void main(String[] args) {
        int v[] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int c = 0;

        System.out.println("numeros no vetor:");
        for (int i = 0; i < 20; i++) {

            System.out.println(+v[i]);

            if(v[i]%2==0){
                c++;

            }
        }
        System.out.println("numeros pares no vetor:"+c);

    }
}