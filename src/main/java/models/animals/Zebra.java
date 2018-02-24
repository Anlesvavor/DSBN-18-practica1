package models.animals;

import models.subtypes.Herbivorous;

import java.util.Arrays;
import java.util.List;

/**
 * Model that represents a Zebra inside de application
 * @author Jesus Jose Saenz Fierro
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */

public class Zebra extends Herbivorous {

    public static void correr(Integer x, String... args) {
        List<String> argsList = Arrays.asList(args);
        argsList.stream().forEach((String e)->{
            System.out.println(e);
        });
    }
}
