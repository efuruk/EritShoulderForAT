package jp.techacademy.eri.takashima.eritshoulderforat;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RehabResultFourFirst extends AppCompatActivity implements View.OnClickListener {

    private Button resultfourfirstbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehab_result_four_first);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        resultfourfirstbutton = (Button) findViewById(R.id.resultfourfirst);
        resultfourfirstbutton.setOnClickListener(this);
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
        if(view.getId()==R.id.resultfourfirst) {
            Intent intent = new Intent(this, RehabResultFourSecond.class);
            startActivity(intent);
        }
    }
}
