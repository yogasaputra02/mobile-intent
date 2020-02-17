package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickhandleExplicitIntent(View view){
        Intent intent = new Intent(this,ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void clickhandleExit(View view){
        finish();
    }

    public void clickhandleImplicitIntent(View view){
        Intent intent = new Intent(this,ImplicitIntentActivity.class);
        startActivity(intent);
    }

    public void clickhandleBundleIntent(View view){
        Intent intent = new Intent(this,BundleActivity.class);
        startActivity(intent);
    }

    public void clickhandleParcelableIntent(View view){
        Intent intent = new Intent(this,ParcelableActivity.class);
        startActivity(intent);
    }
}
