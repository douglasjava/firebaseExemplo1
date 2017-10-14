package com.diasestudos.firebaseapp.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = databaseReference.child("igrejas");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/**
 BeanCulto culto = new BeanCulto();
 culto.setData("15-10-2017");
 culto.setIgreja("colorado");
 culto.setObreiroLouvor("Douglas");
 culto.setObreiroMensagem("PR. Antônio Marcos");
 culto.setObreiroPorta("Danilio");
 culto.setFrequencia("34");

 List<String> louvores = new ArrayList<String>();
 louvores.add("43 - Vou Clamar");
 louvores.add("2222 - Como Desistir");
 louvores.add("7777 - Em nossos lábios");

 culto.setLouvores(louvores);

 usuarioReferencia.child(culto.getData()).setValue(culto); **/


        usuarioReferencia.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.i("FireBase", dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

}
