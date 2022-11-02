package br.fmu.aprendendo_cores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntermediarioActivity extends AppCompatActivity {
   //private static final String textR[] = {R.string.inter01, R.string.inter02}; // Talvez .values.strings
    private int seq1[] = new int[3];
    private int seq2[] = new int[seq1.length];
    private int valCor = 0;

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ButtonView btn1;
    private ButtonView btn2;
    private ButtonView btn3;
    private ButtonView btn4;
    private ButtonView btn5;
    private ButtonView btn6;
    private ButtonView btn7;
    private ButtonView btn8;
    private ButtonView btn9;
    private ImageView recarregarBtn;

    @Overrride
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediario);

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
        
        imageView1 = (ImageView) findViewById(R.id.difi2image1);
        imageView2 = (ImageView) findViewById(R.id.difi2image2);
        imageView3 = (ImageView) findViewById(R.id.difi2image3);

	// Seleciona a primeira imagem
        imagemCor();

        /* Botões */
        btn1 = findViewById(R.id.btn1Inter); 
        btn2 = findViewById(R.id.btn2Inter);  
        btn3 = findViewById(R.id.btn3Inter);
        btn4 = findViewById(R.id.btn4Inter);
        btn5 = findViewById(R.id.btn5Inter);
        btn6 = findViewById(R.id.btn6Inter);
        btn7 = findViewById(R.id.btn7Inter);
        btn8 = findViewById(R.id.btn8Inter);
        btn9 = findViewById(R.id.btn9Inter);
	    
        // Criar possições aleatórias
        sequencia(seq2);

        btn1.setText(textR[seq2[0]]); // Cor padrão
        btn4.setText(textR[seq2[0]]); // Verde
        btn7.setText(textR[seq2[0]]); // Vermelho
        btn2.setText(textR[seq2[1]]);
        btn5.setText(textR[seq2[1]]);
        btn8.setText(textR[seq2[1]]);
        btn3.setText(textR[seq2[2]]);
        btn6.setText(textR[seq2[2]]);
        btn9.setText(textR[seq2[2]]);
        
        /* Botão de reset */
        recarregarBtn = (ImageView) findViewById(R.id.recarregarBtnInter);

        // Tornar invisivel 
        recarregarBtn.setVisibility(View.INVISIBLE);

        recarregarBtn.setOnClickListener(new View.OnClickListener(){
            @Overrride
            public void onClick(View v) {
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

    public void imagemCor() {
        switch (seq1[valCor]) {
            case 0: 
                imageView1.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                break;
            case 1: 
                imageView2.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                break;
            case 2: 
                imageView3.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void opcao1() {
        // Verificar opção e mudar de cor
        if (textR[seq2[0]] == textR[seq1[valCor]]) {
            btn1.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.VISIBLE);

            if (recarregarBtn.Visibility =! VISIBLE) {
                proximo();
            }
        } else {
            // Apenas trocar para vermelho
            btn1.setVisibility(View.INVISIBLE);
            btn7.setVisibility(View.VISIBLE);
            // Tornar imagem/botão de resetar a tela visivel
            recarregarBtn.setVisibility(View.VISIBLE);
        }
    }

    public void opcao2() {
        // Verificar opção e mudar de cor
        if (textR[seq2[1]] == textR[seq1[valCor]]) {
            btn2.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.VISIBLE);

            if (recarregarBtn.Visibility =! VISIBLE) {
                proximo();
            }
        } else {
            btn2.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.VISIBLE);
            // Tornar imagem/botão de resetar a tela visivel
            recarregarBtn.setVisibility(View.VISIBLE);
        }
    }    

    public void opcao3() {
        // Verificar opção e mudar de cor
        if (textR[seq2[2]] == textR[seq1[valCor]]) {
            btn3.setVisibility(View.INVISIBLE);
            btn6.setVisibility(View.VISIBLE);

            if (recarregarBtn.Visibility =! VISIBLE) {
                proximo();
            }
        } else {
            btn3.setVisibility(View.INVISIBLE);
            btn9.setVisibility(View.VISIBLE);
            // Tornar imagem/botão de resetar a tela visivel
            recarregarBtn.setVisibility(View.VISIBLE);
        }
    }

    public void reset() {
        // Tornar todos os fundos pretos
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);

        // Tornar imagem/botão de resetar a tela invisivel
        recarregarBtn.setVisibility(View.INVISIBLE);
    }

    public void proximo() {
        // Resetar botões
       reset();
        // Incrementar valCor para trocar a imagem da cor
        valCor++;
        if (valCor >= seq1.length) {
            //Intent intent = new Intent( this, Parabens.class);
            //startActivity(intent);
        } else {
            imagemCor();
        }
    }
}
