public class atividade6 {
    public static void main(String[] args){

        int []v1= new int[]{1,2,3,4,5,6,7,8,9,10};
        int []v2= new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("Uniao do V1 e do V2");
        for(int i=0; i<10; i++){
            System.out.println(v1[i]);
            System.out.println(v2[i]);
        }
        System.out.println("Diferenca do V1 e do V2");
        for(int i=0; i<10; i++){
            System.out.println(v1[i]-v2[i]);
        }
        System.out.println("Soma do V1 e do V2");
        for(int i=0; i<10; i++){
            System.out.println(v1[i]+v2[i]);

        }

        System.out.println("Produto do V1 e do V2");
        for(int i=0; i<10; i++){
            System.out.println(v1[i]*v2[i]);
        }

        System.out.println("Interseccao do V1 e do V2");
        for(int i=0; i<10; i++){
            int elem = v1[i];
            for(int j=0; j<10; j++){
                if(elem == v2[j]){
                    System.out.println(elem);
                    break;} } }
    }
}

