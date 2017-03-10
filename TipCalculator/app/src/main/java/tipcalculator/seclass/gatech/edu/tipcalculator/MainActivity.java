package tipcalculator.seclass.gatech.edu.tipcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText checkAmountValue;
    EditText partySizeValue;
    EditText fifteenPercentTipValue;
    EditText twentyPercentTipValueue;
    EditText twentyfivePercentTipValue;
    EditText fifteenPercentTotalValue;
    EditText twentyPercentTotalValue;
    EditText twentyfivePercentTotalValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button button = (Button)  findViewById(R.id.buttonCompare);
        checkAmountValue = (EditText)  findViewById(R.id.checkAmountValue);
        partySizeValue = (EditText)  findViewById(R.id.partySizeValue);
        fifteenPercentTipValue = (EditText)  findViewById(R.id.fifteenPercentTipValue);
        twentyPercentTipValueue = (EditText)  findViewById(R.id.twentyPercentTipValue);
        twentyfivePercentTipValue = (EditText)  findViewById(R.id.twentyfivePercentTipValue);
        fifteenPercentTotalValue = (EditText)  findViewById(R.id.fifteenPercentTotalValue);
        twentyPercentTotalValue = (EditText)  findViewById(R.id.twentyPercentTotalValue);
        twentyfivePercentTotalValue = (EditText)  findViewById(R.id.twentyfivePercentTotalValue);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double totalMoney=-1;
                int peopleNum=0;
                try {
                    totalMoney = Double.parseDouble(checkAmountValue.getText().toString());
                    peopleNum = Integer.parseInt(partySizeValue.getText().toString());
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this,
                            "Empty or incorrect value(s)!", Toast.LENGTH_LONG).show();
                }

                if (totalMoney>=0 && peopleNum>0){
                    int tp15 = (int) Math.round(totalMoney * 0.15 / peopleNum);
                    int tp20 = (int) Math.round(totalMoney * 0.2 / peopleNum);
                    int tp25 = (int) Math.round(totalMoney * 0.25 / peopleNum);
                    int tt15 = (int) Math.round(totalMoney * 1.15 / peopleNum);
                    int tt20 = (int) Math.round(totalMoney * 1.2 / peopleNum);
                    int tt25 = (int) Math.round(totalMoney * 1.25 / peopleNum);

                    fifteenPercentTipValue.setText(Integer.toString(tp15));
                    twentyPercentTipValueue.setText(Integer.toString(tp20));
                    twentyfivePercentTipValue.setText(Integer.toString(tp25));
                    fifteenPercentTotalValue.setText(Integer.toString(tt15));
                    twentyPercentTotalValue.setText(Integer.toString(tt20));
                    twentyfivePercentTotalValue.setText(Integer.toString(tt25));

                }
                else{
                    Toast.makeText(MainActivity.this,
                            "Empty or incorrect value(s)2!", Toast.LENGTH_LONG).show();
                }


            }
        });
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
