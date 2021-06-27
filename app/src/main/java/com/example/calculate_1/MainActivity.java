package com.example.calculate_1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnDivision, btnMultiply, btnDecimal, btnClear, btnEqual, btnPow;
    EditText editxtx1;
    float mValueOne, mValueTwo, mValuePow;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, crunchifyPow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        btnPow = findViewById(R.id.pow);
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
                    crunchifyAddition = true;
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
                crunchifyMultiplication = true;
                editxtx1.setText(null);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editxtx1.getText() + "");
                crunchifyDivision = true;
                editxtx1.setText(null);
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editxtx1.getText() + "");
                crunchifyPow = true;
                editxtx1.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editxtx1.getText() + "");

                if (crunchifyAddition == true) {
                    editxtx1.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    editxtx1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    editxtx1.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    editxtx1.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }

                if (crunchifyPow == true) {
                    editxtx1.setText((int) Math.pow(mValueOne, mValueTwo));
                    crunchifyPow = false;
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

}