package practice;

public class starDo {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        do {
            do {
                System.out.print("*");
                j++;
            }
            while (j < 10);
            j=0;
            i++;
            System.out.println("");
        }
        while (i < 10);


    }
}