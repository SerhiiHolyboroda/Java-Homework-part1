import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task88 {

        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please, enter your number");

           int number =  Integer.parseInt(br.readLine());
//           p1  if 3 is in n^2
            System.out.println("Task 1");
           String  NSquare = Integer.toString(number* number);
            String  n = Integer.toString(number);

            if( NSquare.indexOf('3') >= 0 ){
                System.out.println("3 exist in n^2");
            }else {
                System.out.println("False");
            }


//           p2 change all leters in reverse
            System.out.println("Task 2");
            String result = "";
            System.out.println("Original n"+ " " + n);
            for(int i = 0; i < n.length(); i++ ){

               result = n.charAt(i) + result;
                System.out.println(result);

            }

//          p3 change first and last letters
            System.out.println("Task 3");

            char firstCahracter = n.charAt(0);

            char lastCahracter =n.charAt(n.length()-1);

//

            StringBuilder N_To_Replace = new StringBuilder(n);
            System.out.println(N_To_Replace);
             N_To_Replace.setCharAt(0,   lastCahracter);

            N_To_Replace.setCharAt(n.length()-1, firstCahracter);
            System.out.println("Original n" + " " + n);
            System.out.println("Replaced n" + " " + N_To_Replace);
//          p4 change first and last letters
            System.out.println("Task 4");
            String Adding1  = n;
            System.out.println("Original " + " " + Adding1);
            Integer.parseInt(Adding1);
              Adding1 = "1" + Adding1 + "1";
            System.out.println("Adding 1 " + " " +  Adding1);


    }

}
