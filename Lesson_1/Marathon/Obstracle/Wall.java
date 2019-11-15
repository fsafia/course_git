package Lesson_1.Marathon.Obstracle;

import Lesson_1.Marathon.Competitors.Competitor;
import Lesson_1.Marathon.Obstracle.Obstacle;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}