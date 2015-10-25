package com.example.zadaca.smorzadaca;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.UUID;

/**
 * Created by Sehic on 25.10.2015.
 */
public class EditActivity extends Activity{
    private UUID value;
    private EditText mPersonFirstName;
    private EditText mPersonLastName;
    private Button mSavePersonDetails;
    private PersonModel person;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        mPersonFirstName = (EditText) findViewById(R.id.editTextFirstName);
        mPersonLastName = (EditText) findViewById(R.id.editTextLastName);
        mSavePersonDetails = (Button) findViewById(R.id.save_button);

        person = (PersonModel) getIntent().getExtras().getSerializable("Person");
        PersonList list = PersonList.get();
        position = list.findPosition(person);

        mPersonFirstName.setText(person.getName());
        mPersonLastName.setText(person.getSurname());

        mSavePersonDetails.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                PersonList.get().getPersons().get(position).setName(mPersonFirstName.getText().toString());
                PersonList.get().getPersons().get(position).setSurname(mPersonLastName.getText().toString());
                Toast.makeText(EditActivity.this, "Change saved", Toast.LENGTH_LONG).show();
            }
        });




    }
}
