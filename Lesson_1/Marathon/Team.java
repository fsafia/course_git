package Lesson_1.Marathon;

import Lesson_1.Marathon.Competitors.Cat;
import Lesson_1.Marathon.Competitors.Competitor;
import Lesson_1.Marathon.Competitors.Dog;
import Lesson_1.Marathon.Competitors.Human;

public class Team {
    public Competitor[] team = new Competitor[4];

    public Team(){
        team[0] = new Human("Champion");
        team[1] = new Dog("Sharic");
        team[2] = new Cat("Barsik");
        team[3] = new Cat("Pushistik");
    }

    public void showResults(){
        for (Competitor c : team) {
            c.info();
        }
    }

}
