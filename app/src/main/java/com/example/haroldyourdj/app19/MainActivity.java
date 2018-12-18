package com.example.haroldyourdj.app19;

import android.os.Bundle;
import android.app.Activity;
import android.content.IntentFilter;

public class MainActivity extends Activity {

    private static final String COUCOU = "coucou";
    private IntentFilter filtre = null;
    private CoucouReceiver receiver = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filtre = new IntentFilter(COUCOU);
        receiver = new CoucouReceiver();
    }

    @Override
    public void onResume() {
        super.onResume();
        registerReceiver(receiver, filtre);
    }

    /** Si vous déclarez votre receiver dans le onResume, n'oubliez pas qu'il faut l'arrêter dans le onPause **/
    @Override
    public void onPause() {
        super.onPause();
        unregisterReceiver(receiver);
    }
}