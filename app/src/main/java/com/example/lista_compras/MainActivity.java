package com.example.lista_compras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lista_compras.Produto;

public class MainActivity extends AppCompatActivity {

    private EditText nomeProduto;
    private EditText marcaProduto;
    private EditText qtdProduto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeProduto = findViewById(R.id.NomeProduto);
        marcaProduto = findViewById(R.id.marcaProduto);
        qtdProduto = findViewById(R.id.qtdProdutos);
    }

    public void salvarProduto(View view){
        String produto = nomeProduto.getText().toString();
        String marca = marcaProduto.getText().toString();
        int qtd = Integer.parseInt(qtdProduto.getText().toString());

        Produto produtos = new Produto();
        produtos.setNomeProduto(produto);
        produtos.setNomeMarca(marca);
        produtos.setQtd(qtd);


    }


}