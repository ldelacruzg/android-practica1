package app.smty.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveData extends AppCompatActivity {
    TextView textViewName, textViewDateOfBirth, textViewPhone, textViewGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_data);

        initUI();
        String name, dateOfBirth, phone, gender;

        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("name");
        dateOfBirth = bundle.getString("dateOfBirth");
        phone = bundle.getString("phone");
        gender = bundle.getString("gender");

        textViewName.setText(name);
        textViewDateOfBirth.setText(dateOfBirth);
        textViewPhone.setText(phone);
        textViewGender.setText(gender);
    }

    private void initUI() {
        textViewName = findViewById(R.id.textViewName);
        textViewDateOfBirth = findViewById(R.id.textViewDateOfBirth);
        textViewPhone = findViewById(R.id.textViewPhone);
        textViewGender = findViewById(R.id.textViewGender);
    }
}