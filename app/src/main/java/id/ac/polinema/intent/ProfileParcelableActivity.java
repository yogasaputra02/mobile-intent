package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import model.User;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);


        // TODO: bind here
        User value = getIntent().getParcelableExtra("user");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here

            usernameText.setText(value.getUsername());
            nameText.setText(value.getName());
            ageText.setText(String.valueOf(value.getAge()));
        }
    }
}
