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

public class FifthLayerOne extends AppCompatActivity implements View.OnClickListener {

    private Button fifthlayeroneyesbutton;
    private Button fifthlayeronenobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_layer_one);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        fifthlayeroneyesbutton = (Button) findViewById(R.id.fifth_layer_one_yes);
        fifthlayeroneyesbutton.setOnClickListener(this);

        fifthlayeronenobutton = (Button) findViewById(R.id.fifth_layer_one_no);
        fifthlayeronenobutton.setOnClickListener(this);
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
        if (view.getId() == R.id.fifth_layer_one_yes) {
            Intent intent = new Intent(this, ResultSix.class);
            startActivity(intent);
        } else if (view.getId() == R.id.fifth_layer_one_no) {
            Intent intent = new Intent(this, Doctor.class);
            startActivity(intent);
        }

    }
}
