package jp.techacademy.eri.takashima.eritshoulderforat;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdLayerThree extends AppCompatActivity implements View.OnClickListener {

    private Button thirdlayerthreeyesbutton;
    private Button thirdlayerthreenobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_layer_three);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        thirdlayerthreeyesbutton = (Button) findViewById(R.id.third_layer_three_yes);
        thirdlayerthreeyesbutton.setOnClickListener(this);

        thirdlayerthreenobutton = (Button) findViewById(R.id.third_layer_three_no);
        thirdlayerthreenobutton.setOnClickListener(this);
    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.third_layer_three_yes) {
            Intent intent = new Intent(this, ResultThree.class);
            startActivity(intent);
        } else if (view.getId() == R.id.third_layer_three_no) {
            Intent intent = new Intent(this, FourthLayerTwo.class);
            startActivity(intent);
        }


    }
}
