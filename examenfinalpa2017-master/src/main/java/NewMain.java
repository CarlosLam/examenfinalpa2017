/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import gt.edu.url.problema2.ImplArrayManipulator;
import gt.edu.url.problema2.ArrayList;
import gt.edu.url.problema3.Animal;
import gt.edu.url.problema3.LeakyStack;
import gt.edu.url.problema3
/**
 *
 * @author lam_m
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ImplArrayManipulator Am = new ImplArrayManipulator();
        ArrayList set;
        set = new ArrayList(4);
        set.set(1, 20);
        set.set(2, 0);
        set.set(3,1);
  
        Animal bambi = new Animal("salvaje", 10,100, "cafecito");
        LeakyStack<Animal> animalHistory =
        
        Am.subsets(set);
    }
    
}
