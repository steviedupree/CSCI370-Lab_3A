package com.stingersof.adapterviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.stingersof.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Array of students...
    Student studentOne = new Student("Williams", "George", "Computer Science");
    Student studentTwo = new Student("Clark", "Bill", "Biology");
    Student studentThree = new Student("Smith", "Carl", "Math");

    ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);


        StudentAdapter adapter = new StudentAdapter(getApplicationContext(), students);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
