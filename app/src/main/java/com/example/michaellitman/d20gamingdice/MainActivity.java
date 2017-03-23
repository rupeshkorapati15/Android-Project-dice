package com.example.michaellitman.d20gamingdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static com.example.michaellitman.d20gamingdice.R.id.myLabel;

public class MainActivity extends AppCompatActivity
{

    private View v;
    private TextView tv, tv1, tv2;

    private Button button10;
    private Button button9;
    private EditText e1;
    private int count=0,e2,n;
    private String expression="";
    private String text="";
    Random rand = new Random();


    private String str1,str2,str3,result,str,sign;
    private Double a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tv = (TextView)this.findViewById(R.id.myLabel);
        this.tv1 = (TextView)this.findViewById(R.id.myLabel1);
        this.tv2 = (TextView)this.findViewById(R.id.myLabel3);
        e1=(EditText)findViewById(R.id.editText1);

        this.button10 = (Button)this.findViewById(R.id.button10);
        this.button9 = (Button)this.findViewById(R.id.button9);
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button7:

                this.tv.setText("0");
                break;

            case R.id.button10:
                e2=1;
                this.tv.setText("1");
                break;

            case R.id.button13:

                e2=2;
                this.tv.setText("2");
                break;


            case R.id.button16:
                e2=3;
                this.tv.setText("3");
                break;


            case R.id.button9:
                e2=4;
                this.tv.setText("4");
                break;

            case R.id.button12:
                e2=5;
                this.tv.setText("5");
                break;

            case R.id.button15:
                e2=6;
                this.tv.setText("6");
                break;

            case R.id.button8:
                e2=7;
                this.tv.setText("7");
                break;

            case R.id.button11:
                e2=8;
                this.tv.setText("8");
                break;

            case R.id.button14:
                e2=9;
                this.tv.setText("9");
                break;


            case R.id.imageButton2:
                rand = new Random();
                n = rand.nextInt(4) + 1;
                n=4;
                this.tv1.setText("D4");
                break;

            case R.id.imageButton3:
                rand = new Random();
                n = rand.nextInt(8) + 1;
                n=8;
                this.tv1.setText("D8");
                break;
            case R.id.imageButton5:
                rand = new Random();
                n = rand.nextInt(6) + 1;
                n=6;
                this.tv1.setText("D6");
                break;
            case R.id.imageButton4:
                rand = new Random();
                n = rand.nextInt(10) + 1;
                n=10;
                this.tv1.setText("D10");
                break;
            case R.id.imageButton6:
                rand = new Random();
                n = rand.nextInt(12) + 1;
                n=12;
                this.tv1.setText("D12");
                break;
            case R.id.imageButton7:
                rand = new Random();
                n = rand.nextInt(20) + 1;
                n=20;
                this.tv1.setText("D20");
                break;








        }
    }

    public void onClick1(View v)
    {
        int i;
        int total=0;
        for(i=0; i < (e2 - 1); i++)
        {

            rand = new Random();
            int x = rand.nextInt(n) + 1;
            e1.setText(x);
            e1.setText("+");
            total = total + x;


        }
        this.tv2.setText(total);

    }


}
