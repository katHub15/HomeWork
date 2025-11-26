package task1;

public class Cat extends Animals {
    private static int countCat;
    private boolean satiety;


    Cat(String name) {
        super(name);
        countCat++;
        satiety = false;
    }

    protected int getCountCat() {
        return countCat;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Кот пробежать не может " + distance + " метров");
        } else {
            System.out.println("Кот пробежал " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    public void eat(Bowl bowl, int food) {
        if (food > bowl.getFood()) {
            System.out.println("еды в миске не хватает ");
        } else {
            System.out.println(name + " поел " + food);
            satiety = true;
            bowl.setFood(bowl.getFood() - food);
        }
    }

    public void getSatiety() {
        if (satiety) {
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " голоден ");
        }
    }
}