package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Suthanth.DK on 31-12-2017.
 */

@Entity
public class Question extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String question;

    public Question(String question) {
        this.question = question;
    }

    public static Model.Finder<Long, Question> find = new Model.Finder<>(Question.class);
}
