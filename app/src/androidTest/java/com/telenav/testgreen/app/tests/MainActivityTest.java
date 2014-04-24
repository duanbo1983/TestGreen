package com.telenav.testgreen.app.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.telenav.testgreen.app.MainActivity;
import com.telenav.testgreen.app.R;


/**
 * Created by Bo on 4/23/2014.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;

    public MainActivityTest()
    {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = this.getActivity();
    }

    public void testTextViewNotNull() {
        TextView textView = (TextView)activity.findViewById(R.id.button1);
        assertNotNull(textView);
    }

}