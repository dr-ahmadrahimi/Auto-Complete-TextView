package phd.rahimi.ahmad.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView Actv;
    TextView Tv;
    String[] NameList = {"Ahmad", "Rahimi", "Montazeri", "University", "IRAN", "Akbar", "Hassan", "Rajabi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        Tv = (TextView) findViewById(R.id.TextView1);

        StringBuilder editText = new StringBuilder();
        editText.append("Enter First Char of this Word : ").append("\n");

        for (String value:NameList) {
            editText.append(value).append("\n");
        }


        Tv.setText(editText);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, NameList);
        Actv.setThreshold(1);  // Tanzim Charactere Shorue jostejoo
        Actv.setAdapter(adapter);
    }
}
