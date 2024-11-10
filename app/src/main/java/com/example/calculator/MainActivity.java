package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText etInputWindow = findViewById(R.id.etInputWindow);
        TextView tvOutputWindow = findViewById(R.id.tvOutputWindow);

        Button btn0 = findViewById(R.id.btn0);
        Button btn00 = findViewById(R.id.btn00);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnMod = findViewById(R.id.btnMod);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnAC = findViewById(R.id.btnAC);
        Button btnC = findViewById(R.id.btnC);
        Button btnEqual = findViewById(R.id.btnEqual);

        btn0.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"0");
            } else {
                etInputWindow.setText(str+"0");
                etInputWindow.setTextSize(35);
            }

        });
        btn00.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"00");
            } else {
                etInputWindow.setText(str+"00");
                etInputWindow.setTextSize(35);
            }
        });
        btn1.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"1");
            } else {
                etInputWindow.setText(str+"1");
                etInputWindow.setTextSize(35);
            }
        });
        btn2.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"2");
            } else {
                etInputWindow.setText(str+"2");
                etInputWindow.setTextSize(35);
            }
        });
        btn3.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"3");
            } else {
                etInputWindow.setText(str+"3");
                etInputWindow.setTextSize(35);
            }
        });
        btn4.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"4");
            } else {
                etInputWindow.setText(str+"4");
                etInputWindow.setTextSize(35);
            }
        });
        btn5.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"5");
            } else {
                etInputWindow.setText(str+"5");
                etInputWindow.setTextSize(35);
            }
        });
        btn6.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"6");
            } else {
                etInputWindow.setText(str+"6");
                etInputWindow.setTextSize(35);
            }
        });
        btn7.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"7");
            } else {
                etInputWindow.setText(str+"7");
                etInputWindow.setTextSize(35);
            }
        });
        btn8.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"8");
            } else {
                etInputWindow.setText(str+"8");
                etInputWindow.setTextSize(35);
            }
        });
        btn9.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"9");
            } else {
                etInputWindow.setText(str+"9");
                etInputWindow.setTextSize(35);
            }
        });
        btnMod.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"%");
            } else {
                etInputWindow.setText(str+"%");
                etInputWindow.setTextSize(35);
            }
        });
        btnDiv.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"÷");
            } else {
                etInputWindow.setText(str+"÷");
                etInputWindow.setTextSize(35);
            }
        });
        btnMul.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"×");
            } else {
                etInputWindow.setText(str+"×");
                etInputWindow.setTextSize(35);
            }
        });
        btnSub.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"-");
            } else {
                etInputWindow.setText(str+"-");
                etInputWindow.setTextSize(35);
            }
        });
        btnAdd.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (str.length() < 12) {
                etInputWindow.setText(str+"+");
            } else {
                etInputWindow.setText(str+"+");
                etInputWindow.setTextSize(35);
            }

        });
        btnAC.setOnClickListener(v -> {
            etInputWindow.setText("");
            tvOutputWindow.setText("");
            etInputWindow.setTextSize(55);
        });
        btnC.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            if (!str.isEmpty()) {
                etInputWindow.setText(str.substring(0, str.length() - 1));
            }
        });

        btnEqual.setOnClickListener(v -> {
            String str = String.valueOf(etInputWindow.getText());
            boolean isValid = true;
            for (int i = 0; i < str.length() - 1; i++) {
                if (!Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i + 1))) {
                    isValid = false;
                }
            }
            if (isValid) {
                String res = solveExpression(str);
                tvOutputWindow.setText(res);
            } else {
                tvOutputWindow.setText("Invalid expression");
            }

        });

    }

    private String solveExpression(String str) {
        str = str.replace('×', '*');
        str = str.replace('÷', '/');
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators =  new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                StringBuilder s = new StringBuilder();
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    s.append(str.charAt(i++));
                }
                i--;
                operands.push(Integer.parseInt(String.valueOf(s)));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    applyOperation(operands, operators);
                }
                operators.push(ch);

            }
        }

        while (!operators.isEmpty()) {
            applyOperation(operands, operators);
        }
        return String.valueOf(operands.pop());
    }

    @SuppressLint("SetTextI18n")
    private void applyOperation(Stack<Integer> operands, Stack<Character> operators) {
        int num2 = operands.pop();
        int num1 = operands.pop();
        char op = operators.pop();
        int res = 0;

        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    res = num1 / num2;
                }
                break;
            case '%':
                res = num1 % num2;
                break;
        }
        operands.push(res);
    }

    private int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
        }
        return -1;
    }
}