package com.nvkepler.cu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ReturnPortal extends FragmentsActivity {
    FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
    int clickcount=0;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_portal);
    }
    public void submit(View v) {
        EditText mcode = (EditText) findViewById(R.id.code);
        final String scode = mcode.getText().toString();
        if (TextUtils.isEmpty(scode)) {
            mcode.setError("Please Enter the BarCode Number");
        }
        final DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child(user.getUid());
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                clickcount=1;
                if(dataSnapshot.child("Book1").exists())
                {
                    String book1= (String) dataSnapshot.child("Book1").getValue();
                    if(book1.equals(scode))
                    {
                        counter=1;
                    }
                    else
                        counter=0;
                }
                else{
                    counter=0;
                }
                if(counter==0)
                {
                    if(dataSnapshot.child("Book2").exists()){
                        String book2=(String)dataSnapshot.child("Book2").getValue();
                        if(book2.equals(scode)){
                            counter=2;
                        }
                        else{
                            counter=0;
                        }
                    }else
                        counter=0;
                }
                if(counter==0)
                {
                    if(dataSnapshot.child("Book3").exists()){
                        String  book3=(String)dataSnapshot.child("Book3").getValue();
                        if(book3.equals(scode)){
                            counter=3;
                        }else{
                            counter=0;
                        }
                    }else
                        counter=0;
                }
                if(counter==0)
                {
                    if(dataSnapshot.child("Book4").exists()){
                        String book4=(String)dataSnapshot.child("Book4").getValue();
                        if(book4.equals(scode)){
                            counter=4;
                        }else{
                            counter=0;
                        }
                    }else
                        counter=0;
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        if (counter==0 && clickcount==1) {
            Toast.makeText(ReturnPortal.this, "Book Not Found!", Toast.LENGTH_SHORT).show();
        } else if(clickcount==1){
            if(counter==1){
                ref.child("Book1").removeValue();
            }
            else if(counter==2){
                ref.child("Book2").removeValue();
            }
            else if(counter==3)
            {
                ref.child("Book3").removeValue();
            }
            else if(counter==4){
                ref.child("Book4").removeValue();
            }
            Toast.makeText(ReturnPortal.this, "Book Returned!", Toast.LENGTH_SHORT).show();
            mcode.setText("");
        }
    }
}
