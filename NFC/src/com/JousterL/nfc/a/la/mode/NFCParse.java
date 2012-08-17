package com.JousterL.nfc.a.la.mode;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NFCParse extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfcparse);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_nfcparse, menu);
        return true;
    }
}
