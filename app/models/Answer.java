package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

/**
 * Created by Suthanth.DK on 31-12-2017.
 */

@Entity
public class Answer extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String answer;

    @OneToOne
    public Question question;

    public Answer(String answer) {
        this.answer = answer;
    }

    public static Model.Finder<Long, Answer> find = new Model.Finder<>(Answer.class);
}
