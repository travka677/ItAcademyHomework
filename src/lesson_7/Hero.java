package lesson_7;

/**
 * @author Daniil Kim
 * 1. Создать класс Hero, представляющий собой героя и содержащий поле name.
 *    Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
 *    Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
 *    Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его атаку.  
 *
 *    7*. Добавить герою показатель здоровья и возможность погибнуть.
 *    Добавить возможность врагу атаковать героя в ответ.
 *    Создать несколько видов врагов (наследников класса Enemy) с разными способностями
 *    (например, Zombie - имеет шанс воскреснуть при гибели)
 *    Дать героям уникальные способности.
 *    Продемонстрировать сражение героя с несколькими соперниками.
 * */


public abstract class Hero implements Mortal{

    private String name;
    private int heroHealth;

    public Hero(String name, int heroHealth){
        this.name = name;
        this.heroHealth = heroHealth;
    }

    public String getName() {
        return name;
    }
    public  int getHeroHealth(){
        return heroHealth;
    }


    public abstract void attackEnemy(Enemy enemy);


    public void takeDamageFromEnemy(int damage){
        heroHealth -= damage;
    }

    @Override
    public boolean isAlive() {
        if (heroHealth <= 0){
            return false;
        }
        return true;
    }
}
