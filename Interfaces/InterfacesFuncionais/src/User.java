public record User(String name, int age) {

    @Override
    public String toString() {
        return "Nome: " + name + "\nIdade: " + age;

    }
}
