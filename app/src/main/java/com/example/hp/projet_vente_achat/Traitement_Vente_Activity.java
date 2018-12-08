package com.example.hp.projet_vente_achat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Traitement_Vente_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traitement__vente_);
    }


    /************************Enregistrement du  produit*********************/

    public void Button_Enrg_produit(View view) {

        /***************************************************************************************/
        EditText Nom=(EditText)findViewById(R.id.nom);
        EditText Prenom=(EditText)findViewById(R.id.prenom);
        EditText N_tel=(EditText)findViewById(R.id.N_tel);
        EditText Desc_Produit=(EditText)findViewById(R.id.desc_produit);
        EditText Nom_Produit=(EditText)findViewById(R.id.N_produit);
        EditText Prix=(EditText)findViewById(R.id.prix);


        Toast.makeText(this,"Mr/Mdm : " + Nom.getText().toString() + " Votre produit est enregistrer",Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Merci..!",Toast.LENGTH_LONG).show();

        Intent myIntent=new Intent(this,Traitement_Achat_Activity.class);

        Bundle b = new Bundle();
        b.putString("Nom1",Nom.getText().toString());
        b.putString("Prenom1",Prenom.getText().toString());
        b.putString("N_tel1",N_tel.getText().toString());
        b.putString("Desc_Produit1",Desc_Produit.getText().toString());
        b.putString("Nom_Produit1",Nom_Produit.getText().toString());
        b.putString("Prix1",Prix.getText().toString());

        myIntent.putExtras(b);

        startActivity(myIntent);



    }


    /**************************methode Annuler*************************/

    public void Button_Annuler_produit(View view) {


        EditText Nom=(EditText)findViewById(R.id.nom);
        EditText Prenom=(EditText)findViewById(R.id.prenom);
        EditText N_tel=(EditText)findViewById(R.id.N_tel);
        EditText Desc_Produit=(EditText)findViewById(R.id.desc_produit);
        EditText Nom_Produit=(EditText)findViewById(R.id.N_produit);
        EditText Prix=(EditText)findViewById(R.id.prix);


        Nom.setText("");
        Prenom.setText("");
        N_tel.setText("");
        Desc_Produit.setText("");
        Nom_Produit.setText("");
        Prix.setText("");



    }

}
