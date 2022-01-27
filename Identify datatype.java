import java.util.Scanner;

public class udf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String IP = scan.next();
            if (IP.matches("\\d*")) {
                System.out.println("Integer");

            } else if (IP.matches( "\\d{4}-\\d{2}-\\d{2}")) {
                System.out.println("Date");
            }
            else if (IP.matches( "\\d+\\.\\d+")){
                System.out.println("Float");
            }
             else {
                System.out.println("String");
            }
            }

        }

    }
