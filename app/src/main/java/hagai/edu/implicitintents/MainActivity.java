package hagai.edu.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dial(View view) {
        //data
        Uri tel = Uri.parse("tel:0544513183");

        Intent dialIntent = new Intent(Intent.ACTION_DIAL, tel);

        //intent resolution?
        startActivity(dialIntent);



    }
}
