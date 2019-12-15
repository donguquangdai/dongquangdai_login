    package com.example.dongquangdai_login;


    import android.app.AlertDialog;
    import android.content.DialogInterface;
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

    import androidx.annotation.Nullable;
    import androidx.appcompat.app.AppCompatActivity;

    public class Screen extends AppCompatActivity {
        EditText time,date,tagText;

        Button tune,type,tag,week;
        Contact contact;
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState ) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.screen);
            time=findViewById(R.id.time);
            date=findViewById(R.id.date);
            type=findViewById(R.id.type);
            tag=findViewById(R.id.tag);
            week=findViewById(R.id.week);
            tune=findViewById(R.id.button_tune);
            tagText=findViewById(R.id.tagtext);
            Intent intent =getIntent();

            contact=(Contact) intent.getSerializableExtra("contact");

            tag.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        String[] group = {"Bạn bè", "Facebook", "Zalo", "Gia đình"};
                        boolean[] isChecks = {false, true, false, true};

                        android.app.AlertDialog alertDialog = new AlertDialog.Builder(Screen.this)
                                .setTitle("Select Group")
                                .setMultiChoiceItems(group, isChecks, new DialogInterface.OnMultiChoiceClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                                    }
                                })
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        tagText.append("");
                                    }
                                })
                                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })
                                .create();

                        alertDialog.show();
                    }

            });
    }
    }
