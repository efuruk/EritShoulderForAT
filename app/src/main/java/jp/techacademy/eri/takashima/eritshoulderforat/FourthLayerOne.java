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


public class FourthLayerOne extends AppCompatActivity implements View.OnClickListener {

    private Button fourthlayeroneyesbutton;
    private Button fourthlayeronenobutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_layer_one);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        fourthlayeroneyesbutton = (Button) findViewById(R.id.fourth_layer_one_yes);
        fourthlayeroneyesbutton.setOnClickListener(this);

        fourthlayeronenobutton = (Button) findViewById(R.id.fourth_layer_one_no);
        fourthlayeronenobutton.setOnClickListener(this);
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
        if (view.getId() == R.id.fourth_layer_one_yes) {
            Intent intent = new Intent(this, ResultFour.class);
            startActivity(intent);
        } else if (view.getId() == R.id.fourth_layer_one_no) {
            Intent intent = new Intent(this, Doctor.class);
            startActivity(intent);
        }

    }
}
