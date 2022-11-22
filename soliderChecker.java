public class soliderChecker {
    public boolean check(Soldier soldier) {
        if (soldier.age > 18 || soldier.age < 30 && soldier.Children < 3) {
            System.out.println("Первый эшелон");
            return true;
        } else if (soldier.age > 30 || soldier.age < 45 && soldier.Children == 3 || soldier.Children < 4) {
            System.out.println("Второй эшелон");
            return true;
        } else {
            System.out.println("Третий эшешлон");
            return false;
        }

    }
}
