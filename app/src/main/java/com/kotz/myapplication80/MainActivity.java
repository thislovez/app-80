package com.kotz.myapplication80;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn1;
    TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        text1 = findViewById(R.id.text1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("\nStep 1 ILLUSTRATION: LIBBY VANDERPLOEG: \nPlace a large pot of lightly salted water (no more than 1 tablespoon salt) over high heat, and bring to a boil. Add pasta and cook according to package directions until just al dente. Drain, reserving 2 cups pasta water. " +
                                "\n\nStep 2 ILLUSTRATION: LIBBY VANDERPLOEG:  \nMeanwhile, in a medium bowl, whisk together eggs, yolks and cheeses until well combined. Season with a pinch of salt and lots of black pepper. " +
                        "\n\nStep 3 ILLUSTRATION: LIBBY VANDERPLOEG: \nHeat oil in a large skillet over medium heat. Add guanciale and sauté until just beginning to crisp, 5 minutes. " +
                        "\n\nStep 4 ILLUSTRATION: LIBBY VANDERPLOEG: \nReduce heat, add drained pasta, and toss to combine and finish cooking. Off heat, toss in egg-cheese mixture and add just enough reserved pasta water to form a creamy sauce. Serve topped with more grated pecorino and pepper."
                                 );
            }
        });

    }



    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox_chille:
                if (checked)
                    System.out.println("Don't put the chille");
                else
                    System.out.println("Can put the chille");
                break;
            case R.id.checkbox_vegetable:
                if (checked)
                    System.out.println("Don't put the vegetable");
                else
                    System.out.println("Can put the vegetable");
                break;
            case R.id.checkbox_egg:
                if (checked)
                    System.out.println("Don't put the egg");
                else
                    System.out.println("Can put the egg");
                break;
            case R.id.checkbox_oil:
                if (checked)
                    System.out.println("Don't put the oil");
                else
                    System.out.println("Can put the oil");
                break;


        }

    }






            public void onRadioButtonClicked(View view) {
                boolean checked = ((RadioButton) view).isChecked();
                switch(view.getId()) {
                    case R.id.radio_here:
                        if (checked)
                            System.out.println("Eat here !");
                        break;
                    case R.id.radio_home:
                        if (checked)
                            System.out.println("Go home ...");
                        break;
                }


            }
}
