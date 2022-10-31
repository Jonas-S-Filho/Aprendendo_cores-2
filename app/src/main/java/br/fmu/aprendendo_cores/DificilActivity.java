package br.fmu.aprendendo_cores;

public class DificilActivity extends AppCompatActivity {
  private int valCor = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificil);
        
        /*
        /* verificar qual modo(nuturno ou diurno) está ativado */

        /* Imagem da seta pra esquerda */
        ImageView voltarMenu = (ImageView) findViewById(R.id.voltarMenuDifi);
        
        // Troca para a tela Menu
        voltarMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                menu();
            }
        });

        /* Opções de cores */
        ImageView cor1 = (ImageView) findViewById(R.id.cor1);
        ImageView cor2 = (ImageView) findViewById(R.id.cor2);
        ImageView cor3 = (ImageView) findViewById(R.id.cor3);
        ImageView cor4 = (ImageView) findViewById(R.id.cor4);
        ImageView cor5 = (ImageView) findViewById(R.id.cor5);
        ImageView cor6 = (ImageView) findViewById(R.id.cor6);

        cor1.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
                //Copiar e mandar a cor escolhida para Dificil_II
                valCor = 0;
                dificil_II();
            }
        });

        cor2.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
                //Copiar e mandar a cor escolhida para Dificil_II
                valCor = 1;
                dificil_II();
            }
        });

        cor3.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
                //Copiar e mandar a cor escolhida para Dificil_II
                valCor = 2;
                dificil_II();
            }
        });

        cor4.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
                //Copiar e mandar a cor escolhida para Dificil_II
                valCor = 3;
                dificil_II();
            }
        });

        cor5.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
                //Copiar e mandar a cor escolhida para Dificil_II
                valCor = 4;
                dificil_II();
            }
        });

        cor6.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
                //Copiar e mandar a cor escolhida para Dificil_II
                valCor = 5;
                dificil_II();
            }
        });

    }

    public  void  menu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void dificil_II() {
        Intent intent = new Intent(this, Dificil_II.class);
        intent.putExtra("valorcor", valCor);
        startActivity(intent);
    }*/

}
