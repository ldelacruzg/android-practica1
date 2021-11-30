package app.smty.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText editTextName, editTextDateOfBirth, editTextPhone;
    RadioGroup radioGroupGender;
    RadioButton radioButton;
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        editTextName = findViewById(R.id.editTextName);
        editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);
        editTextPhone = findViewById(R.id.editTextPhone);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        buttonSend = findViewById(R.id.buttonSend);
    }

    public void sendData(View view) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, ReceiveData.class);
        String name, dateOfBirth, phone, gender;

        name = editTextName.getText().toString();
        dateOfBirth = editTextDateOfBirth.getText().toString();
        phone = editTextPhone.getText().toString();

        int idButton = radioGroupGender.getCheckedRadioButtonId();
        radioButton = findViewById(idButton);
        gender = radioButton.getText().toString();

        bundle.putString("name", name);
        bundle.putString("dateOfBirth", dateOfBirth);
        bundle.putString("phone", phone);
        bundle.putString("gender", gender);
        intent.putExtras(bundle);

        startActivity(intent);
    }

}