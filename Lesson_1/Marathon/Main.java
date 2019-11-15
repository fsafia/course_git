package Lesson_1.Marathon;

import Lesson_1.Marathon.Competitors.Cat;
import Lesson_1.Marathon.Competitors.Competitor;
import Lesson_1.Marathon.Competitors.Dog;
import Lesson_1.Marathon.Competitors.Human;
import Lesson_1.Marathon.Obstracle.Cross;
import Lesson_1.Marathon.Obstracle.Obstacle;
import Lesson_1.Marathon.Obstracle.Wall;
import Lesson_1.Marathon.Obstracle.Water;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team();
        Course course1 = new Course();
        course1.doCourse(team1);
        team1.showResults();
    }
}