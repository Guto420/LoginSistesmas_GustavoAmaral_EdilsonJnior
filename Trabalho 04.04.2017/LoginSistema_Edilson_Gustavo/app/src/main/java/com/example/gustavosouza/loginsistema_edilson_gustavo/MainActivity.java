package com.example.gustavosouza.loginsistema_edilson_gustavo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText senha;
    EditText login;
    TextView mensagem;
    Button butao;
    Button butao1;
    Boolean sim;
    EditText confirmar;
    TextView confirmartext;
    TextView registramlk;
    Button butao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        senha = (EditText) findViewById(R.id.consenha);
        login = (EditText) findViewById(R.id.login);
        mensagem = (TextView) findViewById(R.id.Mensagem);
        butao = (Button) findViewById(R.id.button);
        butao1 = (Button) findViewById(R.id.register);
        confirmar = (EditText) findViewById(R.id.consenha);
        confirmartext = (TextView) findViewById(R.id.confirmarsenha);
        registramlk = (TextView) findViewById(R.id.registralegal);
        butao2 = (Button) findViewById(R.id.register2);
        sim = true;

        butao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!senha.getText().toString().equals("cozido") && !login.getText().toString().equals("milho")) {
                   // mensagem.setText("Tente de novo!");
                    //mensagemm de erro
                    Toast.makeText(MainActivity.this, "Tente de novo", Toast.LENGTH_SHORT).show();
                    //mensagem.setVisibility(View.VISIBLE);
                } else {
                    //mensagem.setText("Login com sucesso");
                    //mensagemm de erro
                    Toast.makeText(MainActivity.this, "Login com sucesso", Toast.LENGTH_SHORT).show();
                    //mensagem.setVisibility(View.VISIBLE);

                }
            }
        });

        butao1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (sim) {
                    confirmar.setVisibility(View.VISIBLE);
                    confirmartext.setVisibility(View.VISIBLE);
                    butao1.setVisibility(View.INVISIBLE);
                    butao2.setVisibility(View.VISIBLE);
                    butao2.setText("Registrar");
                    registramlk.setVisibility(View.INVISIBLE);
                }
            }

        });

        butao2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!senha.getText().toString().equals("cozido")) {

                    //registramlk.setText("Registro Incorreto");
                    //registramlk.setVisibility(View.VISIBLE);
                    //mensagemm de erro
                    Toast.makeText(MainActivity.this, "Registro Incorreto", Toast.LENGTH_SHORT).show();
                } else {
                    //registramlk.setText("Registro Feito");
                    //registramlk.setVisibility(View.VISIBLE);
                    //mensagemm de erro
                    Toast.makeText(MainActivity.this, "Registro Correto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
