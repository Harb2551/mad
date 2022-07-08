package com.example.textspeech;
import androidx.appcompat.app.AppCompatActivity;
import android.app.UiAutomation; import android.os.Bundle;
import android.speech.tts.TextToSpeech; import android.view.View;
import android.widget.EditText; import android.widget.Toast;
import java.util.Locale;
import static android.speech.tts.TextToSpeech.*;
public class MainActivity extends AppCompatActivity { EditText pitchrate,setspeechrate,text;
TextToSpeech t;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(saved I nsta nc eStat e); setContentView(R. la yo ut.activ ity_main);
pitchrate=findViewById(R. id.pitch); setspeechrate=findViewById(R.id. speechrate);
text=findVie wById(R. id.tex ttospeak );
t=new TextToSpeech(this, new OnInitListener() { @Override
public void onInit(int status) { if(status==SUCCESS)
{
t.setLangua ge (Lo ca le.ENGLISH) ;
} else {
Toast.makeText(MainActivity.this, "TextToSpeech Initialization Failed", Toast.LENGTH_LONG).show();
} }
});
}
public void speak(View v) {

	float pr,sr;
String txt;
if(pitc hr ate. ge tTe xt( ).toSt r ing().eq ua ls( " ")) {
pr=1.0f; }
else {
pr=Float.parseFloat (pitc hra te. get Te xt(). toSt r ing( )); }
if(setspeechrate. get Te xt ().toS tr i ng().eq ua ls( " "))
{
sr=1.0f;
} else
{
sr=Float.parseFloat (setspeechrate. get Te xt ().toS tr i ng() );
}
t.setPitch(pr);
t.setSpeechRate(sr);
t.speak(text.getText().toString(), QUEUE_FLUSH,null);
} }