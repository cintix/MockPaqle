package dk.cintix.mockery.paqle.mock;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author migo
 */
public class KandidateResponse {

    @SerializedName(value = "Questionnaire")
    private String area;

    @SerializedName(value = "OriginalId")
    private int id;

    @SerializedName(value = "Answers")
    private List<KandidateAnswer> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public List<KandidateAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<KandidateAnswer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "KandidateResponse{" + "area=" + area + ", id=" + id + ", answers=" + answers + '}';
    }

}
