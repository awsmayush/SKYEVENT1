package com.example.skyevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button b1=(Button) findViewById(R.id.TaskList);
        Button b2=(Button) findViewById(R.id.guestList);
        Button b3=(Button) findViewById(R.id.budget);
        Button b4=(Button) findViewById(R.id.add_event);

    }

    public void addEvent(View view) {
        Intent intent=new Intent(home.this,addevent.class);

    }

    public void budgetIntent(View view) {
        Intent intent=new Intent(home.this,budget.class);
    }

    public void guestIntent(View view) {
        Intent intent = new Intent(home.this,guest.class);
    }

    public void task(View view) {
        Intent intent=new Intent(home.this,task.class);
    }
}
