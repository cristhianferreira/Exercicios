package com.example.alunos.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.alunos.myapplication.adapter.PessoaAdapter;
import com.example.alunos.myapplication.model.Pessoa;

import java.util.ArrayList;

public class mostraListaDinamica extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_mostra_lista_dinamica);

    // ListView listView=(ListView) findViewById(R.id.listview);

     ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
     lista.add(new Pessoa("Pedro","3690-1234",12));
     lista.add(new Pessoa("Joa","3690-4321",18));

     setListAdapter(new PessoaAdapter(this,lista));
    }
}
