package com.example.mohamed.egyptguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ContactFragment extends Fragment {

    public EditText userName,userEmail,message;
    public Button reset,send;
    public ContactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View view =  inflater.inflate(R.layout.fragment_contact, container, false);
        userName  =(EditText)view.findViewById(R.id.editText);
        userEmail =(EditText)view.findViewById(R.id.editText2);
        message   =(EditText)view.findViewById(R.id.editText3);

        reset=(Button)view.findViewById(R.id.reset);
        send =(Button) view.findViewById(R.id.send);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName.setText("");
                userEmail.setText("");
                message.setText("");
            }
        });
        return view;
    }

}
