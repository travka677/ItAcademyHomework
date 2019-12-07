package lesson_19_synchro;

import java.util.*;

// Безумный учёный каждую ночь на протяжении 50 суток отправляет своего прислужника на свалку фабрики роботов
// за деталями. Учёный пытается собрать робота из деталей, которые есть в наличии.

public class Scientist extends Thread{

    private String name;
    private List<Details> collected;
    private List<Details> robotTemplate;
    private int count = 0;
    private Servant servant;

    public Scientist(Servant servant, String name){
        this.name = name;
        this.servant = servant;
        collected = new ArrayList<>();
        getRobotTemplate();
        start();
    }

    // Оставшиеся детали (вывод в удобном формате)
    public Map<Details, Integer> getCollected() {
        Map<Details, Integer> map = new HashMap<>();
        Integer counter = 0;
        for (Details i : Details.values()){
            for (Details j : collected){
                if (i == j){
                    counter++;
                    map.put(i, counter);
                }
            }
        }
        return map;
    }

    // получить чертеж робота
    public void getRobotTemplate(){
        robotTemplate = new ArrayList<>();
        Collections.addAll(robotTemplate, Details.values());
    }


    // забрать детали у прислужника
    public void takeawayServantBag(){
        collected.addAll(servant.getBag());
        servant.getBag().clear();
    }

    public void removeDetails(){
        for (Details detail : Details.values()){
            collected.remove(detail);
        }
    }


    public void makeRobot(){
        if (collected.containsAll(robotTemplate)){
            removeDetails();
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 1; i<=100; i++){
            if (i == 1){
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            servant.collect();
            System.out.println(i + " (" + servant.getName() + ") "+ servant.getBag());
            takeawayServantBag();
            makeRobot();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.err.println(name + " created " + count + " robots");
        System.out.println("Remaining details: " + getCollected());
    }
}
