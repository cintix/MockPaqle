package dk.cintix.mockery.paqle.mock;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author migo
 */
public class Name {

    public Name() {
    }

    public Name(String fullName) {
        this.fullName = fullName;
    }

    @SerializedName(value = "FullName")
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Name{" + "fullName=" + fullName + '}';
    }

}
