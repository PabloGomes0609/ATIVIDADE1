public class atividade4 {
    public static void main(String[] args){

        int []v= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int aux=0;
        int i=0;

        for(i=0; i<20; i++){
            System.out.println("Vetor:"+v[i]);
        }

        for(i=0; i<10; i++){
            aux = v[i];
            v[i] = v[19-i];
            v[19-i] = aux;
        }

        for(i=0; i<20; i++){
            System.out.println("Vetor trocado:"+v[i]);


        }


    }
}
