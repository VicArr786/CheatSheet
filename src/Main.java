// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        int number = 0;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number < 5);


        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);


        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Value: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Value: " + i);
        }


        //This example demonstrates the basic concepts of classes, objects, attributes, and methods in Java.
        CLasses myCar = new CLasses("Toyota", 2022, 25000.0);
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);
        System.out.println("Price: $" + myCar.price);
        // Calling the start() method
        myCar.start();


        /*try {
            // Code that may throw an exception
        } catch (ExceptionType e) {
            // Code to handle the exception
        } finally {
            // Code that always executes, whether an exception occurred or not
        }*/


       /* public class Dependency {
            public void doSomething() {
                System.out.println("Doing something in the dependency");
            }
        }

        public class MyService {
            private Dependency dependency;

            // Constructor-based dependency injection
            public MyService(Dependency dependency) {
                this.dependency = dependency;
            }

            public void performAction() {
                System.out.println("Performing action in MyService");
                dependency.doSomething();
            }
        }


                Dependency myDependency = new Dependency();
                MyService myService = new MyService(myDependency);

                myService.performAction();*/







    }
}