package com.blue.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;
import static java.util.Calendar.getInstance;

public class MainActivity extends AppCompatActivity {

    EditText editYear;
    TextView textResult;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editYear = findViewById(R.id.editYear);
        textResult = findViewById(R.id.textResult);
        but = findViewById(R.id.but);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 입력한거 가져오기
                String year = editYear.getText().toString().trim();
                Log.i("CAT MAIN", year);

                // 값 비어있는지 확인
                if (year.isEmpty()){
                    Snackbar.make(but, "입력 필수", Snackbar.LENGTH_SHORT).show();
                    return;
                }


                // String 문자열로 받았으니 Integer 숫자형으로 변경
                Integer inYear = Integer.parseInt(year);

                // 현재 년도를 가져오기
                Calendar now = getInstance();
                int currentYear = now.get(Calendar.YEAR);

                // 날짜 계산하기
                Integer age = currentYear - inYear;

                textResult.setText("" + age + "살 입니다."); // ""+문자열로 다시 변경해서 화면 출력

            }
        });
    }
}