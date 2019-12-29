package skr.app.dev.myfirstandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IntentDemo extends AppCompatActivity {

    TextView simpleText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo);

        simpleText = findViewById(R.id.sim_text);
        Bundle bundle = getIntent().getBundleExtra("key_bundle");
        String text = bundle.getString("str_key");

        simpleText.setText(text);
    }
}
