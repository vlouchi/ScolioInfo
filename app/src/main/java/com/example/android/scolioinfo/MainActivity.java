package com.example.android.scolioinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        final Button apaitu = (Button)findViewById(R.id.apa_itu_skoliosis);
        Button gejala = (Button)findViewById(R.id.gejala);
        Button kurva = (Button)findViewById(R.id.kurva_skoliosis);
        Button perawatan = (Button)findViewById(R.id.perawatan);
        Button pencegahan = (Button)findViewById(R.id.pencegahan);
        apaitu.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,apa_itu_skoliosis.class);
                startActivity(pindah);
            }
        });

        gejala.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,gejala_penyebab.class);
                startActivity(pindah);
            }
        });


        kurva.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,jenis_skoliosis.class);
                startActivity(pindah);
            }
        });

        perawatan.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,pengobatan.class);
                startActivity(pindah);
            }
        });

        pencegahan.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,pencegahan.class);
                startActivity(pindah);
            }
        });


    }
}
