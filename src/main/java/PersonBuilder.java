public class PersonBuilder {
    private  String name;
    private  String surname;
    private Integer age;
    private String city;

    public PersonBuilder() {
    }

    public PersonBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withAge(Integer age) {
        if (age < 1) {
            throw new IllegalArgumentException("Возраст сотрудника не может быть меньше либо равен 0");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name==null|| surname==null){
            throw new IllegalStateException("У сотрудника не заполнено одно из обязательных полей: Имя, Фамилия.");
        }
        return new Person(name, surname, age, city);
    }
}
