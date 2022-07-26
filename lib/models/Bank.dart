
class Bank  {

     String key;


     String bankIden;

     String value;

     String valueAr;


     Bank(this.key, this.bankIden, this.value, this.valueAr);

  String getKey() {
        return key;
    }

     void setKey(String key) {
        this.key = key;
    }

     String getValue() {
        return value;
    }

     void setValue(String value) {
        this.value = value;
    }

     String getValueAr() {
        return valueAr;
    }

     void setValueAr(String valueAr) {
        this.valueAr = valueAr;
    }

     String getBankIden() {
        return bankIden;
    }

     void setBankIden(String bankIden) {
        this.bankIden = bankIden;
    }
}
