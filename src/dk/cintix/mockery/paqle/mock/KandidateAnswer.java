package dk.cintix.mockery.paqle.mock;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author migo
 */
public class KandidateAnswer {

    @SerializedName(value = "Id")
    private int id;

    @SerializedName(value = "Opinion")
    private int option;

    @SerializedName(value = "Comment")
    private String comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "KandidatAnswer{" + "id=" + id + ", option=" + option + ", comments=" + comments + '}';
    }

}
