package com.example.giaodien;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class LisvtviewActivity extends AppCompatActivity {
    TextView txt;
    ListView listView1;
    String mTitle[] = {"Đỗ Lê Huy", "Đỗ Lê Huy", "Đỗ Lê Huy", "Đỗ Lê Huy", "Đỗ Lê Huy"};
    String mDescription[] = {"25/11/2000","25/11/2000","25/11/2000","B25/11/2000","25/11/2000"};
    int inmage[]= {R.drawable.dolehuy, R.drawable.dolehuy, R.drawable.dolehuy, R.drawable.dolehuy, R.drawable.dolehuy};
    //so our img and oder  things  are set in array

    // now paste some img int drawable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisvtview);

        txt = (TextView) findViewById(R.id.text1);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LisvtviewActivity.this, profile.class);
                startActivity(intent);
            }
        });

        listView1 = findViewById(R.id.lv);
        //now  create an adapter class
        MyAdapter adapter = new MyAdapter( this, mTitle, mDescription, inmage);
        listView1.setAdapter(adapter);



        //nov set item click on this  view
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if( position==0){
                    Toast.makeText(LisvtviewActivity.this, "Đỗ Lê Huy", Toast.LENGTH_SHORT).show();
                }
                if( position==0){
                    Toast.makeText(LisvtviewActivity.this, "Đỗ Lê Huy", Toast.LENGTH_SHORT).show();
                }
                if( position==0){
                    Toast.makeText(LisvtviewActivity.this, "Đỗ Lê Huy", Toast.LENGTH_SHORT).show();
                }
                if( position==0){
                    Toast.makeText(LisvtviewActivity.this, "Đỗ Lê Huy", Toast.LENGTH_SHORT).show();
                }
                if( position==0){
                    Toast.makeText(LisvtviewActivity.this, "Đỗ Lê Huy", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //so item click  is done no check list view
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[],String description[], int imgs[]){
            super(c,R.layout.row, R.id.textview1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textview1);
            TextView myDescription = row.findViewById(R.id.textview2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }

        public MyAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
            super(context, resource, objects);
        }
    }
}