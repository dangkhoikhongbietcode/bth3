package com.example.bth03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddProductActivity extends AppCompatActivity {
    EditText editId,editName,editCode,editBrand,editModel,
    editDescription,editImages,editColor,editPrice;
    Button buttonAddSubmit;
    ProductList productList;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        editId = (EditText) findViewById(R.id.editId);
        editName = (EditText) findViewById(R.id.editName);
        editCode = (EditText) findViewById(R.id.editCode);
        editBrand = (EditText) findViewById(R.id.editBrand);
        editModel = (EditText) findViewById(R.id.editModel);
        editDescription = (EditText) findViewById(R.id.editDescription);
        editImages = (EditText) findViewById(R.id.editImages);
        editColor = (EditText) findViewById(R.id.editColor);
        editPrice = (EditText) findViewById(R.id.editPrice);
        buttonAddSubmit = (Button) findViewById(R.id.buttonAddSubmit);
        buttonAddSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id,price;
                String name,code,brand,model,description,images,color;
                id = Integer.parseInt(editId.getText().toString());

                name = editName.getText().toString();
                code = editCode.getText().toString();
                brand = editBrand.getText().toString();
                model = editModel.getText().toString();
                description = editDescription.getText().toString();
                images = editImages.getText().toString();
                color = editColor.getText().toString();
                price = Integer.parseInt(editPrice.getText().toString());

                Product product = new Product(id,name,code,brand,model,description,color,
                        images,price);
                if (product.checkExistedID()){
                    productList.addProduct(product);
                    Intent intent = new Intent(AddProductActivity.this,MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("id",id);
                    bundle.putInt("price",price);
                    bundle.putString("name",name);
                    bundle.putString("code",code);
                    bundle.putString("brand",brand);
                    bundle.putString("model",model);
                    bundle.putString("description",description);
                    bundle.putString("images",images);
                    bundle.putString("color",color);
                    intent.putExtra("ProductAdded",bundle);
                    startActivity(intent);
                }
              else{
                    Toast.makeText(getApplicationContext(),"ID đã bị trùng",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}