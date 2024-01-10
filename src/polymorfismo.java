interface polymorfismo{
    void makeSound();
}

class Dogs implements polymorfismo {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements polymorfismo {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
