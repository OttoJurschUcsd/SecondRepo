package com.example.ojursch.secondrepo.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ojursch.secondrepo.MainActivity;
import com.example.ojursch.secondrepo.R;

/**
 * Created by ojursch on 4/20/2016.
 */
public class Test_Case extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public Test_Case(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        EditText one = (EditText) mainActivity.findViewById(R.id.editText1);
        EditText two = (EditText) mainActivity.findViewById(R.id.editText2);
        one.setText(("" + 5).toCharArray(), 0, 1);
        two.setText((""+7).toCharArray(), 0, 1);
        mainActivity.onClick(mainActivity.findViewById(R.id.button));
        TextView out = (TextView) mainActivity.findViewById(R.id.textView);
        assertEquals(Integer.parseInt(new String(out.getText().toString())), 13);
    }
}
