package com.example.saiful.nearbyhospital;

import android.graphics.Bitmap;

public class Hospital {
    public String hospitalName;
    public String hospitalAddress;
    public String openingHours;
    public Bitmap hospitalImage;
    public String hospitalPhoneNumber;
    public String ambulancePhoneNumber;

    public Hospital(String hospitalName, String hospitalAddress, String openingHours, Bitmap hospitalImage, String hospitalPhoneNumber, String ambulancePhoneNumber) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.openingHours = openingHours;
        this.hospitalImage = hospitalImage;
        this.hospitalPhoneNumber = hospitalPhoneNumber;
        this.ambulancePhoneNumber = ambulancePhoneNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public Bitmap getHospitalImage() {
        return hospitalImage;
    }

    public void setHospitalImage(Bitmap hospitalImage) {
        this.hospitalImage = hospitalImage;
    }

    public String getHospitalPhoneNumber() {
        return hospitalPhoneNumber;
    }

    public void setHospitalPhoneNumber(String hospitalPhoneNumber) {
        this.hospitalPhoneNumber = hospitalPhoneNumber;
    }

    public String getAmbulancePhoneNumber() {
        return ambulancePhoneNumber;
    }

    public void setAmbulancePhoneNumber(String ambulancePhoneNumber) {
        this.ambulancePhoneNumber = ambulancePhoneNumber;
    }
}
