package lesson.three.homework;

public interface CreateAnimalService {
     default void createDefaultAnimals(){
        int count = 0;
        while (count < 10) {
            Animal animal = new CustomAnimal("Breed" + (count+1), "Name" + (count+1),
                    (count+1) * 10, "Character" + (count+1));
            System.out.println("Created Animal: " + animal.getName() + ", " + animal.getBreed() +
                    ", " + animal.getCost() + ", " + animal.getCharacter());
           count++;
        }
    }
}
