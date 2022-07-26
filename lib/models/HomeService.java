package com.s2m.gbmagent.Model;

/**
 * Created by Guessous Mohamed Tariq on 2020-04-15.
 */
public class HomeService {

    private String serviceName;
    private int serviceImage;
    private int serviceAction;
    private boolean isActive = true;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(int serviceImage) {
        this.serviceImage = serviceImage;
    }

    public int getServiceAction() {
        return serviceAction;
    }

    public void setServiceAction(int serviceAction) {
        this.serviceAction = serviceAction;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
