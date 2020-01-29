package com.deepmodi.firebasemultirecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.deepmodi.firebasemultirecyclerview.Model.CategoryTwo;
import com.deepmodi.firebasemultirecyclerview.Model.UploadItem;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class UploadActivity extends AppCompatActivity {

    EditText main_category_edit_id,main_category_edit_name;
    EditText sub_category_edit_id,sub_category_edit_name,sub_category_edit_age;

    Button btn_add_to_sublist,btn_final_upload;
    DatabaseReference reference;
    FirebaseDatabase database;

    CategoryTwo categoryTwo;
    UploadItem uploadItem;
    ArrayList<CategoryTwo> categoryTwos =new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        main_category_edit_id = findViewById(R.id.edit_upload_category_id);
        main_category_edit_name = findViewById(R.id.edit_upload_category_name);

        sub_category_edit_id = findViewById(R.id.edit_upload_sub_category_id);
        sub_category_edit_name = findViewById(R.id.edit_upload_sub_category_name);
        sub_category_edit_age = findViewById(R.id.edit_upload_sub_category_age);

        btn_final_upload = findViewById(R.id.btn_final_upload);
        btn_add_to_sublist = findViewById(R.id.btn_add_to_subList);


        //Firebase init
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("Category");

        btn_add_to_sublist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sub_category_edit_id.getText().toString().isEmpty()
                    && !sub_category_edit_age.getText().toString().isEmpty()
                        && !sub_category_edit_name.getText().toString().isEmpty()) {
                    addToSubList(sub_category_edit_id.getText().toString(), sub_category_edit_name.getText().toString(), sub_category_edit_age.getText().toString());
                }
            }
        });

        btn_final_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadItem = new UploadItem(main_category_edit_name.getText().toString()
                        ,main_category_edit_id.getText().toString()
                        ,categoryTwos);

                reference.child(main_category_edit_id.getText().toString()).setValue(uploadItem);
            }
        });
    }

    private void addToSubList(String id,String name,String age)
    {
        categoryTwo = new CategoryTwo(name,id,age);
        categoryTwos.add(categoryTwo);
        sub_category_edit_id.setText("");
        sub_category_edit_age.setText("");
        sub_category_edit_name.setText("");
    }
}
