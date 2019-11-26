package lesson_18_thread.task_2;

import java.util.*;

// Безумный учёный каждую ночь на протяжении 50 суток отправляет своего прислужника на свалку фабрики роботов
// за деталями. Учёный пытается собрать робота из деталей, которые есть в наличии.

public class Scientist extends Thread{

    private List<Details> collected;
    private List<Details> robotTemplate;
    private int count = 0;
    private Servant servant;

    public Scientist(Servant servant){
        this.servant = servant;
        collected = new ArrayList<>();
        getRobotTemplate();
    }

    // вывод в удобном формате
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

    @Override
    public void run() {
        for (int i = 1; i<=50; i++){
            servant.collect();
            System.out.println(i + " " + servant.getBag());
            takeawayServantBag();

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            makeRobot();
        }

        System.out.println(count + " robots");
    }
}
