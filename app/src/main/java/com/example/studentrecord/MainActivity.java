package com.example.studentrecord;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button submit;
    private RadioButton branch;
    private String details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.branch);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                RadioButton branch= (RadioButton)group.findViewById(checkedId);
            }
        });

        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                details="Name : ";
                details+=((EditText)findViewById(R.id.name)).getText();
                details+="\nDate Of Brith : ";
                details+=((EditText)findViewById(R.id.dob)).getText();
                details+="\nCollege : ";
                details+=((EditText)findViewById(R.id.college)).getText();
                details+="\nRoll No : ";
                details+=((EditText)findViewById(R.id.rollnumber)).getText();
//                details+="\nBranch : ";
//                details+=branch.getText();
                details+="\nGraduation year : ";
                details+=((EditText)findViewById(R.id.grdyear)).getText();
                details+="\nPhone Number : ";
                details+=((EditText)findViewById(R.id.phone)).getText();
                details+="\nEmail : ";
                details+=((EditText)findViewById(R.id.email)).getText();
                details+="\nAddress : ";
                details+=((EditText)findViewById(R.id.address)).getText();
                details+="\n";


                CharSequence text = details;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
            }
        });

    }
}