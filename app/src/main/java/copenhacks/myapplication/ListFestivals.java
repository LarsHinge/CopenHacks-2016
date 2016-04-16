package copenhacks.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by William Marstrand on 4/16/2016.
 */
public class ListFestivals extends AppCompatActivity {

    private String[] festivals = new String[] {"Roskilde Festival", "Smuk Festival", "Grøn Koncert"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.festival_list);

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.festival_list, festivals);

        //ListView listView = (ListView) findViewById(R.id.festival_view);
        //listView.setAdapter(adapter);

    }

}
