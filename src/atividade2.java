public class atividade2 {
    public static void main(String[] args){

        int [] vt1= new int[]{1,2,3,4,5,6,7,8,9,10};
        int [] vt2= new int[]{1,2,3,4,5,6,7,8,9,10};
        int [] vt3= new int[10];

        for(int i=0;i<10; i++ ){

            vt3[i]=vt1[i]*vt2[i];

            System.out.println(vt1[i]+ "x" + vt2[i]+"="+vt3[i]);

        }



    }






}
