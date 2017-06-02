package ua.dp.hillel.java15;

public class IceBear implements Runnable{
    String name;
    String phrase;
    public IceBear ()
    {
        name = "Ice";
    }
    public IceBear (String name, String phrase)
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
    public void run() {}
}
