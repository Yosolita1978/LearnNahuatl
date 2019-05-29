package co.yosola.nahuatl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class ColorsFragment extends Fragment {

    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_colors, container, false);

        ArrayList<Word> wordsOfColors = new ArrayList<Word>();

        wordsOfColors.add(new Word("Red", "Chichiltic", R.drawable.color_red));
        wordsOfColors.add(new Word("Green", "Xoxoctic", R.drawable.color_green));
        wordsOfColors.add(new Word("Brown", "Cafentic", R.drawable.color_brown));
        wordsOfColors.add(new Word("Grey", "Tenextic", R.drawable.color_gray));
        wordsOfColors.add(new Word("Black", "Yayahuic", R.drawable.color_black));
        wordsOfColors.add(new Word("White", "Chipahuac", R.drawable.color_white));
        wordsOfColors.add(new Word("Yellow", "Coztic", R.drawable.color_mustard_yellow));
        wordsOfColors.add(new Word("Blue", "Azultic", R.drawable.color_blue));
        wordsOfColors.add(new Word("Purple", "Camohtic", R.drawable.color_purple));
        wordsOfColors.add(new Word("Orange", "Achilcoz", R.drawable.color_orange));


        WordAdapter adapter = new WordAdapter(getActivity(), wordsOfColors, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        return rootView;
    }
}
