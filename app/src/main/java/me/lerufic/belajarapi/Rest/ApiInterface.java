package me.lerufic.belajarapi.Rest;

import me.lerufic.belajarapi.Model.GetKontak;
import me.lerufic.belajarapi.Model.GetUser;
import me.lerufic.belajarapi.Model.NoGetJadwal;
import me.lerufic.belajarapi.Model.NoGetMyMK;
import me.lerufic.belajarapi.Model.NoGetUser;
import me.lerufic.belajarapi.Model.PostPutDelKontak;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("kontak_android")
    Call<GetKontak> getKontak();

    @FormUrlEncoded
    @POST("login")
    Call<GetUser> getUser(@Field("username") String username,
                          @Field("password") String password);

    @FormUrlEncoded
    @POST("register")
    Call<NoGetUser> insertUser(@Field("username") String username,
                               @Field("password") String password,
                               @Field("repassword") String repassword,
                               @Field("name") String name,
                               @Field("role") String role);

    @FormUrlEncoded
    @POST("addmk")
    Call<NoGetJadwal> insertJadwal(@Field("username") String username,
                                 @Field("startmk") String startmk,
                                 @Field("endmk") String endmk,
                                 @Field("name") String name);

    @FormUrlEncoded
    @POST("joinmhs")
    Call<NoGetMyMK> joinMhs(@Field("matkul_id") String matkul_id,
                                 @Field("mhs_id") String mhs_id);



//    @FormUrlEncoded
//    @POST("kontak")
//    Call<PostPutDelKontak> postKontak(@Field("nama") String nama,
//                                      @Field("nomor") String nomor);
//    @FormUrlEncoded
//    @PUT("kontak")
//    Call<PostPutDelKontak> putKontak(@Field("id") String id,
//                                     @Field("nama") String nama,
//                                     @Field("nomor") String nomor);
//    @FormUrlEncoded
//    @HTTP(method = "DELETE", path = "kontak", hasBody = true)
//    Call<PostPutDelKontak> deleteKontak(@Field("id") String id);
}
