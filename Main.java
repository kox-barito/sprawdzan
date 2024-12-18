import java.util.ArrayList;

abstract class Animal{
    abstract void makeSound();
    private String name;
    abstract public void getName();
}
interface Adoptable{
    void isReadyForAdoption();
}

    class Dog extends Animal{
        public void readyForAdoption(){
     }
        void makeSound(){System.out.println("Woof");}
        public void getName(){System.out.println("Sparky");}
}

   abstract class Cat extends Animal{
     public void readyForAdoption(){}
     void makeSound(){System.out.println("Meow");}
       public void getName(){System.out.println("Whiskas");};
}

   abstract class Horse extends Animal{
    public void readyForAdoption(){}
    void makeSound(){System.out.println("Neigh");}
       public void getName(){System.out.println("Rafał");};
   }

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("-------------------------");
        int i;
        int j=0;
        double k=0;
        ArrayList<Integer> age = new ArrayList<>();
        age.add(6);
        age.add(3);
        age.add(9);

        for(i=0;i<age.size();i++){
            System.out.println("Wiek zwierzęcia nr "+i+": "+age.get(i));
            j+=age.get(i);
        }
        k=j/i;
        System.out.println("Średni wiek zwierzęcia:"+k);
    }
}