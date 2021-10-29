import java.util.Scanner;

public class Cigarettes {
    public static void main(String[] args) {
        String welcome = "Добро пожаловать в наш магазин!";
        System.out.println(welcome);
        ageCheck();
    }

    public static void ageCheck() {
        String offer = "Попробуйте наши новые солевые жижки со вкусом арбуза и тархуна!";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Подтвердите, что вам есть 18 лет.");
        String confirmation = scanner.nextLine();
        if (confirmation.equals("yes")) {
            System.out.println(offer);
        } else System.out.println("Простите, мы не можем продавать никотиносодержащие товары лицам младше 18 лет:(");
    }

}
