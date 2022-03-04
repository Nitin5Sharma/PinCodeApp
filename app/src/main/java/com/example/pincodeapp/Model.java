package com.example.pincodeapp;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Model {
    @SerializedName("Message")
    public String message;
    @SerializedName("Status")
    public String status;
    @SerializedName("PostOffice")
    public ArrayList<PostOffice> postOffice;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<PostOffice> getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(ArrayList<PostOffice> postOffice) {
        this.postOffice = postOffice;
    }

    public class PostOffice{
        @SerializedName("Name")
        public String name;
        @SerializedName("Description")
        public Object description;
        @SerializedName("BranchType")
        public String branchType;
        @SerializedName("DeliveryStatus")
        public String deliveryStatus;
        @SerializedName("Circle")
        public String circle;
        @SerializedName("District")
        public String district;
        @SerializedName("Division")
        public String division;
        @SerializedName("Region")
        public String region;
        @SerializedName("Block")
        public String block;
        @SerializedName("State")
        public String state;
        @SerializedName("Country")
        public String country;
        @SerializedName("Pincode")
        public String pincode;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getBranchType() {
            return branchType;
        }

        public void setBranchType(String branchType) {
            this.branchType = branchType;
        }

        public String getDeliveryStatus() {
            return deliveryStatus;
        }

        public void setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public String getCircle() {
            return circle;
        }

        public void setCircle(String circle) {
            this.circle = circle;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getBlock() {
            return block;
        }

        public void setBlock(String block) {
            this.block = block;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }
    }

}
