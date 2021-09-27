package app.word.word_app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Request {
    @Id
    private Long id;
    private String payload;
}
