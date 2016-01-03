package com.example.dmorin.mybank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dmorin.mybank.accounts.BankAccount;
import com.example.dmorin.mybank.accounts.SavingsAccount;

public class MainActivity extends AppCompatActivity {

    EditText mAmountInput;
    Button mWithdrawButton;
    Button mDepositButton;
    TextView mAmountDisplay;

    BankAccount mCurrentAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mCurrentAccount = new SavingsAccount();

        mAmountInput = (EditText)findViewById(R.id.amount_input);
        mWithdrawButton = (Button)findViewById(R.id.withdraw_button);
        mDepositButton = (Button)findViewById(R.id.deposit_button);
        mAmountDisplay = (TextView)findViewById(R.id.balance_display);

        mWithdrawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = mAmountInput.getText().toString();
                mCurrentAccount.withdraw(Double.parseDouble(amount));
                mAmountDisplay.setText("Balance is " + mCurrentAccount.getmBalance()+ " in your " + mCurrentAccount.getmType() + " Account.");
            }
        });

        mDepositButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = mAmountInput.getText().toString();
                mCurrentAccount.deposit(Double.parseDouble(amount));
                mAmountDisplay.setText("Balance is " + mCurrentAccount.getmBalance()+ " in your " + mCurrentAccount.getmType() + " Account.");
            }
        });

        mAmountDisplay.setText("Hello World!");

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
