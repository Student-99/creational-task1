public class Main {
    public static void main(String[] args) {
        MyPerson firstMyPerson = new MyPerson.Builder("Иван", "Иванов")
                .withCity("NY")
                .withAge(9)
                .build();
        System.out.printf(firstMyPerson.toString());
        firstMyPerson.happyBirthday();
        System.out.printf(firstMyPerson.toString());

        Person secondPerson = new PersonBuilder("Петр", "Петров")
                .withAge(4)
                .withCity("RUS")
                .build();
        System.out.printf(secondPerson.toString());
        secondPerson.happyBirthday();
        System.out.printf(secondPerson.toString());
    }
}
