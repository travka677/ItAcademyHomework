package lesson_7;

/**@author Daniil Kim
 * 2. Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero
 *    Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
 *    Протестировать создание героев различных классов и их атаки в классе TrainingGround.
 *
 *
 *   class Warrior(наследник Hero)
 *
 *   Способность - имеет шит. Противник должен разрущить щит, прежде чем нанесет реальный урон
 *   С щитом урон  warrior  меньше
 *
 * */

public class Warrior extends Hero{

    private static final int WARRIOR_DAMAGE = 6;
    private static final int DAMAGE_WITH_SHIELD = 3;
    private int shield;


    public Warrior(String name, int heroHealth, int shield){
        super(name, heroHealth);
        this.shield = shield;
    }


    @Override
    public void attackEnemy(Enemy enemy){

        if (shield > 0){
            enemy.takeDamage(DAMAGE_WITH_SHIELD);
            System.out.println("I am warrior! My name is " + super.getName() + " and i am attacking the enemy! (Shield state: " + shield+")");
        } else if (shield <= 0){
            enemy.takeDamage(WARRIOR_DAMAGE);
            System.out.println("I am warrior! My name is " + super.getName() + " and i am attacking the enemy! (Shield is broken)");
        }

    }


    @Override
    public void takeDamageFromEnemy(int damage) {

        if (shield > 0){
            shield -= damage;
        } else {
            super.takeDamageFromEnemy(damage);
        }

    }
}
