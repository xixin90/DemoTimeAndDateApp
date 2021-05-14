package sg.edu.rp.c346.id20019652.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button getBtnDisplayTime;
    TextView tvDisplay;
    Button btnReset;Demo Checkbox Example

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        getBtnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewBtId(R.id.buttonReset);

        getBtnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //time: includes hour and minute

                String time = "Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();
                tvDisplay.setText(time);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //calendar: includes day, month and year

                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();

                String date = "Date is " + day + "/" + month + "/" + year;
                tvDisplay.setText(date);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //set date 1/1/2021
                //set time 14:15 PM

                dp.updateDate(2021, 1, 1);
                tp.setCurrentHour(14);
                tp.setCurrentMinute(15);
            }
        });
    }
}