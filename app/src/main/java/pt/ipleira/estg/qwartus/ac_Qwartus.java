package pt.ipleira.estg.qwartus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View.OnClickListener;

public class ac_Qwartus extends AppCompatActivity {

    //Spinner spinnerDistrito;
    //Spinner spinnerConcelho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac__qwartus);

        //Spinner spinnerDistrito = (Spinner) findViewById(R.id.spinnerDistrito);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.arrayDistritos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerDistrito.setAdapter(adapter);


        spinnerDistrito.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Spinner spinnerConcelho = (Spinner) findViewById(R.id.spinnerConcelho);

                switch (position){
                    case 1: // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter0 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosAveiro, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter0);

                    case 2: // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosBeja, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter1);

                }

            }
        });

    }


}
