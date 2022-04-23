package practicaHarry;

public class testCharacter {
    public static void main(String[] args) {
        def();
    }

    public static void def() {
        // Por constructor
        Character harry = new Character("Harry James Potter", "male", "Gryffindor", "Dementor", "Stag");
        System.out.println(harry.printState());
        Character ron = new Character("Ronald Bilius Weasley", "male", "Gryffindor", "Aragog", "Jack Russell terrier");
        System.out.println(ron.printState());
        Character hermione = new Character("Hermione Jean Granger", "female", "Gryffindor", "Failure", "Otter");
        System.out.println(hermione.printState());
        // Por setters
        Character cho = new Character();
        cho.setName("Cho Chang");
        cho.setGender("female");
        cho.setHouse("Ravenclaw");
        cho.setBoggart("Lord Voldemort");
        cho.setPatronus("Swan");
        System.out.println(cho.printState());
        Character snape = new Character();
        snape.setName("Severus Snape");
        snape.setGender("male");
        snape.setHouse("Slytherin");
        snape.setBoggart("Lord Voldemort");
        snape.setPatronus("Doe");
        System.out.println(snape.printState());
    }
}
