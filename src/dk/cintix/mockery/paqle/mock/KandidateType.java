package dk.cintix.mockery.paqle.mock;

/**
 *
 * @author migo
 */
public enum KandidateType {

    KOMMUNE("Local"),
    REGION("Region"),
    UNKNOWN("Unknown");

    private final String value;

    private KandidateType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static KandidateType fromValue(String v) {
        for (KandidateType type : KandidateType.values()) {
            if (type.toString().equalsIgnoreCase(v)) {
                return type;
            }
        }
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return value;
    }
    

}
