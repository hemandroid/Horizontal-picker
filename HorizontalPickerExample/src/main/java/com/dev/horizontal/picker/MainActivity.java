/*
 * Copyright 2014 Blaž Šolar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dev.horizontal.picker;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.dev.horizontal.HorizontalPicker;

public class MainActivity extends Activity implements HorizontalPicker.OnItemSelected, HorizontalPicker.OnItemClicked {
    HorizontalPicker picker;
//    Drawable bg_circle = getResources().getDrawable(com.wefika.horizontalpicker.R.drawable.circle);

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picker = (HorizontalPicker) findViewById(R.id.picker);
        picker.setOnItemClickedListener(this);
        picker.setOnItemSelectedListener(this);
        picker.setBackground(new ColorCircleDrawable(Color.WHITE));
        Log.d("picker","result");
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(int index) {

        Toast.makeText(this, (index+1)+" Item selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this, "Item clicked", Toast.LENGTH_SHORT).show();
    }
}
