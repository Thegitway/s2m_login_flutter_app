
class Alert {

     String messageType;

     int iden;

     bool readed;

     String messageTxt;

     String readedDate;

     String date;

     String alertType;

     String adapteDate = "";
     String type = "";

     String getMessageType() {
        return messageType;
    }

     void setMessageType(String messageType) {
        this.messageType = messageType;
    }

     int getIden() {
        return iden;
    }

     void setIden(int iden) {
        this.iden = iden;
    }

     bool isReaded() {
        return readed;
    }

     void setReaded(bool readed) {
        this.readed = readed;
    }

     String getMessageTxt() {
        return messageTxt;
    }

     void setMessageTxt(String messageTxt) {
        this.messageTxt = messageTxt;
    }

     String getReadedDate() {
        return readedDate;
    }

     void setReadedDate(String readedDate) {
        this.readedDate = readedDate;
    }

     String getDate() {
        return date;
    }

     void setDate(String date) {
        this.date = date;
    }

     String getAlertType() {
        return alertType;
    }

     void setAlertType(String alertType) {
        this.alertType = alertType;
    }

     String getAdapteDate() {
        return adapteDate;
    }

     void setAdapteDate(String adapteDate) {
        this.adapteDate = adapteDate;
    }

     String getType() {
        return type;
    }

     void setType(String type) {
        this.type = type;
    }

     Alert(this.messageType, this.iden, this.readed, this.messageTxt,
      this.readedDate, this.date, this.alertType, this.adapteDate, this.type);
}
