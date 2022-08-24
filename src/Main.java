public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper+= 4;
        System.out.println(paper);

        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper-= 7639;
        System.out.println(paper);

        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //Задача 6
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersWeight = boxer1 + boxer2;
        System.out.println("Вес первого боксера " + boxer1 + "кг");
        System.out.println("Вес вторго боксера " + boxer2 + "кг");
        System.out.println("Общий вес двух бойцов " + boxersWeight + "кг");
        var boxersWeightDifference = boxer2 - boxer1;
        System.out.println("Разница весов бойцов " + boxersWeightDifference + "кг");

        //Задача 7
        System.out.println("Задача 7");
        var differentWeight = boxer2 % boxer1;
        System.out.println(differentWeight);

        //Задача 8
        System.out.println("Задача 8");
        var allHours = 640;
        var onePersonWorkHour = 8;
        var allPerson = allHours / onePersonWorkHour;
        System.out.println("Всего работников в компании – " + allPerson + " человек");
        var addPerson = 94;
        var allStaff = allPerson + addPerson;
        var allAddHours = allStaff * onePersonWorkHour;
        System.out.println("Если в компании работает – " + allStaff + " человек, то всего " + allAddHours + " часов работы может быть поделено между сотрудниками");









    }
}