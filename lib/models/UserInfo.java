package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by S2M on 2020-04-04.
 */
public class UserInfo implements Serializable {

    @SerializedName("phone")
    private String phone;

    @SerializedName("password")
    private String password;

    @SerializedName("confirmPassword")
    private String confirmPassword;

    @SerializedName("pin")
    private String pin;

    @SerializedName("confirmPin")
    private String confirmPin;

    @SerializedName("secretQuestion")
    private SecretQuestion secretQuestion;

    @SerializedName("oldPassword")
    private SecretQuestion oldPassword;

    @SerializedName("answerQuestion")
    private String answerQuestion;

    @SerializedName("questionsList")
    private List<SecretQuestion> questionsList;





    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public SecretQuestion getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(SecretQuestion secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getAnswerQuestion() {
        return answerQuestion;
    }

    public void setAnswerQuestion(String answerQuestion) {
        this.answerQuestion = answerQuestion;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPin() {
        return confirmPin;
    }

    public void setConfirmPin(String confirmPin) {
        this.confirmPin = confirmPin;
    }

    public SecretQuestion getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(SecretQuestion oldPassword) {
        this.oldPassword = oldPassword;
    }

    public List<SecretQuestion> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<SecretQuestion> questionsList) {
        this.questionsList = questionsList;
    }
}
