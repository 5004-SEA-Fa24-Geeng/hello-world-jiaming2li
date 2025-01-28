package student;

public final class AlohaWorld {

    private AlohaWorld() {

    }

    /**
     * This is the main method. It is the entry point of the program.
     * static means it can be called without creating an "instance" (object) of the class.
     * @param args the command line arguments, if provided, are added to this String array.
     */
    public static void main(String[] args) {
        String name = ConsoleView.getName();
        int locality = ConsoleView.getLocality();

        Greeter greeter = new Greeter(name, locality);
        ConsoleView.printGreeting(greeter.greet());

        while (ConsoleView.checkRunAgain()) {
            locality = ConsoleView.getLocality();
            greeter.setLocality(locality);
            ConsoleView.printGreeting(greeter.greet());
        }

    }
}
