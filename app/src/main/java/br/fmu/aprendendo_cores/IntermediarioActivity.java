package br.fmu.aprendendo_cores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntermediarioActivity extends AppCompatActivity {
    /*private static final int images[] = {R.drawable.intermediario.inter-01,R.drawable.intermediario.inter-02,R.drawable.intermediario.inter-03};
    private static final String textR[] = {R.string.inter01, R.string.inter02}; // Talvez .values.strings
    private int seq1[] = new int[images.length];
    private int seq2[] = new int[images.length];*/
    private int valCor = 0;

   private ImageView imageView;
    private ImageView back01;
    private ImageView back02;
    private ImageView back03;
    private TextView btn1;
    private TextView btn2;
    private TextView btn3;
    private ImageView recarregarBtn;

    @Overrride
    protected void onCreate(Bundle savedInstanceState) {
        ...

        /* verificar qual modo(nuturno ou diurno) está ativado */

        /* Imagem da seta pra esquerda */
        ImageView voltarMenu = (ImageView) findViewById(R.id.voltarMenuInter);
        
        /* Troca para a tela Menu */
         voltarMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                menu();
            }
        });
        
        /* Define a imagem que vai aparecer */
        sequencia(seq1);
        
        imageView = (ImageView) findViewById(R.id.difi2image);
        imageView.setImageResource(images[seq1[valCor]]);

        /* Botões */
        btn1 = findViewById(R.id.btn1Inter); 
        btn2 = findViewById(R.id.btn2Inter);  
        btn3 = findViewById(R.id.btn3Inter);

        // Criar possições aleatórias
        sequencia(seq2);

        btn1.setText(textR[seq2[0]]);
        btn2.setText(textR[seq2[1]]);
        btn3.setText(textR[seq2[2]]);

        back01 = (ImageView) findViewById(R.id.back01); 
        back02 = (ImageView) findViewById(R.id.back02);  
        back03 = (ImageView) findViewById(R.id.back03);

        back01.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
               opcao1();
            }
        });

        back02.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
               opcao2();
            }
        });

        back03.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
               opcao3();
            }
        });         

        /* Reset botões */
        recarregarBtn = (ImageView) findViewById(R.id.recarregarBtnInter);

        // Tornar invisivel 
        recarregarBtn.setVisibility(View.INVISIBLE);

        recarregarBtn.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
                // onCreate();
                reset();
            }
        });

    }

    public  void  menu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
	
    public void sequencia(int x[]) {
        Random rand = new Random();
        for (int i = 0; i < images.length; i++) {
            do{
                x[i] = rand.nextInt(images.length); 
            } while (x[i] == x[0] && x[i] == x[1]);
        }
    }

    public void opcao1() {
        // Verificar opção e mudar de cor
        if (textR[seq2[0]] == textR[seq1[valCor]]) {
            back01.setImageResource(R.drawable.intermediario.backGreen); // Mudar para R.drawable.imgx
            if (recarregarBtn.Visibility =! VISIBLE) {
                proximo();
            }
        } else {
            // Apenas trocar para vermelho
            back01.setImageResource(R.drawable.intermediario.backRed);
            // Tornar imagem/botão de resetar a tela visivel
            recarregarBtn.setVisibility(View.VISIBLE);
        }
    }

    public void opcao2() {
        // Verificar opção e mudar de cor
        if (textR[seq2[1]] == textR[seq1[valCor]]) {
            back02.setImageResource(R.drawable.intermediario.backGreen);
            if (recarregarBtn.Visibility =! VISIBLE) {
                proximo();
            }
        } else {
            back02.setImageResource(R.drawable.intermediario.backRed);
            // Tornar imagem/botão de resetar a tela visivel
            recarregarBtn.setVisibility(View.VISIBLE);
        }
    }    

    public void opcao3() {
        // Verificar opção e mudar de cor
        if (textR[seq2[2]] == textR[seq1[valCor]]) {
            back03.setImageResource(R.drawable.intermediario.backGreen);
            if (recarregarBtn.Visibility =! VISIBLE) {
                proximo();
            }
        } else {
            back03.setImageResource(R.drawable.intermediario.backRed);
            // Tornar imagem/botão de resetar a tela visivel
            recarregarBtn.setVisibility(View.VISIBLE);
        }
    }

    public void reset() {
        // Tornar todos os fundos pretos
        back01.setImageResource(R.drawable.intermediario.backGrey);
        back02.setImageResource(R.drawable.intermediario.backGrey);
        back03.setImageResource(R.drawable.intermediario.backGrey);
        // Tornar imagem/botão de resetar a tela invisivel
        recarregarBtn.setVisibility(View.INVISIBLE);
    }

    public void proximo() {
        // Resetar botões
        back01.setImageResource(R.drawable.intermediario.backGrey);
        back02.setImageResource(R.drawable.intermediario.backGrey);
        back03.setImageResource(R.drawable.intermediario.backGrey);
        // Incrementar valCor para trocar a imagem da cor
        valCor++;
        if (valCor >= images.length) {
            Intent intent = new Intent( this, Parabens.class);
            startActivity(intent);
        } else {
            imageView.setImageResource(images[seq1[valCor]]);
        }
    }
}
