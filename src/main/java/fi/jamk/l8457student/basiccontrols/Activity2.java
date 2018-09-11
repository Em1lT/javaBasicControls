package fi.jamk.l8457student.basiccontrols;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    /*
    *
    * The second Activity java file!! Watch the video first!!
    *
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        // Auto filler
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView);
        textView.setAdapter(adapter);
    }

    private static final String[] COUNTRIES = new String[] {
            "Pasi","Juha","Kari","Jouni","Esa","Hannu"
    };

    private AutoCompleteTextView username;
    private EditText password;

    @SuppressLint("WrongViewCast")
    public void selectButtonClicked(View v) {

        //And Toast the login text and the password text
        username = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        password = (EditText) findViewById(R.id.editText);
        Toast toast = new Toast(getApplicationContext());
        toast.makeText(Activity2.this,"" +  username.getText() + " " + password.getText() , toast.LENGTH_SHORT).show();

    }

   /*public void onCreate(){

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
*/

    }



