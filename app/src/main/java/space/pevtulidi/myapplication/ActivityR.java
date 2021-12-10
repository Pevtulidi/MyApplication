package space.pevtulidi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class ActivityR extends AppCompatActivity {

        ImageButton imageButton8;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_r);

            ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);

            imageButton8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(space.pevtulidi.myapplication.ActivityR.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }}
