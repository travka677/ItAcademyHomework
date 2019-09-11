package lesson_7;
import java.util.Random;

/**@author Daniil Kim
 * 7. Добавить герою показатель здоровья и возможность погибнуть.
 *    Добавить возможность врагу атаковать героя в ответ.
 *    Создать несколько видов врагов (наследников класса Enemy) с разными способностями
 *    (например, Zombie - имеет шанс воскреснуть при гибели)
 *    Дать героям уникальные способности.
 *    Продемонстрировать сражение героя с несколькими соперниками.
 * */

public class Zombie extends Enemy{

    private static final int ZOMBIE_DAMAGE = 4;
    private static final int RISING_HEALTH = 30;

    public Zombie(String zombieName, int zombieHealth) {
        super(zombieName, zombieHealth);
    }


    public void attackHero(Hero hero){
        System.out.println("I am " + super.getEnemyName() + " and i am attacking the hero");
        hero.takeDamageFromEnemy(ZOMBIE_DAMAGE);
    }

    // восстание из мертвых

    public boolean rising(){

        Random random = new Random();

        if (random.nextInt(2) == 1){
            setHealth(RISING_HEALTH);
            System.out.println("Oh no! Zombie is rising! Zombie heath: " + getEnemyHealth()+ "\n");
            return true;
        }
        return false;
    }


    @Override
    public boolean isAlive() {

        int enemyHealth = getEnemyHealth();
        if (enemyHealth > 0){
            return true;
        }
        if (enemyHealth <= 0){
            return rising();
        }
        return false;
    }
}
