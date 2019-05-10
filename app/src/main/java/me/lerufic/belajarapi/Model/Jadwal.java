package me.lerufic.belajarapi.Model;

import com.google.gson.annotations.SerializedName;

public class Jadwal {
    @SerializedName("id")
    private String id;
    @SerializedName("matakuliah")
    private String matakuliah;
    @SerializedName("id_dosen")
    private String id_dosen;
    @SerializedName("time_start")
    private String time_start;
    @SerializedName("time_end")
    private String time_end;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("updated_at")
    private String updated_at;

    public Jadwal() {}

    public Jadwal(String id, String matakuliah, String id_dosen, String time_start, String time_end, String created_at, String updated_at) {
        this.id = id;
        this.matakuliah = matakuliah;
        this.id_dosen = id_dosen;
        this.time_start = time_start;
        this.time_end = time_end;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public String getId_dosen() {
        return id_dosen;
    }

    public void setId_dosen(String id_dosen) {
        this.id_dosen = id_dosen;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
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
