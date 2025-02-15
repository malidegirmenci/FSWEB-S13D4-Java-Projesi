public class Player {
    private final String name;
    private int healthPercentage;
    private final Weapon weapon;

    private int checkValue(int value){
        return Math.min(value, 100);
    }
    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage =checkValue(healthPercentage);
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int healthRemaining(){
        return healthPercentage;
    }
    public void loseHealth(int damage){
        if(healthPercentage > damage){
            healthPercentage -= damage;
        }else {
            healthPercentage = 0;
        }
    }
    public void restoreHealth(int healthPotion){
        healthPercentage = checkValue(healthPercentage + healthPotion);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
