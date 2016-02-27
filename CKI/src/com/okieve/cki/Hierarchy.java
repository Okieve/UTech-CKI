package com.okieve.cki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Hierarchy extends Fragment {  
			    @Override  
			    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
			              Bundle savedInstanceState) {  
			    Button btn=(Button)findViewById(R.id.pres);	
			         // TODO Auto-generated method stub  
			    btn.setOnClickListener(new OnClickListener (){

					@Override
					public void onClick(View v) {
						  Intent intent = new Intent(this, President.class);
                          startActivity(intent); 
					}
			    });
			    
			         return inflater.inflate(R.layout.activity_hierarchy, container,false);  
			    } 
			}