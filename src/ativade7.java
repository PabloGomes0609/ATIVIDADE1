import java.util.Scanner;
public class ClasseScanner {
    public class atividade7 {
        public static void main(String[] args) {

            int []v=new int[10];

            String str;

            Scanner str = new Scanner(System.in);

            int n;
            int in = -1;

            do {
                System.out.println("Digite um numero:");
                n= str.nextLine();

                in = -1;

                if (n > 0) {
                    for (int i = 0; i < 10; i++) {
                        if (n == v[i]) {
                            in = i;
                            break;
                        }
                    }
                    if (in >= 0) {
                        System.out.println("O numero esta no vetor na posicao:", +in);
                    }
                    }
                }
             while (n >= 0);
        }}}