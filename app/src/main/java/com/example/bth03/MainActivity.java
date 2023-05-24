package com.example.bth03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button btnadd1,btnadd2,buttonAddProduct;
    ImageButton toCartButton;
    ProductList productList;
    CoordinatorLayout coordinatorLayout ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd1 = (Button) findViewById(R.id.btnadd1);
        btnadd2 = (Button) findViewById(R.id.btnadd2);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        toCartButton = (ImageButton) findViewById(R.id.toCartButton);
        buttonAddProduct = (Button) findViewById(R.id.buttonAddProduct);
        btnadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(coordinatorLayout,"Bạn vừa thêm sản phẩm vào giỏ hàng",
                        Snackbar.LENGTH_LONG).setAction("Tới giỏ hàng",
                            new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, CartActivity.class);
                        startActivity(intent);
                    }
                });
                snackbar.setActionTextColor(Color.RED);
                snackbar.show();
            }
        });
        btnadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(coordinatorLayout,"Bạn vừa thêm sản phẩm vào giỏ hàng",
                        Snackbar.LENGTH_LONG).setAction("Tới giỏ hàng",
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                                Bundle bundle = new Bundle();
                                //bundle.putString("tensp",);
//                                intent.putExtra()
                                startActivity(intent);

                            }
                        });
                snackbar.setActionTextColor(Color.RED);
                snackbar.show();
            }
        });
        toCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CartActivity.class);
                startActivity(intent);
            }
        });
        buttonAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddProductActivity.class);
                startActivity(intent);
            }
        });
    }
}