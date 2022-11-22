public class Application {
    public static void main(String args[]){
        SoldierInfoCollector soldierInfoCollector = new SoldierInfoCollector();
      Soldier soldier = soldierInfoCollector.collectInfo();

        soliderChecker soliderChecker = new soliderChecker();
        soliderChecker.check(soldier);

    }
}
