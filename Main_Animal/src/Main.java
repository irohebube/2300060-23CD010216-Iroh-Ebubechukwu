
public class Main {
    public static void main(String[] args) {

            Animal animal = new Animal();
            Mammal mammal = new Mammal();
            Dolphin dolphin = new Dolphin();
            Mouse mouse = new Mouse();

        System.out.println(mammal instanceof Animal);
        System.out.println(dolphin instanceof Mammal);
        System.out.println(mouse instanceof Mammal);
        System.out.println(dolphin instanceof Animal);
        }
    }
