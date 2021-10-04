public class Order {

    private Long price;
    private Client client;

    public Order(Long price, Client client) {
        this.price = price;
        this.client = client;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
