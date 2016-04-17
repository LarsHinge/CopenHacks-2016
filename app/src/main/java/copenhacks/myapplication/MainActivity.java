package copenhacks.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Boolean[] MusicTaste = { false, false, false, false, false, false, false };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        
        Switch popSwitch = (Switch) findViewById(R.id.switch1);
        popSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MusicTaste[0] = true;
                } else {
                    MusicTaste[0] = false;

                    }
                }
        });

        Switch RockSwitch = (Switch) findViewById(R.id.switch2);
        RockSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MusicTaste[1] = true;
                } else {
                    MusicTaste[1] = false;

                }
            }
        });

        Switch ElectroSwitch = (Switch) findViewById(R.id.switch3);
        ElectroSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MusicTaste[2] = true;
                } else {
                    MusicTaste[2] = false;

                }
            }
        });

        Switch JazzSwitch = (Switch) findViewById(R.id.switch4);
        JazzSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MusicTaste[3] = true;
                } else {
                    MusicTaste[3] = false;

                }
            }
        });

        Switch ClassicSwitch = (Switch) findViewById(R.id.switch5);
        ClassicSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MusicTaste[4] = true;
                } else {
                    MusicTaste[4] = false;

                }
            }
        });

        Switch TechnoSwitch = (Switch) findViewById(R.id.switch6);
        TechnoSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MusicTaste[5] = true;
                } else {
                    MusicTaste[5] = false;

                }
            }
        });

        Switch MetalSwitch = (Switch) findViewById(R.id.switch7);
        MetalSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MusicTaste[6] = true;
                } else {
                    MusicTaste[6] = false;

                }
            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //Intent myIntent = new Intent(MainActivity.this, ListFestivals.class);
                //startActivity(myIntent);
                //System.out.println(MusicTaste);
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;
                Context context = getApplicationContext();
                StringBuilder builder = new StringBuilder();

                for(Boolean value : MusicTaste){
                    builder.append(value.toString() + ", ");
                }

                Toast toast = Toast.makeText(context, builder.toString(), duration);
                toast.show();
            }
        });

    }}
