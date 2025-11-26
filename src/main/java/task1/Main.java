package task1;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("пес");
        Dog dog2 = new Dog("пес");
        Cat cat1 = new Cat("кошак");

        dog1.run(125);
        dog1.run(650);
        dog2.swim(9);
        dog2.swim(11);
        System.out.println();
        cat1.swim(25);
        cat1.run(195);
        cat1.run(215);

        System.out.println();
        System.out.println("количество собак " + dog1.getCountDog());
        System.out.println("количество котов " + cat1.getCountCat());
        System.out.println("количество животных " + cat1.getCountAnimal());

        System.out.println();
        Cat cat2 = new Cat("барсик");
        Cat cat3 = new Cat("персик");
        Cat[] cats = {cat1, cat2, cat3};
        Bowl bowl = new Bowl();
        bowl.setFood(50);
        System.out.println("количество еды в миске " + bowl.getFood());
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
            cat.getSatiety();
        }
    }

}
