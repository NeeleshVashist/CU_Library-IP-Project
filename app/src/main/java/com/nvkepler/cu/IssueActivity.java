package com.nvkepler.cu;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

//Created by neelv on 22/3/18.

public class IssueActivity extends FragmentsActivity {
    FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
    int clickcount=0;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.issue_activity);
    }

    public void submit(View v) {
        EditText mcode = (EditText) findViewById(R.id.code);
        final String scode = mcode.getText().toString();
        if (TextUtils.isEmpty(scode)) {
            mcode.setError("Please Enter the BarCode Number");
            return;
        }
        //clickcount++;
            final DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child(user.getUid());
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        clickcount=1;
                        if(dataSnapshot.child("Book1").exists())
                        {
                            counter=0;
                        }
                        else{
                            counter=1;
                        }
                        if(counter==0)
                        {
                            if(dataSnapshot.child("Book2").exists()){

                            }else
                                counter=2;
                        }
                        if(counter==0)
                        {
                            if(dataSnapshot.child("Book3").exists()){

                            }else
                                counter=3;
                        }
                        if(counter==0)
                        {
                            if(dataSnapshot.child("Book4").exists()){

                            }else
                                counter=4;
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                if (counter==0 && clickcount==1) {
            Toast.makeText(IssueActivity.this, "Maximum Number of Books already issued", Toast.LENGTH_SHORT).show();
        } else if(clickcount==1){
                    if(counter==1){
                        ref.child("Book1").setValue(scode);
                    }
                    else if(counter==2){
                        ref.child("Book2").setValue(scode);
                    }
                    else if(counter==3)
                    {
                        ref.child("Book3").setValue(scode);
                    }
                    else if(counter==4){
                        ref.child("Book4").setValue(scode);
                    }
                    Toast.makeText(IssueActivity.this, "Book Registered", Toast.LENGTH_SHORT).show();
           mcode.setText("");
        }
    }

}