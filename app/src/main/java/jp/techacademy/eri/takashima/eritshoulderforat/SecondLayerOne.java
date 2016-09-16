package jp.techacademy.eri.takashima.eritshoulderforat;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.util.Log;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class SecondLayerOne extends AppCompatActivity implements View.OnClickListener {

    private Button secondlayeroneyesbutton;
    private Button secondlayeronenobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layer_one);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        secondlayeroneyesbutton = (Button) findViewById(R.id.second_layer_one_yes);
        secondlayeroneyesbutton.setOnClickListener(this);

        secondlayeronenobutton = (Button) findViewById(R.id.second_layer_one_no);
        secondlayeronenobutton.setOnClickListener(this);
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
        if(view.getId()==R.id.second_layer_one_yes) {
            Intent intent = new Intent(this, ThirdLayerOne.class);
            startActivity(intent);
        } else if(view.getId()==R.id.second_layer_one_no) {
            Intent intent = new Intent(this, SecondLayerTwo.class);
            startActivity(intent);
        }
    }

}
