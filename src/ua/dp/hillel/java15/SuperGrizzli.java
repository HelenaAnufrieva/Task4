package ua.dp.hillel.java15;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SuperGrizzli extends Grizzli{
    String grizzMood;

    public void run() {
        List<String> mood = new LinkedList();
        mood.add("Angry");
        mood.add("Happy");
        mood.add("Silly");
        Random random = new Random();
        grizzMood = mood.get(random.nextInt(3));

        System.out.println(name + ": " + grizzMood);

    }
}
