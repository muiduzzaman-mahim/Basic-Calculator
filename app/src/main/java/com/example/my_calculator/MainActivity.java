package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, signbox;
    String sign;
    String value1;
    String value2;
    double num1;
    double num2;
    double result;
    boolean hasdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signbox = (TextView) findViewById((R.id.sign));

        hasdot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        input.setText(input.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        input.setText(input.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        input.setText(input.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        input.setText(input.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        input.setText(input.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        input.setText(input.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        input.setText(input.getText() + "7");
    }

    public void btnClick_8(View view) {
        input.setText(input.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        input.setText(input.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        input.setText(input.getText() + "0");
    }

    public void btnClick_dot(View view) {
        if (!hasdot) {
            if (input.getText().equals("")) {
                input.setText("0.");
            } else {
                input.setText(input.getText() + ".");
            }
            hasdot = true;
        }
    }

    public void btnClick_plus(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("+");
        hasdot = false;
    }

    public void btnClick_minus(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("-");
        hasdot = false;
    }

    public void btnClick_X(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("*");
        hasdot = false;
    }

    public void btnClick_divid(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("/");
        hasdot = false;
    }


    public void btnClick_ans(View view) {
        if (input.getText().equals("")) {
            signbox.setText("Error");
        } else if (sign != null) {
            value2 = input.getText().toString();
            num1 = Double.parseDouble(value1);
            num2 = Double.parseDouble(value2);
            input.setText(null);

            switch (sign) {
                default:
                    break;
                case "+":
                    result = num1 + num2;
                    input.setText(num1 + "+" + num2);
                    sign = null;
                    signbox.setText(result + "");
                    break;
                case "-":
                    result = num1 - num2;
                    input.setText(num1 + "-" + num2);
                    sign = null;
                    signbox.setText(result + "");
                    break;
                case "*":
                    result = num1 * num2;
                    input.setText(num1 + "*" + num2);
                    sign = null;
                    signbox.setText(result + "");
                    break;
                case "/":
                    result = num1 / num2;
                    input.setText(num1 + "/" + num2);
                    sign = null;
                    signbox.setText(result + "");
                    break;
            }
        } else {
            input.setText("Error!!");
        }
    }

    public void btnClick_AC(View view) {
        input.setText(null);
        signbox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
    }

}