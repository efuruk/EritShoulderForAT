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

public class FourthLayerTwo extends AppCompatActivity implements View.OnClickListener {

    private Button fourthlayertwoyesbutton;
    private Button fourthlayertwonobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_layer_two);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        fourthlayertwoyesbutton = (Button) findViewById(R.id.fourth_layer_two_yes);
        fourthlayertwoyesbutton.setOnClickListener(this);

        fourthlayertwonobutton = (Button) findViewById(R.id.fourth_layer_two_no);
        fourthlayertwonobutton.setOnClickListener(this);
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
        if (view.getId() == R.id.fourth_layer_two_yes) {
            Intent intent = new Intent(this, ResultFive.class);
            startActivity(intent);
        } else if (view.getId() == R.id.fourth_layer_two_no) {
            Intent intent = new Intent(this, FifthLayerOne.class);
            startActivity(intent);
        }

    }
}


