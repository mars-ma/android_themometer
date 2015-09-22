package dev.mars.themometer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import dev.mars.widget.Themometer;

public class MainActivity extends Activity {
	Themometer themometer;
	EditText et_num;
	Button btn_set;
	
    /** Called when the activity is first created. */  
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        themometer = (Themometer) findViewById(R.id.themometer);
        et_num = (EditText) findViewById(R.id.et_num);
        btn_set=(Button) findViewById(R.id.btn_set);
        btn_set.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				double value = Double.parseDouble(et_num.getText().toString());
				themometer.setTemperature((float)value);
			}
		});
    }  
}
