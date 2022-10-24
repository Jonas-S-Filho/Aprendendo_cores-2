package br.fmu.aprendendo_cores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntermediarioActivity extends AppCompatActivity {
    //private static final int images[] = {R.drawable.vermelho};

    private ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediario);

        imageView1.findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               // imageView1.setImageResource(images[0]);
            }
        });

    }
}