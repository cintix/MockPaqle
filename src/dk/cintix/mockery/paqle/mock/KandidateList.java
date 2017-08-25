package dk.cintix.mockery.paqle.mock;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author migo
 */
public class KandidateList {

    @SerializedName(value = "Mark")
    private int nextPageId;

    @SerializedName(value = "ImageIds")
    private int[] imageIDs;

    @SerializedName(value = "Updates")
    private List<Kandidate> kandidates;

    public int getNextPageId() {
        return nextPageId;
    }

    public void setNextPageId(int nextPageId) {
        this.nextPageId = nextPageId;
    }

    public int[] getImageIDs() {
        return imageIDs;
    }

    public void setImageIDs(int[] imageIDs) {
        this.imageIDs = imageIDs;
    }

    public List<Kandidate> getKandidates() {
        return kandidates;
    }

    public void setKandidates(List<Kandidate> kandidates) {
        this.kandidates = kandidates;
    }

    @Override
    public String toString() {
        return "KandidateList{" + "nextPageId=" + nextPageId + ", imageIDs=" + imageIDs + ", kandidates=" + kandidates + '}';
    }

}
