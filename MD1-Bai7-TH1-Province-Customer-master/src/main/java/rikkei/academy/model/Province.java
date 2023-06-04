package rikkei.academy.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "provinces")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToMany(targetEntity = Customer.class)
    // Tạo bảng trung gian có khóa ngoại
//    @JoinTable(name = "customer_province", joinColumns = @JoinColumn(name = "c_id"),
//            inverseJoinColumns = @JoinColumn(name = "pr_id"))
//    private List<Customer> customers;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
