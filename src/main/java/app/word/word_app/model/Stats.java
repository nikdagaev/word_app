package app.word.word_app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Stats {
    @Id
    private Long id;
    private String word;
    private int entry;
    @ManyToOne
    private Request request;
}
