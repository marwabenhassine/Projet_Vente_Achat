package com.example.hp.projet_vente_achat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Traitement_Compte_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traitement__compte_);
    }




    /**********************************méthode pour le Button confirmation ***********************************************************/

    public void B_confermer(View view) {


        TextView Remarque=(TextView)findViewById(R.id.Remarque_compte);
        TextView OK=(TextView)findViewById(R.id.ok);
        EditText Nom=(EditText)findViewById(R.id.nom);
        EditText Prenom=(EditText)findViewById(R.id.prenom);
        EditText Adresse=(EditText)findViewById(R.id.adr);
        EditText Email=(EditText)findViewById(R.id.email);
        EditText N_tel=(EditText)findViewById(R.id.N_tel);

/************************************message de Remarque ***************************************************************************/

        Remarque.setText("Rq: nous avant envoyer un code sur votre Email :"+Email.getText().toString()+", N oublier pas  ce code en cas  vous oubliez votre mot de passe avec ce code nous pouvant le récupérer");
        OK.setText("OK");
        Toast.makeText(this,"Merci Mr/Mdm "+Nom.getText().toString()+" "+Prenom.getText().toString()+" pour votre Inscription",Toast.LENGTH_LONG).show();

    }

    /*****************************Retour à l'activité Login_Mdp_Activity*******************************/

    public void B_ok(View view) {

        Intent myIntent=new Intent(this,Login_Mdp_Activity.class);
        startActivity(myIntent);

    }


}
