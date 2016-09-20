package jp.techacademy.eri.takashima.eritshoulderforat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button frontbutton;
    private Button topbutton;
    private Button backbutton;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        frontbutton = (Button) findViewById(R.id.frontbutton);
        frontbutton.setOnClickListener(this);

        topbutton = (Button) findViewById(R.id.topbutton);
        topbutton.setOnClickListener(this);

        backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.frontbutton) {
            Intent intent = new Intent(this, SecondLayerOne.class);
            startActivity(intent);
        } else if(view.getId()==R.id.topbutton) {
            Intent intent = new Intent(this, SecondLayerTwo.class);
            startActivity(intent);
        } else if(view.getId()==R.id.backbutton) {
            Intent intent = new Intent(this, SecondLayerThree.class);
            startActivity(intent);
        }
    }


}
