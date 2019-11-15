package Lesson_1.Marathon.Obstracle;

import Lesson_1.Marathon.Competitors.Competitor;
import Lesson_1.Marathon.Obstracle.Obstacle;

public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
