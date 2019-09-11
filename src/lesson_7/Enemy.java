package lesson_7;

/**
 * @author Daniil Kim
 * 3. Создать класс Enemy, представляющий собой врага и содержащий поле health (количество здоровья).
 *    Добавить конструктор, принимающий количество здоровья, а также сеттер и геттер.
 *    Добавить метод takeDamage(int damage), который уменьшает количество здоровья в соответствии с полученным уроном.
 *
 *  Переписать метод attackEnemy класса Hero, добавив ему параметр типа Enemy.
    Метод должен вызывать у врага метод takeDamage и передавать в него определённое количество урона.
    Переопределить метод в подклассах Warrior, Mage и Archer так, чтобы каждый герой наносил врагу разное количество урона.

    5. Создать интерфейс Mortal, содержащий метод isAlive().
    Сделать так, чтобы класс Enemy реализовывал интерфейс Mortal. 
    Определить метод isAlive в классе Enemy так, чтобы тот возвращал true, если количество здоровья врага больше 0.

    7. Добавить герою показатель здоровья и возможность погибнуть.
       Добавить возможность врагу атаковать героя в ответ.
       Создать несколько видов врагов (наследников класса Enemy) с разными способностями
       (например, Zombie - имеет шанс воскреснуть при гибели)
       Дать героям уникальные способности.
       Продемонстрировать сражение героя с несколькими соперниками.
 * */


public abstract class Enemy implements Mortal{

    private int enemyHealth;
    private String enemyName;

    public Enemy(String enemyName, int health){
        this.enemyName = enemyName;
        this.enemyHealth = health;
    }

    public void setHealth(int health) {
        this.enemyHealth = health;
    }
    public int getEnemyHealth() {
        return enemyHealth;
    }
    public String getEnemyName(){
        return enemyName;
    }


    public void takeDamage(int damage){
        enemyHealth -= damage;
    }

    public abstract void attackHero(Hero hero);

    public boolean isAlive(){

        if (enemyHealth <= 0){
            return false;
        }
        return true;
    }
}
