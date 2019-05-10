package me.lerufic.belajarapi.Model;

import com.google.gson.annotations.SerializedName;

public class NoGetMyMK {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    MyMK mUser;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public MyMK getUser() {
        return mUser;
    }
    public void setUser(MyMK User) {
        mUser = User;
    }
}
