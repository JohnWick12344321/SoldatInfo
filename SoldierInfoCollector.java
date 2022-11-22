import java.util.Scanner;

public class SoldierInfoCollector {

     Soldier collectInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String fio = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.print("Введите количество детей: ");
        int children =scanner.nextInt();
        System.out.print("Введите категорию годности: ");
        String KatGodString = scanner.nextLine();
        char KatGod = KatGodString.charAt(0);
        System.out.println(Soldier.KatGod);
        return new Soldier(age,fio,children,KatGod);

    }

}
