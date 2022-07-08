package com.example.program5;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler; import android.view.View;
import android.widget.Button; import android.widget.TextView;
public class MainActivity extends AppCompatActivity { int i=1;
Button start,stop; TextView counter;
Handler myhandler=new Handler();
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(saved I nsta nc eStat e); setContentView(R. la yo ut.activ ity_main); start=find ViewById(R. id.start); stop=findViewById (R. id.stop); counter=findV ie wB yId( R. id. count );
}
public void start(View v)
{
i=1;
myhand ler.po st De la yed ( Threadco unt,0);
}
public void stop(View v) {
myhand ler. re mo veCa l lback s( Threadco unt) ; }
public Runnable Threadcount=new Runnable()
{
@Override
public void run() {
counter.setTe xt( " "+ i) ; i++;
myhand ler.po st De la yed ( Threadco unt,0) ; }
}; }