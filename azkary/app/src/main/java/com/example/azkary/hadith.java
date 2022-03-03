package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hadith extends AppCompatActivity {

    String[] items={"فضل العلم و العمل","الصدقة","الصبر","العفو و التسامح","الحج","بر الوالدين","الصدق","التوبة","فضل ذكر الله","النظافة"};
    ListView lv_items;
    ArrayAdapter adapter;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadith);
        lv_items=findViewById(R.id.lv_items);
        adapter=new ArrayAdapter(this,R.layout.list_items,items);
        lv_items.setAdapter(adapter);
        lv_items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> ListView, View row, int position, long id) {
                if(position==0) {
                    intent = new Intent(hadith.this, fadl_el_elm.class);
                }
                if(position==1) {
                    intent = new Intent(hadith.this, sadka.class);
                }
                if(position==2) {
                    intent = new Intent(hadith.this, sapr.class);
                }
                if(position==3) {
                    intent = new Intent(hadith.this, tsamoh.class);
                }
                if(position==4) {
                    intent = new Intent(hadith.this, hegg.class);
                }
                if(position==5) {
                    intent = new Intent(hadith.this, br_el_waldain.class);
                }
                if(position==6) {
                    intent = new Intent(hadith.this, sdek.class);
                }
                if(position==7) {
                    intent = new Intent(hadith.this, twba.class);
                }
                if(position==8) {
                    intent = new Intent(hadith.this, fadl_zekr_Allah.class);
                }
                if(position==9) {
                    intent = new Intent(hadith.this, nazafa.class);
                }
                startActivity(intent);
            }
        });
    }
}