package lesson.three.homework;

public class Main {
    public static void main(String[] agrs){
        CreateAnimalServiceImpl сreateAnimalServiceImpl = new CreateAnimalServiceImpl();
        System.out.println("Run createDefaultAnimals");
        сreateAnimalServiceImpl.createDefaultAnimals();
         System.out.println("Run createAnimals");
        сreateAnimalServiceImpl.createAnimals(5);
        System.out.println("Run Overwritten createAnimals");
        сreateAnimalServiceImpl.createAnimals();
    }
}
