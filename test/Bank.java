import java.util.ArrayList;

public class Bank {
    private String name;
    private int sortCode;
    private ArrayList<Customer> customer;

    public Bank(String name, int sortCode, ArrayList<Customer> customer) {
        this.name = name;
        this.sortCode = sortCode;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }
}
