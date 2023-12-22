package lesson7.oop;

import java.util.Arrays;

public class Cat {
    String colour;
    double weight;
    String ownerName;

    public Cat (String colourCat, double weihgtCat, String owner){
        this.colour = colourCat;
        this.weight = weihgtCat;
        this.ownerName = owner;
    }

    public void scratchSofa (String owner){
        System.out.printf("The cat scratches the sofa of %s \n", owner);
    }

    public String hunt (boolean isDay){
        if (isDay){
        return "mouse";
        } else {
            return "owl";
        }
    }

    public String hunt (boolean isDay, boolean success){
        if (success){
            if (isDay){
                return "mouse";
            }
            return "owl";
        }
        return "nothing";
    }

    public void feed (String ... product){
        System.out.printf("The cat ate %s", Arrays.toString(product));
    }
}
