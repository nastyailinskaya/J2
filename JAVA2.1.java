import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            {
                System.out.println("Введите дату в формате dd/mm/yyyy:");
                String date = scanner.nextLine();

                Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.]\\d\\d\\d\\d");
                Matcher matcher = pattern.matcher(date);
                if ( matcher.matches() == true){
                    System.out.println("Введенное выражение является датой");
                }else{
                    System.out.println("Введенное выражение не является датой");
                }


            }
        }
    }
}