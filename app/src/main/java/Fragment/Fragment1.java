package Fragment;

import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import fragments.android.hasnat.arif.com.anbdroidfragments.R;
import interfaces.Communicator;

/**
 * Created by Arif on 27/12/2015.
 */
public class Fragment1 extends Fragment implements View.OnClickListener{

    Button buttonClickMe;
    int counter=0;
    Communicator comm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1,container,false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm= (Communicator) getActivity();
        buttonClickMe= (Button) getActivity().findViewById(R.id.buttonClickHereFromFragment1);



    }


    @Override
    public void onClick(View v) {

                counter++;
                comm.respond("Button clicked "+counter+" times ");
    }
}
