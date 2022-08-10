import java.util.Scanner;

class Main {
    public static int numberDay(int year){
        int number;
        if (year % 400 == 0){
            number = 366;
        } else if (year % 100 == 0){
            number = 365;
        } else if (year % 4 == 0){
            number = 366;
        } else 
            number = 365;
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int result;
        while (true){
            System.out.println("Введите год в формате YYYY и количество дней в году");
            int year = scanner.nextInt();
            int number = scanner.nextInt();
            result = numberDay(year);
            if (number == result){
                count ++;
            } else 
            break;
        }
            System.out.println("Неправильно! В этом году " + result + "дней!");
            System.out.println ("Количество набранных очков: " + count);
    }
}
