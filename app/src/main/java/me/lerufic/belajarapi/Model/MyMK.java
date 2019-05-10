package me.lerufic.belajarapi.Model;

import com.google.gson.annotations.SerializedName;

public class MyMK {
    @SerializedName("id")
    private String id;
    @SerializedName("matkul_id")
    private String matkul_id;
    @SerializedName("mhs_id")
    private String mhs_id;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("updated_at")
    private String updated_at;

    public MyMK() {}

    public MyMK(String id, String matkul_id, String mhs_id, String created_at, String updated_at) {
        this.id = id;
        this.matkul_id = matkul_id;
        this.mhs_id = mhs_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatkul_id() {
        return matkul_id;
    }

    public void setMatkul_id(String matkul_id) {
        this.matkul_id = matkul_id;
    }

    public String getMhs_id() {
        return mhs_id;
    }

    public void setMhs_id(String mhs_id) {
        this.mhs_id = mhs_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}


