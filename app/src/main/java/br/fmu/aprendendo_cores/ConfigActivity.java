package br.fmu.aprendendo_cores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ConfigActivity extends AppCompatActivity {
    ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        voltar.findViewById(R.id.voltarconfig);
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