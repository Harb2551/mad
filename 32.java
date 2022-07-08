package com.example.labpgm3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; import android.os.Bundle; import android.view.View; import android.widget.Button; import android.widget.EditText; import android.widget.Toast;
public class Signin extends AppCompatActivity { EditText username,password;
Button signin;
int attempts=0;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(saved I nsta nc eStat e);
setC ontentView( R. la yo ut.ac t ivit y_s i gnin); username= find V ie w B yId( R. id. uid) ; password=find V ie w B yId( R. id.p wd) ; signin= f ind V ie wB yId( R. id.s i gnin);
}
public void signin(View v) {
Bundle b=getIntent().getExtras();
String uname=b.getString("uid");
String passwd=b.getString("password");
if(username.getText().toString().equals(uname) &&
password.getText ().toS tr i ng().eq ua ls (pass wd)) {
Toast.makeText(this, "SIGN IN SUCCESSFUL", Toast.LENGTH_LONG).show();
attempts=0;
Intent i =new Intent(this,Success.class); startActivity(i);
}
else {
attempts++;
Toast.makeText(this,
Attempts="+attempts, Toast.LENGTH_LONG).show();
if(atte mpts==3 )
signin.s et Enab led ( fa lse) ;
} }
