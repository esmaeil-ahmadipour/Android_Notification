package ir.ea2.android_notification;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    private Button btnShowNotification;
    private RadioButton rdBtnSample, rdBtnLargeIcon, rdBtnPriority ;
    private RadioGroup rdGroup;
    private int checkedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        clickListener();
    }

    private void clickListener() {
        btnShowNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkedRadioButton = rdGroup.getCheckedRadioButtonId();
                switch (checkedRadioButton) {
                    case R.id.ac_main_rdBtn_sampleNotification: {
                        CustomNotification.getInstance().sampleNotification(context);
                    }
                    break;
                    case R.id.ac_main_rdBtn_largeIconNotification: {
                        CustomNotification.getInstance().largeIconNotification(context);
                    }
                    break;
                    case R.id.ac_main_rdBtn_priorityNotification: {
                        CustomNotification.getInstance().priorityNotification(context);
                    }
                    break;
                    default:
                        Toast.makeText(context, "Please , Select One Item!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setViews() {
        btnShowNotification = (Button) findViewById(R.id.main_btn_showNotification);
        rdBtnPriority = (RadioButton) findViewById(R.id.ac_main_rdBtn_priorityNotification);
        rdBtnLargeIcon = (RadioButton) findViewById(R.id.ac_main_rdBtn_largeIconNotification);
        rdBtnSample = (RadioButton) findViewById(R.id.ac_main_rdBtn_sampleNotification);
        rdGroup = (RadioGroup) findViewById(R.id.ac_main_rdGroup);
    }

}
