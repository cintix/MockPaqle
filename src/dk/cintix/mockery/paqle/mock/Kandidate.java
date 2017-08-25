package dk.cintix.mockery.paqle.mock;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author migo
 */
public class Kandidate {

    @SerializedName(value = "Type")
    private String type;

    @SerializedName(value = "OriginalId")
    private int id;

    @SerializedName(value = "MergedIds")
    private int copyIds;

    @SerializedName(value = "CurrentId")
    private int version;

    @SerializedName(value = "Published")
    private boolean published;

    @SerializedName(value = "Hidden")
    private boolean hidden;

    @SerializedName(value = "Sections")
    private KandidateMetadata metadata;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCopyIds() {
        return copyIds;
    }

    public void setCopyIds(int copyIds) {
        this.copyIds = copyIds;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public KandidateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(KandidateMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "Kandidate{" + "type=" + type + ", id=" + id + ", copyIds=" + copyIds + ", version=" + version + ", published=" + published + ", hidden=" + hidden + ", metadata=" + metadata + '}';
    }

}
