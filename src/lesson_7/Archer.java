package lesson_7;

/**@author Daniil Kim
 * 2. Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero
 *    Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
 *    Протестировать создание героев различных классов и их атаки в классе TrainingGround.
 *
 *
 *     Способность - накапливает ману и ультует(наносит огромный урон) после определенного количества ударов
 * */

public class Archer extends Hero {

    private static final int ARCHER_DAMAGE = 5;
    private static final int ULTA = 20;
    private static final int ULT_TIME = 3;
    private int mana = 0;

    public Archer(String name, int heroHealth){
        super(name, heroHealth);
    }


    @Override
    public void attackEnemy(Enemy enemy){

        if (mana == ULT_TIME){
            enemy.takeDamage(ULTA);
            mana = 0;
            System.out.println("I am archer! My name is " + super.getName() + " and i am attacking the enemy! ULTA!");
        } else {
            System.out.println("I am archer! My name is " + super.getName() + " and i am attacking the enemy!");
            enemy.takeDamage(ARCHER_DAMAGE);
        }

        mana++;
    }

}
