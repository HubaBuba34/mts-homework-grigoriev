package lesson.three.homework;

import lesson.three.homework.Animals.Animal;
import lesson.three.homework.Animals.Cat;

import java.time.LocalDate;
import java.util.*;

public class AnimalsRepositoryImpl implements AnimalsRepository {
    @Override
    public Map<String, List<LocalDate>> findLeapYearNames(List<Animal> animals) {
        if (Objects.isNull(animals) || animals.isEmpty()){
            return new HashMap<>();
        }
        Map<String, List<LocalDate>> animalsBornLeapYear = new HashMap<>();
        LocalDate birthdate;
        ArrayList<LocalDate> birthdates;
        String key;
        for (Animal animal: animals){
            birthdate = animal.getBirthdate();
            if (birthdate.isLeapYear()){
                key = animal.getType() + " " + animal.getName();
                if (animalsBornLeapYear.containsKey(key)){
                    animalsBornLeapYear.get(key).add(birthdate);
                }else {
                   birthdates = new ArrayList<>();
                   birthdates.add(birthdate);
                   animalsBornLeapYear.put(key, birthdates);
                }
            }
        }
        return animalsBornLeapYear;
    }

    @Override
    public Map<Animal, Integer> findOlderAnimals(List<Animal> animals, int ageYearsBound) {
        if (Objects.isNull(animals) || animals.isEmpty()){
            return new HashMap<>();
        }
        Map<Animal, Integer> animalsOlder = new HashMap<>();
        int ageYear;
        Animal oldest = new Cat();
        for (Animal animal : animals){
            ageYear = LocalDate.now().getYear() - animal.getBirthdate().getYear();
            if (ageYear > ageYearsBound){
                animalsOlder.put(animal, ageYear);
            }
            if ((LocalDate.now().getYear() - oldest.getBirthdate().getYear()) < ageYear) {
                oldest = animal;
            }
        }
        if (animalsOlder.isEmpty()){
            animalsOlder.put(oldest,LocalDate.now().getYear() - oldest.getBirthdate().getYear());
        }
        return animalsOlder;
    }

    @Override
    public Map<String, Integer> findAllDuplicates(List<Animal> animals) {
        if (Objects.isNull(animals) || animals.isEmpty()){
            return new HashMap<>();
        }
        Map<String, Integer> mapCount = new HashMap<>();
        Map<String, Integer> mapDuplicates = new HashMap<>();
        for (Animal animal : animals){
            mapCount.put(animal.getType().toString(),mapCount.getOrDefault(animal.getType().toString(),0)+1);
        }
        for (Map.Entry<String,Integer> entry : mapCount.entrySet()){
            if(entry.getValue() > 1) {
                mapDuplicates.put(entry.getKey(),entry.getValue());
            }
        }
        return mapDuplicates;
    }
}
