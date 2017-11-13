package nowapps.tripncash;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_home, container, false);
        final LinearLayout Opt1 = view.findViewById(R.id.opt1);
        final LinearLayout Opt2 = view.findViewById(R.id.opt2);
        final LinearLayout Opt3 = view.findViewById(R.id.opt3);
        Opt1.postDelayed(new Runnable() {
            public void run() {
                Opt1.setVisibility(View.VISIBLE);
            }
        }, 300);

        Opt2.postDelayed(new Runnable() {
            public void run() {
                Opt2.setVisibility(View.VISIBLE);
            }
        }, 600);

        Opt3.postDelayed(new Runnable() {
            public void run() {
                Opt3.setVisibility(View.VISIBLE);
            }
        }, 900);
        return view;
    }

}
