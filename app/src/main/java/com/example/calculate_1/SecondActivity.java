package com.example.calculate_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(convertCodeToStyle(getAppTheme()));
        setContentView(R.layout.activity_second);
        initChanger();
        Button btnBack = (Button) findViewById(R.id.btnBack);

        View.OnClickListener goToMainActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        };

        btnBack.setOnClickListener(goToMainActivity);

    }

    private int convertCodeToStyle(int codeStyle) {
        switch (codeStyle) {

            case MaterialLight:
                return R.style.AppThemeLight;
            case MaterialLightDarkAction:
                return R.style.AppTheme;
            default:
                return R.style.AppThemeDark;
        }
    }

    private final int MyCoolStyle = 0;
    private final int MaterialLight = 1;
    private final int MaterialLightDarkAction = 2;
    private final int MaterialDark = 3;
    private final String KEY_PREF = "key";
    private final String APP_THEME = "key";

    private void initChanger() {
        initButton(findViewById(R.id.radioButtonMaterialLightDarkAction), MaterialLightDarkAction);
        initButton(findViewById(R.id.radioButtonMaterialDark), MaterialDark);

    }

    private void initButton(RadioButton button, int codeStyle) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });

    }

   private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_PREF, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(APP_THEME, codeStyle);
        editor.apply();
    }

    private int getAppTheme() {
        int codeStyle = MyCoolStyle;
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_PREF, MODE_PRIVATE);
        return sharedPreferences.getInt(APP_THEME, codeStyle);
    }


}