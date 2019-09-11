package lesson_7;

/**@author Daniil Kim
 *
 * class Berserk(наследник Enemy)
 *
 * Способность - при низком показателе здоровья впадает в ярость и начинает наносить больше урона
 *
 * */

public class Berserk extends Enemy {

    public static final int BERSERK_DAMAGE = 6;
    public static final int FURY_DAMAGE = 10;


    public Berserk(String name, int berserkHealth){
        super(name, berserkHealth);
    }


    @Override
    public void attackHero(Hero hero) {

        int berserkHealth = getEnemyHealth();
        int indicator = 30;

        if (berserkHealth >= indicator) {
            System.out.println("I am " + super.getEnemyName() + " and i am attacking the hero");
            hero.takeDamageFromEnemy(BERSERK_DAMAGE);
        }

        if (berserkHealth < indicator){
            System.out.println("I am " + super.getEnemyName() + " and i am attacking the hero with FURY!");
            hero.takeDamageFromEnemy(FURY_DAMAGE);
        }
    }
}
