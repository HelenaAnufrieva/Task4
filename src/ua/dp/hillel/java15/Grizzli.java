package ua.dp.hillel.java15;

public class Grizzli implements Runnable {
    String name;
    String phrase;
    public Grizzli ()
    {
        name = "Grizz";
    }
    public Grizzli (String name, String phrase)
    {
        this.name = name;
        this.phrase = phrase;
    }
    public void speak()
    {
        System.out.print(name);
        if (phrase != null)
            System.out.println(phrase);
        else
            System.out.println();
    }
    public void run(){}
}
