package com.metallicmay.deltatask0;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
	TextView textview;
	Button button;
	Random r=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            
        textview=(TextView) findViewById(R.id.textView1);
        button=(Button) findViewById(R.id.button);
        
        textview.setText(R.string.hello_world);
        
        button.setOnClickListener(new View.OnClickListener() {
        	
        	public void onClick(View v) {
        		String string= (String) textview.getText();
        		String jumbled= Jumble(string);
        		textview.setText(jumbled);
        		
        	}
        });
    }
        
        public String Jumble(String str) {
        	
        	char[] array= str.toCharArray();
        	char[] temparray= str.toCharArray();
        	Random random=new Random();
        	int k=array.length-1;
        	int r=random.nextInt(k);
        	int i=0;
        	while(i<=r) {
        		temparray[k-i]=array[i];
        		i++;
        	}
        	int j=r+1;
        	while(j<=k) {
        		temparray[j-r-1]=array[j];
        		j++;
        	}
        	
        	String newstr= String.valueOf(temparray);
        	
        	return newstr;
        	
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

 }
