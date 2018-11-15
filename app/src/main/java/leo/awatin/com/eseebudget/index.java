package leo.awatin.com.eseebudget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_index );
    }

    public void toEntry(View v) {
        Intent i = new Intent(this, entry.class);
        startActivity(i);
    }
}
