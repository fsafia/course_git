package Lesson_1.Marathon;

import Lesson_1.Marathon.Competitors.Competitor;
import Lesson_1.Marathon.Obstracle.Cross;
import Lesson_1.Marathon.Obstracle.Obstacle;
import Lesson_1.Marathon.Obstracle.Wall;
import Lesson_1.Marathon.Obstracle.Water;

public class Course {
    private Obstacle [] obstacles = new Obstacle[3];

    public Course(){
        obstacles[0] = new Cross(100);
        obstacles[1] = new Water(3);
        obstacles[2] = new Wall(2);
    }

    public void doCourse(Team t){
        for (Competitor c : t.team) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }

    }
}
