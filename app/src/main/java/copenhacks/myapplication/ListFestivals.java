package copenhacks.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.JsonReader;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ListFestivals extends AppCompatActivity {

    /*private static final String BASE_URL = "http://api.myservice.com/"; //TODO Change to RESTAPI BaseURL
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();*/
    private FestivalService festivalService;
    private List<Festival> festivals= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.festival_list);

        populateFestivalList();

        ArrayList<String> festivalNames = getFestivalNames(festivals);

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNames);

        ListView listView = (ListView) findViewById(R.id.festival_listview);
        listView.setAdapter(adapter);
    }


    /*
    Gets data from a http get request
     */
    /*private void getData() {
        festivalService = retrofit.create(FestivalService.class);
        festivals = festivalService.getFestivals();
    }*/

    private void populateFestivalList(){
        Festival f1 = new Festival();
        f1.name = "Roskilde Festival";
        festivals.add(f1);
        Festival f2 = new Festival();
        f2.name = "Tinderbox";
        festivals.add(f2);
        Festival f3 = new Festival();
        f3.name = "Smuk Festival";
        festivals.add(f3);
    }

    private ArrayList<String> getFestivalNames(List<Festival> festivals){
        ArrayList<String> festivalNames = new ArrayList<>();
        for (Festival f : festivals){
            festivalNames.add(f.name);
        }
        return festivalNames;
    }
}
