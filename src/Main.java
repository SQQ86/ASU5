import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =0;
        while (scan.hasNextLine()){ //
            String stop = scan.nextLine();
            if(stop.equals("")){
                break;
            } // проверяем и останавливаем ввод с консоли при пустой строке
            int b= Integer.parseInt(stop); // переводим в int строку
            a+=b;
        }
        System.out.println("Сумма введенных чисел = " + a);
    }
}
