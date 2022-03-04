package com.example.pincodeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;

import org.w3c.dom.Text;

import java.net.URL;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
     ProgressDialog progressDialog;
    TextInputEditText editText1, editpin ;
    TextView textView1, textView2;
    CardView btncard;
    String BASE_URl="https://api.postalpincode.in/";
    Retrofit retrofit;
   myapi api;
   String pin = "";
   Call<List<Model>> call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // editText1 = findViewById(R.id.edittext);
        btncard = findViewById(R.id.btncard);
        textView2 = findViewById(R.id.result);
        editpin = findViewById(R.id.editpin);
        progressDialog= new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading...");



        btncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pin = editpin.getText().toString();
                getDistrict();
            }
        });

    }
    public void getDistrict(){
        progressDialog.show();
        retrofit= new Retrofit.Builder().baseUrl(BASE_URl)
                .addConverterFactory(GsonConverterFactory.create()).build();

        api=retrofit.create(myapi.class);
        call=api.getmodel(pin);



        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                // List<Model> data=response.body();
                Log.d("responedata", "onResponse: "+response.code());
               List<Model> mods =response.body();
                 textView2.setText(mods.get(0).getPostOffice().get(0).getDistrict()+"\n"+ mods.get(0).getPostOffice().get(0).country+"\n"+mods.get(0).getPostOffice().get(0).pincode);
                Log.d("responedata", "onResponse: "+new Gson().toJson(response.body()));
                if (response.body().get(0).getStatus().equalsIgnoreCase("Success")){

                }


                else
                    Toast.makeText(getApplicationContext(), "No records found", Toast.LENGTH_LONG);
            progressDialog.dismiss();
            }
            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                progressDialog.dismiss();
            }
        });

    }
}