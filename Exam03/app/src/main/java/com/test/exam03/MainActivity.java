package com.test.exam03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView iv_test;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_test = findViewById(R.id.iv_test);
        list = findViewById(R.id.list);

        //ListView로 데이터를 가져와서 보이게 하는 방법 ---------------------------------------------------------------------
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(arrayAdapter);

        data.add("김철수");
        data.add("김민수");
        data.add("김현아");
        data.add("박민수");
        arrayAdapter.notifyDataSetChanged();
        //ListView ----------------------------------------------------------------------------------------------------

        iv_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //토스트 메세지 보이게 하는 방법
                Toast.makeText(getApplicationContext(), "안녕하세요? 반가워요.", Toast.LENGTH_LONG).show();
                                                                                        //시간 LENGTH_SHORT
            }
        });
    }
}