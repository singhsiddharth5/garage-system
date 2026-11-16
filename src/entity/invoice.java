package entity;

public class invoice {

    private int id;
    private int customer_id;
    private int vechile_id;
    private int service_id;

    // Constructor
    public invoice(int id, int customer_id,
                   int vechile_id, int service_id) {

        this.id = id;
        this.customer_id = customer_id;
        this.vechile_id = vechile_id;
        this.service_id = service_id;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getcustomer_id() {
        return customer_id;
    }

    public void setcustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getvechile_id() {
        return vechile_id;
    }

    public void setvechile_id(int vechile_id) {
        this.vechile_id = vechile_id;
    }

    public int getservice_id() {
        return service_id;
    }

    public void setservice_id(int service_id) {
        this.service_id = service_id;
    }

    @Override
    public String toString() {
        return "invoice{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", vechile_id=" + vechile_id +
                ", service_id=" + service_id +
                '}';
    }
}