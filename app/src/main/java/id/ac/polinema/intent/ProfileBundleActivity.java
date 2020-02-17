package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        String usernameValue = extras.getString("username");
        String nameValue = extras.getString("name");
        int ageValue = extras.getInt("age");
        if (extras != null) {
            // TODO: display value here

            usernameText.setText(usernameValue);
            nameText.setText(nameValue);
            ageText.setText(String.valueOf(ageValue));
        }
    }

}
