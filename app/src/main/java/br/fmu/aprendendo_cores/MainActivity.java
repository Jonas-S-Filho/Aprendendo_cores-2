package br.fmu.aprendendo_cores;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private android.content.Intent Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView config = (ImageView) findViewById(R.id.imageView4);
        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { config();
            }

        });

    }

    public void config() {
        Intent intent = new Intent(this, ConfigActivity.class);
        startActivity(Intent);
    }


    public void jogar(View view) {
        Intent intent = new Intent(this, SetDificuldadeActivity.class );
        startActivity(intent);
    }


}
