public record Person(String name, int age) {
    public Person{
    }


    @Override
    public String toString() {
        return "Nome: " + name + "\nIdade: " + age;
    }
}
