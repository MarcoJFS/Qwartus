package pt.ipleira.estg.qwartus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View.OnClickListener;

public class ac_Qwartus extends AppCompatActivity {

    Spinner spinnerDistrito = (Spinner) findViewById(R.id.spinnerDistrito);
    Spinner spinnerConcelho = (Spinner) findViewById(R.id.spinnerConcelho);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac__qwartus);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.arrayDistritos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerDistrito.setAdapter(adapter);

    }

    public void onItemSelected(AdapterView<ArrayAdapter> parent, View view, int position, long id) {

        int pos = spinnerDistrito.getSelectedItemPosition();

        switch (pos){
            case 0: // Create an ArrayAdapter using the string array and a default spinner layout
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                        R.array.arrayConcelhosAveiro, android.R.layout.simple_spinner_item);
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                // Apply the adapter to the spinner
                spinnerConcelho.setAdapter(adapter);
                break;
            case 1: // Create an ArrayAdapter using the string array and a default spinner layout
                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                        R.array.arrayConcelhosBeja, android.R.layout.simple_spinner_item);
                // Specify the layout to use when the list of choices appears
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                // Apply the adapter to the spinner
                spinnerConcelho.setAdapter(adapter1);
                break;
        }

    }
}
