package models;

import models.animals.Deer;
import models.animals.Elephant;
import models.animals.Lion;
import models.animals.Zebra;
import models.enums.Genero;
import models.interfaces.Consumidor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jesus Jose Saenz Fierro on 16/02/18
 *
 */
public class AnimalTest {

    @Test
    public void instanciaAnimalTest(){
        Animal animal = new Animal();
        Assert.assertTrue(Genero.FEMENINO.equals(animal.getGenero()));
        Assert.assertFalse(Genero.MASCULINO.equals(animal.getGenero()));
    }

    @Test
    public void generoAnimalTest(){
        Assert.assertTrue(Genero.FEMENINO.getAmamanta());
    }

    @Test
    public void testComer() {
        List<Consumidor> animals = new ArrayList<>();
        Deer d = new Deer();
        Elephant e = new Elephant();
        Lion l = new Lion();
        Zebra z = new Zebra();

        z.correr(5, "recio", "despacio", "rapido");

        animals.add(d);
        animals.add(e);
        animals.add(l);
        //animals.add(z);  A la chingator

        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }

        Animal animal = new Animal(Genero.FEMENINO);

        System.out.println("----------------------------------");

        for(Consumidor a : animals){
            a.comer();
        }

        System.out.println("----------------------------------");

        animals.stream().forEach((Consumidor x)->{
            x.comer();
        });

    }

}
