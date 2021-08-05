package com.example.calculate_1;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnDivision, btnMultiply, btnDecimal, btnClear, btnEqual, btnPow;
    EditText editxtx1;
    float mValueOne, mValueTwo, mValuePow;
    boolean mAddition, mSubtract, mMultiplication, mDivision, mPow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(convertCodeToStyle(getAppTheme()));
        setContentView(R.layout.activity_main);
        /*initChanger();*/

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus = findViewById(R.id.plus);
        btnMinus = findViewById(R.id.minus);
        btnDivision = findViewById(R.id.division);
        btnMultiply = findViewById(R.id.multiply);

        btnEqual = findViewById(R.id.equal);

        btnClear = findViewById(R.id.clear);
        btnPow = findViewById(R.id.pow); // кнопка для темы
        btnDecimal = findViewById(R.id.decimal);

        editxtx1 = (EditText) findViewById(R.id.edit1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + "0");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editxtx1 == null) {
                    editxtx1.setText("");
                } else {
                    mValueOne = Float.parseFloat(editxtx1.getText() + "");
                    mAddition = true;
                    editxtx1.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editxtx1.getText() + "");
                mSubtract = true;
                editxtx1.setText(null);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editxtx1.getText() + "");
                mMultiplication = true;
                editxtx1.setText(null);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editxtx1.getText() + "");
                mDivision = true;
                editxtx1.setText(null);
            }
        });

        /*btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editxtx1.getText() + "");
                mPow = true;
                editxtx1.setText(null);
            }
        });*/
        View.OnClickListener goToSecondActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        };

        btnPow.setOnClickListener(goToSecondActivity);

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editxtx1.getText() + "");

                if (mAddition == true) {
                    editxtx1.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    editxtx1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    editxtx1.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    editxtx1.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }

                if (mPow == true) {
                    editxtx1.setText((int) Math.pow(mValueOne, mValueTwo));
                    mPow = false;
                }
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText("");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editxtx1.setText(editxtx1.getText() + ".");
            }
        });
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

   /* private void initChanger() {
        initButton(findViewById(R.id.radioButtonMaterialLightDarkAction), MaterialLightDarkAction);
        initButton(findViewById(R.id.radioButtonMaterialDark), MaterialDark);

    }*/

   /* private void initButton(RadioButton button, int codeStyle) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });

    }
*/
    /*private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_PREF, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(APP_THEME, codeStyle);
        editor.apply();
    }*/

    private int getAppTheme() {
        int codeStyle = MyCoolStyle;
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_PREF, MODE_PRIVATE);
        return sharedPreferences.getInt(APP_THEME, codeStyle);
    }

}