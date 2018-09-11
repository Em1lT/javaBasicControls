package fi.jamk.l8457student.basiccontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this changes the activity to the second screen

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                openActivity2();
            }
        });
    }

    // RadioButton commands
    public void selectButtonClicked(View view) {
        RadioGroup rg = (RadioGroup) findViewById(R.id.myRadioGroup);
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        String text = (String) rb.getText();
        Toast.makeText(getApplicationContext(), text,
                Toast.LENGTH_SHORT).show();
    }
    //method to open activity 2
    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

}
