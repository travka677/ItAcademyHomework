package lesson_7;

/**
 * @author Daniil Kim
 * 6. Создать класс BattleGround с методом main, в котором создать симуляцию героя, атакующего врага.
 *
 * Продемонстрировать сражение героя с несколькими соперниками.
 *
 * */

public class BattleGround {
    public static void main(String[] args) {

        Enemy zombie = new Zombie("Zombak", 50);
        Enemy berserk = new Berserk("Berserk", 80);
        Hero warrior = new Warrior("Ted", 110, 30);
        Hero mage = new Mage("Harry Potter", 80);
        Hero archer = new Archer("Legolas", 60);


        Enemy[] enemies = {berserk, zombie};
        Hero[] heroes = {archer, warrior};


        //heroesVsEnemies(heroes, enemies);  // герои против злодеев

        enemyVsHero(berserk, archer); // один на один
    }



    public static void enemyVsHero(Enemy enemy, Hero hero) {

        while (enemy.isAlive() && hero.isAlive()){

            hero.attackEnemy(enemy);
            enemy.attackHero(hero);

            System.out.println("Hero's health: " + hero.getHeroHealth());
            System.out.println("Enemy's health:" + enemy.getEnemyHealth() + "\n");
        }
    }


    public static void heroesVsEnemies(Hero[] heroes, Enemy[] enemies) {

        for (int i = 0; i<enemies.length; i++){
            for (int j = 0; j<heroes.length; j++){

                while (enemies[i].isAlive() && heroes[j].isAlive()){

                    enemies[i].attackHero(heroes[j]);
                    heroes[j].attackEnemy(enemies[i]);

                    System.out.println(heroes[j].getName() + " health: " + heroes[j].getHeroHealth());
                    System.out.println(enemies[i].getEnemyName() + " health:" + enemies[i].getEnemyHealth() + "\n");

                }
            }
        }
    }

}
