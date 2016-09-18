package jp.techacademy.eri.takashima.eritshoulderforat;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ResultOne extends AppCompatActivity implements View.OnClickListener {

    private Button resultonebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_one);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        resultonebutton = (Button) findViewById(R.id.resultone);
        resultonebutton.setOnClickListener(this);

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
        if(view.getId()==R.id.resultone) {
            Intent intent = new Intent(this, RehabResultOneFirst.class);
            startActivity(intent);
        }
    }
}
