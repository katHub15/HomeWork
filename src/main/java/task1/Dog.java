package task1;

public class Dog extends Animals {
    private static int countDog;

    Dog(String name) {
        super(name);
        countDog++;
    }

    protected int getCountDog() {
        return countDog;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собака не может пробежать " + distance + " метров");
        } else {
            System.out.println("Cобака пробежала " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака не может проплыть " + distance + " метров");
        } else {
            System.out.println("Собака проплыла " + distance + " метров");
        }
    }
}
