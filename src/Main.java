import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* Point Class Using
            Point first = new Point(6, 5);
            Point second = new Point(3, 1);
            System.out.println("distance(0,0)= " + first.distance());

            System.out.println("distance(second)= " + first.distance(second));

            System.out.println("distance(2,2)= " + first.distance(2, 2));

            Point point = new Point(0,0);

            System.out.println("distance()= " + point.distance());

         */

        /* Player Class Using
            Player player1 = new Player("Johnny", 120, Weapon.DAGGER);
            System.out.println(player1.toString());
            player1.loseHealth(20);
            System.out.println(player1.healthRemaining());
            player1.restoreHealth(30);
            System.out.println(player1.healthRemaining());

         */

        Random rand = new Random();



        Player player1 = new Player("Johnny", 120, Weapon.DAGGER);
        System.out.println(player1.toString());
        Monster monster1 = new Monster("Red Nose Bandit", 120, Weapon.BOW);
        System.out.println(monster1.toString());
        int i = 1;
        while(!(player1.healthRemaining() == 0 || monster1.healthRemaining() == 0)){
            System.out.println("$$$ Round "+i+" $$$");
            int randAttackToM = rand.nextInt(50);
            int randAttackToP = rand.nextInt(50);
            if(!(monster1.healthRemaining() == 0)){
                monster1.loseHealth(randAttackToM);
                System.out.println(player1.getName() + " damaged to monster by " + randAttackToM);
            }
            if(!(player1.healthRemaining() == 0)){
                player1.loseHealth(randAttackToP);
                System.out.println(monster1.getName() + " damaged to player by "+randAttackToP);
            }

            System.out.println("Player Health: "+ player1.healthRemaining());
            System.out.println("Monster Health: "+ monster1.healthRemaining());
            i++;
            System.out.println("*************************************************************");
        }
        if(player1.healthRemaining() == 0){
            System.out.println("Winner " + monster1.getName());
        }else if(monster1.healthRemaining() == 0){
            System.out.println("Winner " + player1.getName());
        }
    }
}