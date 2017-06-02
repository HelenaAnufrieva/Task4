package ua.dp.hillel.java15;

public class Panda implements Runnable {
    // поля класса
    String name; // имя персонажа
    String phrase; // основная фраза персонажа
    public Panda () // конструктор по умолчанию
    {
        name = "Pan-Pan";
    }
    public Panda (String name, String phrase)
    {
        this.name = name;
        this.phrase = phrase;
    }
    public void speak() // функция выводит имя объекта
    {
        System.out.print(name); // вывод имени персонажа
        if (phrase != null) // если выполнилось присвоение поля "Phrase" - для конструктора по умолчанию
            System.out.println(phrase); // выводим фразу персонажа
        else
            System.out.println();
    }
    public void run(){}
}
