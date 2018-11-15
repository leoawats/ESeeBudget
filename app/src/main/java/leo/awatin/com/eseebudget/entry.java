package leo.awatin.com.eseebudget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class entry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_entry );
    }

    public void toIndex(View v) {
        Intent i = new Intent(this, index.class);
        startActivity(i);
    }
}
