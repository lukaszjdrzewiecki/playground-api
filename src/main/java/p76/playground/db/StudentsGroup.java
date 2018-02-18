package p76.playground.db;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StudentsGroup {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schoolId")
    private School school;
}
