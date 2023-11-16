public class Monster {
    private  String name;
    private int healthPercentage;
    private  Weapon weapon;

    private int checkValue(int value){
        return Math.min(value, 100);
    }

    public Monster(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage =checkValue(healthPercentage);
        this.weapon = weapon;
    }
    public int healthRemaining(){
        return healthPercentage;
    }
    public String getName() {
        return name;
    }
    public void loseHealth(int damage){
        if(healthPercentage > damage){
            healthPercentage -= damage;
        }else {
            System.out.println(name + " monster has been knocked out of game");
            healthPercentage = 0;
        }
    }
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
