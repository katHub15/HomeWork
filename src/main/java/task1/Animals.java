package task1;

public abstract class Animals {
    protected String name;
    protected static int countAnimal;
    Animals(String name){
        this.name = name;
        countAnimal ++;
    }
    protected int getCountAnimal(){
        return countAnimal;
    }
    public abstract void run(int distance);
    public abstract void swim(int distance);
}

