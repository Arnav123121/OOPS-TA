class Mammal extends Animal {
    @Override
    void eat() {
        System.out.println("Mammal eats plants and small animals");
    }

    void walk() {
        System.out.println("Mammal walks on land");
    }
}