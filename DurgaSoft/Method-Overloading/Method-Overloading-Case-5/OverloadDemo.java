// PROGRAM TO DEMONSTRATE THE METHOD RESOLUTION TYPE IN METHOD OVERLOADING

// PARENT CLASS
class Animal {}
// CHILD CLASS
class Lion extends Animal {}

class OverloadDemo {
    //ANIMAL VERSION
    public void m1(Animal a) {
        System.out.println("\nAnimal Version of the Object");
    }
    // LION VERSION
    public void m1(Lion l) {
        System.out.println("\nLion Version of the Object");
    }
    public static void main(String[] args) {
        
        OverloadDemo demo = new OverloadDemo();
        // REFERENCE TYPE - ANIMAL OBJECT & RUNTIME OBJECT - ANIMAL
        Animal a = new Animal();
        demo.m1(a);
        // REFERENCE TYPE - LION OBJECT & RUNTIME OBJECT - LION
        Lion l = new Lion();
        demo.m1(l);
        // REFERENCE TYPE - ANIMAL OBJECT & RUNTIME OBJECT - LION
        Animal a1 = new Lion();
        demo.m1(a1);
        System.out.println();
    }
}