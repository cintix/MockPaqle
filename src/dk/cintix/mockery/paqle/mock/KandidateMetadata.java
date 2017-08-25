package dk.cintix.mockery.paqle.mock;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author migo
 */
public class KandidateMetadata {

    @SerializedName(value = "Names")
    private List<Name> names;

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "KandidateMetadata{" + "names=" + names + '}';
    }

}
