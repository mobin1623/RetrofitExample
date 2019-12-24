package m.com.retrofitexample;

import java.util.List;

import m.com.retrofitexample.Hero;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";
    String Result_URL = "https://randomuser.me";

    @GET("/api/?results=10")
    Call<List<Demo>> getResults();

    @GET("marvel")
    Call<List<Hero>> getHeroes();

}
