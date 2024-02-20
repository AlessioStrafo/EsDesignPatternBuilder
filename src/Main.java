//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici
//(tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        PersonBuilder studente1 = new PersonBuilder();
        studente1.setFirstName("Marco");
        studente1.setLastName("Rossi");
        studente1.setAge(32);
        Person marco = studente1.build();
        System.out.println("Studente 1: " + marco);

        PersonBuilder studente2 = new PersonBuilder();
        studente2.setFirstName("Dante");
        studente2.setLastName("Alighieri");
//        studente2.setAge(29);
        Person dante = studente2.build();
        System.out.println("Studente 2: " + dante);
    }
}