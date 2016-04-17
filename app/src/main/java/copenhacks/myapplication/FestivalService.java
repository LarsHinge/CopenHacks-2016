package copenhacks.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by William Marstrand on 4/17/2016.
 */
public interface FestivalService {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("/api/festivals")
    List<Festival> getFestivals();
}
