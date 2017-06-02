package ua.dp.hillel.java15;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SuperPanda extends Panda{
    String pandaMood;

    public void run() {
        List<String> mood = new LinkedList();
        mood.add("Sad");
        mood.add("Grumpy");
        mood.add("Sleepy");
        Random random = new Random();
        pandaMood = mood.get(random.nextInt(3));

        System.out.println(name + ": " + pandaMood);

    }


}
