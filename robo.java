import java.util.Scanner;

public class robo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt(); 
        int pos = 1;
        int local = 0;

        for (int i = 0; i < y; ++i) {
            if (pos == z) {
                local++;
            }S

            pos += in.nextInt();
            if (pos > x) {
                pos = 1;
            } else if (pos == 0) {
                pos = x;
            }
        }
        if (pos == z) {
            local++;
        }

        System.out.println(local);
        in.close(); 
            }
}
