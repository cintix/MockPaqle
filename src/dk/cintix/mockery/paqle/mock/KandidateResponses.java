package dk.cintix.mockery.paqle.mock;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author migo
 */
public class KandidateResponses {

    @SerializedName(value = "Mark")
    private int nextPageId;

    @SerializedName(value = "Submissions")
    private List<KandidateResponse> responses;

    public int getNextPageId() {
        return nextPageId;
    }

    public void setNextPageId(int nextPageId) {
        this.nextPageId = nextPageId;
    }

    public List<KandidateResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<KandidateResponse> responses) {
        this.responses = responses;
    }

    @Override
    public String toString() {
        return "KandidateResponses{" + "nextPageId=" + nextPageId + ", responses=" + responses + '}';
    }

}
