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

public class SecondLayerTwo extends AppCompatActivity implements View.OnClickListener {

    private Button secondlayertwoyesbutton;
    private Button secondlayertwonobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layer_two);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        secondlayertwoyesbutton = (Button) findViewById(R.id.second_layer_two_yes);
        secondlayertwoyesbutton.setOnClickListener(this);

        secondlayertwonobutton = (Button) findViewById(R.id.second_layer_two_no);
        secondlayertwonobutton.setOnClickListener(this);
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
        if (view.getId() == R.id.second_layer_two_yes) {
            Intent intent = new Intent(this, ThirdLayerTwo.class);
            startActivity(intent);
        } else if (view.getId() == R.id.second_layer_two_no) {
            Intent intent = new Intent(this, SecondLayerThree.class);
            startActivity(intent);
        }
    }
}




