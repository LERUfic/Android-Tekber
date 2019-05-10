package me.lerufic.belajarapi.Model;

import com.google.gson.annotations.SerializedName;

public class Kontak {
    @SerializedName("id")
    private String id;
    @SerializedName("negara")
    private String negara;
    @SerializedName("emas")
    private String emas;
    @SerializedName("perak")
    private String perak;
    @SerializedName("perunggu")
    private String perunggu;
    @SerializedName("total")
    private String total;

    public Kontak() {}

    public Kontak(String id, String negara, String emas, String perak, String perunggu, String total) {
        this.id = id;
        this.negara = negara;
        this.emas = emas;
        this.perak = perak;
        this.perunggu = perunggu;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getEmas() {
        return emas;
    }

    public void setEmas(String emas) {
        this.emas = emas;
    }

    public String getPerak() {
        return perak;
    }

    public void setPerak(String perak) {
        this.perak = perak;
    }

    public String getPerunggu() {
        return perunggu;
    }

    public void setPerunggu(String perunggu) {
        this.perunggu = perunggu;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}