package fragments.android.hasnat.arif.com.anbdroidfragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import Fragment.Fragment1;
import Fragment.Fragment2;
import interfaces.Communicator;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    /*    FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        Fragment1 fragment1 =new Fragment1();
        fragmentTransaction.add(R.id.main_layout,fragment1,"fragment one");
        fragmentTransaction.commit(
*/




    }


    @Override
    public void respond(String data) {
        FragmentManager fragmentManager=getFragmentManager();
        Fragment2 fragment2= (Fragment2) fragmentManager.findFragmentById(R.id.fragment2);
        fragment2.changeText(data);

    }
}
