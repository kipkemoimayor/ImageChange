package com.example.collo.imagechange;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView img;
    private static Button bnt;
    private int current_image;
    int[]images={R.mipmap.ic_collo,R.mipmap.ic_collo2,R.mipmap.ic_launcher};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClicked();
    }


    public void buttonClicked(){
        img=(ImageView)findViewById(R.id.ima);
        bnt=(Button)findViewById(R.id.button);
        final MediaPlayer np=MediaPlayer.create(this,R.raw.rj);
        bnt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image++;
                        current_image=current_image % images.length;
                        img.setImageResource(images[current_image]);

                        np.start();





                    }
                }
        );

    }


}
