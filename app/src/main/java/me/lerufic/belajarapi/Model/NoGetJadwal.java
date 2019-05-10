package me.lerufic.belajarapi.Model;

import com.google.gson.annotations.SerializedName;

public class NoGetJadwal {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    Jadwal mUser;
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
    public Jadwal getUser() {
        return mUser;
    }
    public void setUser(Jadwal User) {
        mUser = User;
    }
}
