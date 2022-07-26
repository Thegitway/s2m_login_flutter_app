

class Biller  {


     String billerCode;

     String billerName;

     String billerLabel;

     String getBillerCode() {
        return billerCode;
    }

     void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

     String getBillerName() {
        return billerName;
    }

     void setBillerName(String billerName) {
        this.billerName = billerName;
    }

     String getBillerLabel() {
        return billerLabel;
    }

     void setBillerLabel(String billerLabel) {
        this.billerLabel = billerLabel;
    }

     Biller(this.billerCode, this.billerName, this.billerLabel);
}
