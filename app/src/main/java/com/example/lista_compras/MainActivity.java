package com.example.lista_compras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText nomeProduto;
    private EditText marcaProduto;
    private EditText qtdProduto;
    private TextView teste;
    private ListView lv;
    private ArrayList<Produto> listaProdutosView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listaProdutos);
        listaProdutosView = new ArrayList<>();
        Context context = this;
        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, listaProdutosView);
        lv.setAdapter(adapter);

        nomeProduto = findViewById(R.id.NomeProduto);
        marcaProduto = findViewById(R.id.marcaProduto);
        qtdProduto = findViewById(R.id.qtdProdutos);
    }

    public void salvarProduto(View view){
        String produto = nomeProduto.getText().toString();
        String marca = marcaProduto.getText().toString();
        int qtd = Integer.parseInt(qtdProduto.getText().toString());

        Produto produtos = new Produto(produto, marca, qtd);

        listaProdutosView.add(produtos);
    }


}