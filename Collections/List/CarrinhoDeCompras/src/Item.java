public class Item {
    private String name;
    private int qt;
    private double price;
    public Item(){

    }

    public Item(String name, int qt, double price) {
        this.price = price;
        this.qt = qt;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s Quantidade: %d Preço: R$ %.2f\n", name,qt,price);
    }
}
