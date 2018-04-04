package wikira.recipeproject.domain;

import lombok.*;

import javax.persistence.*;


@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    //We want to store big strings here
    @Lob
    private String recipeNotes;

    public Notes() {
    }

}
