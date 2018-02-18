package p76.playground.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    String firstName;

    @Column
    String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentGroupId")
    private StudentsGroup studentGroup;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
