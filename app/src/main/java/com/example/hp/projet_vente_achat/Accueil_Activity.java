package com.example.hp.projet_vente_achat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Accueil_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_);


/**********************************************************************************************************************************/

        TextView Resultat=(TextView)findViewById(R.id.resultat_login_mdp);
        Bundle b=getIntent().getExtras();
        String L=b.getString("Login1");
        String M=b.getString("Mdp1");
        Resultat.setText(L);

    }



    /***************************Evenement Click du boutton achat*************************************************/

    public void B_achat(View view) {

        Intent myIntent=new Intent(this,Traitement_Achat_Activity.class);

        startActivity(myIntent);




    }

    /****************************Evenement Click du boutton vente************************************************/


    public void Button_Vente(View view) {

        
        Intent myIntent=new Intent(this,Traitement_Vente_Activity.class);

        startActivity(myIntent);


    }

}
