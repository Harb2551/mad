package com.example.labpgm3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; import android.os.Bundle; import android.view.View; import android.widget.EditText; import android.widget.Toast;
import java.util.regex.Matcher; import java.util.regex.Pattern;
public class MainActivity extends AppCompatActivity { EditText username, passwd;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(saved I nsta nc eStat e);
setC ontentView( R. la yo ut.ac t ivit y_ ma in); username = findViewById(R.id.uid); passwd = findViewById(R.id.pwd);
}
public void signup(View v) {
if(passwd.getText().toString().length()>=8 validatepass word(p ass wd. get Te xt (). toStr i ng() ))
{
Toast.makeText(this, "SIGN UP Successful", Toast.LENGTH_LONG).show(); Intent i = new Intent(this,Signin.class);
Bundle b=new Bundle();
b.putString( "uid ", user na me. get Te xt(). toSt r ing( ));
b.putString( "p ass word ",p ass wd. get Te xt(). toStr i ng() );
i.putExtras(b);
startActivity(i);
} else {
&&
Toast.makeText(this, Toast.LEN GTH_LO N G). s how ();
} }
public boolean validatepassword(String password) {

	Pattern ptrn; Matcher mat; 
	String javapasswordptrn="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[<>/@%$#+=])(?=\\S+$).{8,}$ ";

return mat.matches();
} }