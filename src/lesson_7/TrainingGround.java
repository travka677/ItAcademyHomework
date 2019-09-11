package lesson_7;

public class TrainingGround {
    public static void main(String[] args) {

        Hero warrior = new Warrior("Ted", 70, 30);
        Enemy zombie = new Zombie("Zombak", 60);
        zombie.attackHero(warrior);


    }
}
