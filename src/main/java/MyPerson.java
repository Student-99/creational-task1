import org.jetbrains.annotations.NotNull;

public class MyPerson {
    private String name;
    private String surname;
    private Integer age;
    private String city;

    private MyPerson() {
    }

    public boolean hasAge() {
        if (age instanceof Integer) {
            return true;
        }
        return false;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public boolean hasAddress() {
        if (city instanceof String) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static class Builder {
        private MyPerson newMyPerson;

        public Builder(@NotNull String name, @NotNull String surname) {
            newMyPerson = new MyPerson();
            newMyPerson.name = name;
            newMyPerson.surname = surname;
        }

        public Builder withAge(Integer age) {
            if (age<1){
                throw new IllegalArgumentException("Возраст сотрудника не может быть меньше либо равен 0");
            }
            newMyPerson.age = age;
            return this;
        }

        public Builder withCity(String city) {
            newMyPerson.city = city;
            return this;
        }

        public MyPerson build() {
            if ((newMyPerson.name != null) && (newMyPerson.surname != null)) {
                return newMyPerson;
            }
            throw new IllegalStateException("У сотрудника не заполнено одно из обязательных полей: Имя, Фамилия.");
        }
    }
}
