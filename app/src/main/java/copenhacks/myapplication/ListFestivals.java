package copenhacks.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by William Marstrand on 4/16/2016.
 */
public class ListFestivals extends AppCompatActivity {

    private ArrayList<String> festivals = new ArrayList<String>(
            Arrays.asList("Roskilde Festival", "Smuk Festival", "Grøn Koncert"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.festival_list);

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivals);

        ListView listView = (ListView) findViewById(R.id.festival_listview);
        listView.setAdapter(adapter);
    }

}
