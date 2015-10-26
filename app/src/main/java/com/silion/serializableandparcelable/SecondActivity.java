package com.silion.serializableandparcelable;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by silion on 2015/10/14.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        LinearLayout layout = (LinearLayout) findViewById(R.id.contentLayout);
        TextView serializableTextView = new TextView(this);
        TextView parcelableTextView = new TextView(this);
        SerializableObject serializableObject = (SerializableObject) getIntent().getSerializableExtra("serializable");
        ParcelableObject parcelableObject = getIntent().getParcelableExtra("parcelable");
        if (serializableObject != null) {
            serializableTextView.setText("str = " + serializableObject.getStr() + ", i = " + serializableObject.getI());
        }
        if (parcelableObject != null) {
            parcelableTextView.setText("str = " + parcelableObject.getStr() + ", i = " + parcelableObject.getI());
        }
        layout.addView(serializableTextView);
        layout.addView(parcelableTextView);
    }
}
