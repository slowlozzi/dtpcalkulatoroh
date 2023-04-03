import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView display;
    String currentOperator = "";
    Double currentNumber = 0.0;
    Double result = 0.0;
    boolean operatorPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        // Set the OnClickListener for the number buttons
        Button button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("0");
            }
        });

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("1");
            }
        });

        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("2");
            }
        });

        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("3");
            }
        });

        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("4");
            }
        });

        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("5");
            }
        });

        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("6");
            }
        });

        Button button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("7");
            }
        });

        Button button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("8");
            }
        });

        Button button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("9");
            }
        });

        // Set the OnClickListener for the operator buttons
        Button buttonPlus = findViewById(R.id.button_plus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorClicked("+");
            }
        });

        Button buttonMinus = findViewById(R.id.button_minus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorClicked("-");
            }
        });

        Button buttonMultiply = findViewById(R.id.button_multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorClicked("*");
            }
        });

        Button buttonDivide = findViewById(R.id.button_divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorClicked("/");
            }
        });

        // Set the OnClickListener for the equals button
        Button buttonEquals = findViewById(R.id.button_equals);
        buttonEquals.setOnClickListener(new View.OnClickListener
