package jp.techacademy.eri.takashima.eritshoulderforat;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdLayerOne extends AppCompatActivity implements View.OnClickListener {

    private Button thirdlayeroneyesbutton;
    private Button thirdlayeronenobutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_layer_one);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        thirdlayeroneyesbutton = (Button) findViewById(R.id.third_layer_one_yes);
        thirdlayeroneyesbutton.setOnClickListener(this);

        thirdlayeronenobutton = (Button) findViewById(R.id.third_layer_one_no);
        thirdlayeronenobutton.setOnClickListener(this);
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
        if(view.getId()==R.id.third_layer_one_yes) {
            Intent intent = new Intent(this, ResultOne.class);
            startActivity(intent);
        } else if(view.getId()==R.id.third_layer_one_no) {
            Intent intent = new Intent(this, FourthLayerOne.class);
            startActivity(intent);
        }
    }

}