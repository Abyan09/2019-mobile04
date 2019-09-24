package id.ac.polinema.intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

import static id.ac.polinema.intent.ParcelableActivity.USER_KEY;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            User use = extras.getParcelable(USER_KEY);

            String username = use.getUsername();
            String name = use.getName();
            int age = use.getAge();

            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(String.valueOf(age));
        }
    }
}
