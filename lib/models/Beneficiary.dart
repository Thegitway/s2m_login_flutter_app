
class Beneficiary  {


     int id;

     String name = "";

     String status = "";

     String iden = "";

     String aplphaCode = "";

     String beneficiaryType = "";

     String mobilePhone = "";

     String accountNumber = "";

     String maskedPan = "";

     String pin = "";

     int getId() {
        return id;
    }

     void setId(int id) {
        this.id = id;
    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     String getStatus() {
        return status;
    }

     void setStatus(String status) {
        this.status = status;
    }

     String getIden() {
        return iden;
    }

     void setIden(String iden) {
        this.iden = iden;
    }

     String getAplphaCode() {
        return aplphaCode;
    }

     void setAplphaCode(String aplphaCode) {
        this.aplphaCode = aplphaCode;
    }

     String getBeneficiaryType() {
        return beneficiaryType;
    }

     void setBeneficiaryType(String beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

     String getMobilePhone() {
        return mobilePhone;
    }

     void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

     String getAccountNumber() {
        return accountNumber;
    }

     void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

     String getPin() {
        return pin;
    }

     void setPin(String pin) {
        this.pin = pin;
    }

     String getMaskedPan() {
        return maskedPan;
    }

     void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

     Beneficiary(
      this.id,
      this.name,
      this.status,
      this.iden,
      this.aplphaCode,
      this.beneficiaryType,
      this.mobilePhone,
      this.accountNumber,
      this.maskedPan,
      this.pin);
}
