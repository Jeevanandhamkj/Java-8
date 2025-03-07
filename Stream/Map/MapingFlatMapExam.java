package Java8.Stream.Map;

import java.util.List;
import java.util.stream.Collectors;

public class MapingFlatMapExam {
    public static void main(String[] args) {
List<Customer>c=CustomerDto.getAll();
//covert obj to string
List<String>email=c.stream()
        .map(Customer->Customer.getEmail()).collect(Collectors.toList());
        System.out.println(email);
        List<List<String>>phone=c.stream().map(Customer->Customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phone);
        List<String>p=c.stream().flatMap(Customer->Customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(p);
    }


}
class Customer{
    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    public Customer() {
    }

    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}