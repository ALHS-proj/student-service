package ALHS.proj.StudentService.Students;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer itemsReserved;


    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String email, Integer itemsReserved) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.itemsReserved = itemsReserved;
    }



    public Student(String firstName, String lastName, String email, Integer itemsReserved) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.itemsReserved = itemsReserved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getItemsReserved() {
        return itemsReserved;
    }

    public void setItemsReserved(Integer itemsReserved) {
        this.itemsReserved = itemsReserved;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", itemsReserved=" + itemsReserved +
                '}';
    }
}

