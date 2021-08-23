public class PersonBuilder {
    private final String name;
    private final String surname;
    private Integer age;
    private String city;

    public PersonBuilder(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public PersonBuilder withAge(Integer age) {
        if (age<1){
            throw new IllegalArgumentException("Возраст сотрудника не может быть меньше либо равен 0");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public Person build(){
        return new Person(name,surname,age,city);
    }
}
