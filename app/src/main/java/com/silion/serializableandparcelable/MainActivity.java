package com.silion.serializableandparcelable;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button serializableButton = (Button) findViewById(R.id.serializable);
        serializableButton.setOnClickListener(this);
        Button parcelableButton = (Button) findViewById(R.id.parcelable);
        parcelableButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.serializable: {
                serializableMethod();
                break;
            }
            case R.id.parcelable: {
                parcelableMethod();
                break;
            }
            default:
                break;
        }
    }

    public void parcelableMethod() {
        ParcelableObject parcelableObject = new ParcelableObject();
        parcelableObject.setStr("silion - parcelable");
        parcelableObject.setI(0);
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("parcelable", parcelableObject);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void serializableMethod() {
        SerializableObject serializableObject = new SerializableObject();
        serializableObject.setStr("silion - serializable");
        serializableObject.setI(1);
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("serializable", serializableObject);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
