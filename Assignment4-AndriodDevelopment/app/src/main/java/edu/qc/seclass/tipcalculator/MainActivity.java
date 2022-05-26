package edu.qc.seclass.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    double checkAmount;
    int partySize;

    EditText checkAmountValue;
    EditText partySizeValue;

    Button buttonCompute;

    EditText fifteenPercentTipValue;
    EditText twentyPercentTipValue;
    EditText twentyfivePercentTipValue;

    EditText fifteenPercentTotalValue;
    EditText twentyPercentTotalValue;
    EditText twentyfivePercentTotalValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkAmountValue = findViewById(R.id.checkAmountValue);
        partySizeValue = findViewById(R.id.partySizeValue);

        buttonCompute = findViewById(R.id.buttonCompute);
        buttonCompute.setOnClickListener(v -> {

            //calls method to close keyboard upon button press
            closeKeyboard();

            //throws a toast message if the check amount is empty
            if(checkAmountValue.getText().toString().length() == 0){
                Toast.makeText(getApplicationContext(), "Please enter a check amount", Toast.LENGTH_LONG).show();
            }

            //throws a toast message if the party size is empty
            else if (partySizeValue.getText().toString().length() == 0){
                Toast.makeText(getApplicationContext(), "Please enter a party size", Toast.LENGTH_LONG).show();
            }

            //throws a toast message if the party size is 0
            else if(Integer.parseInt(partySizeValue.getText().toString()) == 0) {
                Toast.makeText(getApplicationContext(), "Cannot divide by 0 party size", Toast.LENGTH_LONG).show();
            }

            //otherwise starts computing tips and total
            else{
                //Initializes all editText Id's to corresponding objects
                fifteenPercentTipValue = findViewById(R.id.fifteenPercentTipValue);
                twentyPercentTipValue = findViewById(R.id.twentyPercentTipValue);
                twentyfivePercentTipValue = findViewById(R.id.twentyfivePercentTipValue);

                fifteenPercentTotalValue = findViewById(R.id.fifteenPercentTotalValue);
                twentyPercentTotalValue = findViewById(R.id.twentyPercentTotalValue);
                twentyfivePercentTotalValue = findViewById(R.id.twentyfivePercentTotalValue);

                checkAmount = Double.parseDouble(checkAmountValue.getText().toString());
                partySize = Integer.parseInt((partySizeValue.getText().toString()));

                //calls computeTip method 3 times, each for the different tip bracket
                fifteenPercentTipValue.setText(String.valueOf(computeTip(checkAmount, partySize, 0.15)));
                twentyPercentTipValue.setText(String.valueOf(computeTip(checkAmount, partySize, 0.20)));
                twentyfivePercentTipValue.setText(String.valueOf(computeTip(checkAmount, partySize, 0.25)));

                //calls computeTotal method 3 times, each for the different tip bracket
                fifteenPercentTotalValue.setText(String.valueOf(computeTotal(checkAmount, partySize, 0.15)));
                twentyPercentTotalValue.setText(String.valueOf(computeTotal(checkAmount, partySize, 0.20)));
                twentyfivePercentTotalValue.setText(String.valueOf(computeTotal(checkAmount, partySize, 0.25)));

            }
        });
    }
    public int computeTip(double checkAmount, int partySize, double percent){
        return (int) Math.ceil((checkAmount / partySize) * percent);
    }

    //method that calculates the total including tip
    public int computeTotal(double checkAmount, int partySize, double percent){
        double tip = ((checkAmount / partySize) * percent);
        return (int) Math.ceil((checkAmount / partySize) + tip);
    }

    //method to close the keyboard upon call
    public void closeKeyboard(){
        View view = this.getCurrentFocus();
        if(view != null){
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}