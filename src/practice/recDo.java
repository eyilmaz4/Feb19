package practice;

public class recDo {
    public static void main(String[] args) {
       int i=0;
       int j=0;
        do {
            j=0;
            do {
                System.out.println("*");
                j++;
            }while(j<20);
            System.out.println("");
            i++;
        }while(i<10);
    }
}
