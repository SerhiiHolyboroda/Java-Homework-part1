import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task56 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, x, y;
        System.out.println("введіть а");
       a = Integer.parseInt(br.readLine());
        System.out.println("введіть b");
        b = Integer.parseInt(br.readLine());
        System.out.println("введіть с");
        c = Integer.parseInt(br.readLine());
        System.out.println("введіть x");
         x = Integer.parseInt(br.readLine());
        System.out.println("введіть y");
         y = Integer.parseInt(br.readLine());

        if ((x>=a) && (x>=b) && (x>=c) || (y>=a) && (y>=b) && (y>=c)) {
            System.out.println("Цеглина пройде!");
        }
    else System.out.println("не пролізе(((");
    }
    }
