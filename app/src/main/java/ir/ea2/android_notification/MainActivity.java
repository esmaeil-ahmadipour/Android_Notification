package ir.ea2.android_notification;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    private Button btnSampleNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        clickListeners();
    }

    private void clickListeners() {
        btnSampleNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomNotification.getInstance().sampleNotification(context);
            }
        });
    }

    private void setViews() {
        btnSampleNotification = (Button) findViewById(R.id.main_btn_sample_notification);
    }
}
