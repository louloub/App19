package com.example.haroldyourdj.app19;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CoucouReceiver extends BroadcastReceiver {
    private static final String NOM_USER = "NOM";

    // Déclenché dès qu'on reçoit un broadcast intent qui réponde aux filtres déclarés dans le Manifest
    @Override
    public void onReceive(Context context, Intent intent) {

            // On récupère le nom de l'utilisateur
            String nom = intent.getStringExtra(NOM_USER);
            Toast.makeText(context, "Coucou " + nom + " !", Toast.LENGTH_LONG).show();
        }
    }


