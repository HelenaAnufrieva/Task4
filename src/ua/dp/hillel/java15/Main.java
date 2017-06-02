package ua.dp.hillel.java15;

public class Main {
    public static void print(Printable p) /* используем модификатор "static", потому что используем
    данную функцию в главной функции */
    {
        p.speak();
    }
    public static void main(String[] args) { // точка входа в приложение
        System.out.println("NAMES"); // вывод имен персонажей
        System.out.print("Panda: ");
        print(new Panda()); // используем интерфейс в качестве входного параметра для метода
        System.out.print("Grizzli: ");
        print(new Grizzli());
        System.out.print("Ice Bear: ");
        print(new IceBear());
        System.out.println("THE MAIN PHRASES");
        Runnable P = new Panda("Pan-Pan", ": Don't touch my phone!"); // создание объекта Printable как экземпляр класса Panda
        P.speak(); // вызов метода для данного объекта
        P = new Grizzli("Grizz", ": I like burritos!"); // так как классы Panda и Grizzli связаны реализацией одного интерфейса, поэтому динамически можно создавать экземпляр обоих классов
        P.speak();
        P = new IceBear("Ice", ": Ice Bear likes pancakes.");
        P.speak();
        System.out.println();
        P = new SuperPanda();
        P.run();
        P = new SuperGrizzli();
        P.run();P = new SuperIceBear();
        P.run();
    }

}
