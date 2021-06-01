public class atividade3 {
public static void main(String [] args){

        int [] v= new int[]{3,4,5,6,1,2,7,8,9,10};
        int menor=15252545;
        int ind=58544454;

    for(int i=0; i<10; i++){
        if(v[i]<menor){
            menor = v[i];
            ind = i;
        }
    }
            System.out.println("menor elemento: "+menor);
            System.out.println("sua posição: "+ind);
}
}
