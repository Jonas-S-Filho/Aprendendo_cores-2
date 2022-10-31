package br.fmu.aprendendo_cores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class ConfigActivity extends AppCompatActivity {
    ImageView voltar;
    Switch sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        sound = findViewById(R.id.switch2);
        sound.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (sound.isChecked()){
                    // som será ativado
                }else {
                    // som será desativado
                }
            }
        });

        voltar = (ImageView) findViewById(R.id.voltarconfig);
        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view) {
                menu();
            }
        });

    }

    public void menu() {
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }
}
