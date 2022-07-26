
class Branche implements Serializable {

    private String key;

    @SerializedName("branchLabel")
    private String value;

    @SerializedName("branchLabelAr")
    private String valueAr;

    public Branche() {
        this.key ="";
        this.value ="";
        this.valueAr ="";
    }

    public Branche(String key, String value, String valueAr) {
        this.key = key;
        this.value = value;
        this.valueAr = valueAr;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueAr() {
        return valueAr;
    }

    public void setValueAr(String valueAr) {
        this.valueAr = valueAr;
    }

}
