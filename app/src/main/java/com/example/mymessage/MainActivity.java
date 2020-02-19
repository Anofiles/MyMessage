package com.example.mymessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit_text_activity_main);
    }
    public void onSendMessage(View view){
        Intent i=new Intent(this,Main2Activity.class);

        String message = editText.getText().toString();
        i.putExtra(Main2Activity.EXTRA_MASSAGE,message);
        startActivity(i);


    }
    public void onSendMessageInActivity(View view){
        Intent intent=new Intent(Intent.ACTION_SEND);

        String message = editText.getText().toString();
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        startActivity(intent);
    }
    public void onSendMessageInActivityChooser(View view){
        Intent intent=new Intent(Intent.ACTION_SEND);

        String message = editText.getText().toString();
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        String chooserTitle=getString(R.string.button);
        String comid="Я обновил репозиторий на гет хабе-commit снова , и это здорово";
        Intent chooserI =  Intent.createChooser(intent,"Выбрать активностBи");
        startActivity(chooserI);
        //startActivity(Intent.createChooser(intent,"Выбрать активность"));
    }
}
