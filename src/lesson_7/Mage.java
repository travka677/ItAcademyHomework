package lesson_7;

/**@author Daniil Kim
 * 2. Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero
 *    Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
 *    Протестировать создание героев различных классов и их атаки в классе TrainingGround.
 *
 *      Способность - накапливает ману и становится невидимым на 1 удар
 * */

public class Mage extends Hero {

    private static final int MAGE_DAMAGE = 5;
    private static final int ULT_TIME = 3;
    private int mana = 0;

    public Mage(String name, int heroHealth) {
        super(name, heroHealth);
    }


    @Override
    public void attackEnemy(Enemy enemy) {

        enemy.takeDamage(MAGE_DAMAGE);
        System.out.println("I am mage! My name is " + super.getName() + " and i am attacking the enemy!");
        mana++;
    }


    @Override
    public void takeDamageFromEnemy(int damage) {

        if (mana == ULT_TIME){
            System.out.println("Mage is invisible");
            mana = 0;
        } else {
            super.takeDamageFromEnemy(damage);
        }

    }
}
