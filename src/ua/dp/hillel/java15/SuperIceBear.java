package ua.dp.hillel.java15;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SuperIceBear extends IceBear{
    String iceMood;

    public void run() {
        List<String> mood = new LinkedList();
        mood.add("Calm");
        mood.add("Quiet");
        mood.add("Worried");
        Random random = new Random();
        iceMood = mood.get(random.nextInt(3));

        System.out.println(name + ": " + iceMood);

    }
}
