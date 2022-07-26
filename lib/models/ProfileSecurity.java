package com.s2m.gbmagent.Model;

import java.io.Serializable;

/**
 * Created by S2M on 2020-04-15.
 */
public class ProfileSecurity implements Serializable {

    private String newPin;

    private String confirmPin;

    private String pin;

    private String newPassword;

    private String confirmPassword;

    private String oldPassword;

    public String getNewPin() {
        return newPin;
    }

    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }

    public String getConfirmPin() {
        return confirmPin;
    }

    public void setConfirmPin(String confirmPin) {
        this.confirmPin = confirmPin;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
}
