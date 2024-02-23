package lesson.three.homework;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    public void createAnimals(int n){
        for (int i = 0; i < n; i++){
            Animal animal = new CustomAnimal("Breed" + (n+1), "Name" + (n+1),
                    (n+1) * 10, "Character" + (n+1));
            System.out.println("Created Animal: " + animal.getName() + ", " + animal.getBreed() +
                    ", " + animal.getCost() + ", " + animal.getCharacter());
        }
    }

    public void createAnimals(){
        int n = 5;
        int count = 0;
        do {
            Animal animal = new CustomAnimal("Breed" + (n+1), "Name" + (n+1),
                    (n+1) * 10, "Character" + (n+1));
            System.out.println("Created Animal: " + animal.getName() + ", " + animal.getBreed() +
                    ", " + animal.getCost() + ", " + animal.getCharacter());
            count++;
        } while (count < n);

    }
}
