package com.example.potato;

import android.content.res.Resources;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void checkClicked(View v) {
        // get string info from activated checkbox object
        CheckBox checkbox = (CheckBox) v;
        String current = checkbox.getText().toString();

        // get id of view which corresponds with the clicked checkbox
        // used this: https://stackoverflow.com/questions/4865244/android-using-findviewbyid-with-a-string-in-a-loop
        int viewID = getResources().getIdentifier(current, "id", getPackageName());

        // using the R.id. method would result in a lot more lines of code
        ImageView image = findViewById(viewID);

        // simple logic to set visibility of clicked ImageView
        if (checkbox.isChecked()){
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }

    //
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // (I tried multiple 'for loop' solutions but eventually i gave up...)

        // saves all of the visibility states, to be remembered for layout switch
        ImageView armsImage = findViewById(R.id.Arms);
        outState.putInt("arms", armsImage.getVisibility());

        ImageView shoesImage = findViewById(R.id.Shoes);
        outState.putInt("shoes", shoesImage.getVisibility());

        ImageView noseImage = findViewById(R.id.Nose);
        outState.putInt("nose", noseImage.getVisibility());

        ImageView earsImage = findViewById(R.id.Ears);
        outState.putInt("ears", earsImage.getVisibility());

        ImageView glassesImage = findViewById(R.id.Glasses);
        outState.putInt("glasses", glassesImage.getVisibility());

        ImageView mustacheImage = findViewById(R.id.Mustache);
        outState.putInt("mustache", mustacheImage.getVisibility());

        ImageView mouthImage = findViewById(R.id.Mouth);
        outState.putInt("mouth", mouthImage.getVisibility());

        ImageView eyebrowsImage = findViewById(R.id.Eyebrows);
        outState.putInt("eyebrows", eyebrowsImage.getVisibility());

        ImageView eyesImage = findViewById(R.id.Eyes);
        outState.putInt("eyes", eyesImage.getVisibility());

        ImageView hatImage = findViewById(R.id.Hat);
        outState.putInt("hat", hatImage.getVisibility());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // recover all of the visibility states from before layout switch
        int armsVisibility = savedInstanceState.getInt("arms");
        ImageView armsImage = findViewById(R.id.Arms);
        armsImage.setVisibility(armsVisibility);

        int shoesVisibility = savedInstanceState.getInt("shoes");
        ImageView shoesImage = findViewById(R.id.Shoes);
        shoesImage.setVisibility(shoesVisibility);

        int noseVisibility = savedInstanceState.getInt("nose");
        ImageView noseImage = findViewById(R.id.Nose);
        noseImage.setVisibility(noseVisibility);

        int earsVisibility = savedInstanceState.getInt("ears");
        ImageView earsImage = findViewById(R.id.Ears);
        earsImage.setVisibility(earsVisibility);

        int glassesVisibility = savedInstanceState.getInt("glasses");
        ImageView glassesImage = findViewById(R.id.Glasses);
        glassesImage.setVisibility(glassesVisibility);

        int mustacheVisibility = savedInstanceState.getInt("mustache");
        ImageView mustacheImage = findViewById(R.id.Mustache);
        mustacheImage.setVisibility(mustacheVisibility);

        int mouthVisibility = savedInstanceState.getInt("mouth");
        ImageView mouthImage = findViewById(R.id.Mouth);
        mouthImage.setVisibility(mouthVisibility);

        int eyebrowsVisibility = savedInstanceState.getInt("eyebrows");
        ImageView eyebrowsImage = findViewById(R.id.Eyebrows);
        eyebrowsImage.setVisibility(eyebrowsVisibility);

        int eyesVisibility = savedInstanceState.getInt("eyes");
        ImageView eyesImage = findViewById(R.id.Eyes);
        eyesImage.setVisibility(eyesVisibility);

        int hatVisibility = savedInstanceState.getInt("hat");
        ImageView hatImage = findViewById(R.id.Hat);
        hatImage.setVisibility(hatVisibility);
    }
}
