
import 'dart:core';

class ActivityLogs{

    String operationCode="";
    String operationDetail="";
    int? operationDate;
    String operationMemo = "";
    String operationConfirmStatus = "";

    String type = "";

    String adapteDate = "";

    String getOperationCode() {
        return operationCode;
    }

     void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    String getOperationDetail() {
        return operationDetail;
    }

     void setOperationDetail(String operationDetail) {
        this.operationDetail = operationDetail;
    }

     int? getOperationDate() {
        return operationDate;
    }

     void setOperationDate(int operationDate) {
        this.operationDate = operationDate;
    }

     String getOperationMemo() {
        return operationMemo;
    }

     void setOperationMemo(String operationMemo) {
        this.operationMemo = operationMemo;
    }

     String getOperationConfirmStatus() {
        return operationConfirmStatus;
    }

     void setOperationConfirmStatus(String operationConfirmStatus) {
        this.operationConfirmStatus = operationConfirmStatus;
    }

     String getType() {
        return type;
    }

     void setType(String type) {
        this.type = type;
    }

     String getAdapteDate() {
        return adapteDate;
    }

     void setAdapteDate(String adapteDate) {
        this.adapteDate = adapteDate;
    }
}
