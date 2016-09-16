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

public class SecondLayerThree extends AppCompatActivity implements View.OnClickListener {

    private Button secondlayerthreeyesbutton;
    private Button secondlayerthreenobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layer_three);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        secondlayerthreeyesbutton = (Button) findViewById(R.id.second_layer_three_yes);
        secondlayerthreeyesbutton.setOnClickListener(this);

        secondlayerthreenobutton = (Button) findViewById(R.id.second_layer_three_no);
        secondlayerthreenobutton.setOnClickListener(this);
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
        if (view.getId() == R.id.second_layer_three_yes) {
            Intent intent = new Intent(this, ThirdLayerThree.class);
            startActivity(intent);
        } else if (view.getId() == R.id.second_layer_three_no) {
            Intent intent = new Intent(this, SecondLayerTwo.class);
            startActivity(intent);
        }
    }
}




