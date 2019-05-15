package co.yosola.nahuatl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersFragment extends Fragment {


    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_numbers, container, false);
        ArrayList<Word> wordsOfNumbers = new ArrayList<Word>();

        wordsOfNumbers.add(new Word("One", "ce", R.drawable.number_one_nahuatl));
        wordsOfNumbers.add(new Word("Two", "ome", R.drawable.number_two_nahuatl));
        wordsOfNumbers.add(new Word("Three", "yei", R.drawable.number_three_nahuatl));
        wordsOfNumbers.add(new Word("Four", "nahui", R.drawable.number_four_nahuatl));
        wordsOfNumbers.add(new Word("Five", "macuilli", R.drawable.number_five_nahuatl));
        wordsOfNumbers.add(new Word("Six", "chicuace", R.drawable.number_six_nahuatl));
        wordsOfNumbers.add(new Word("Seven", "chicome", R.drawable.number_seven_nahuatl));
        wordsOfNumbers.add(new Word("Eight", "chicuei", R.drawable.number_eight_nahuatl));
        wordsOfNumbers.add(new Word("Nine", "chiconahui", R.drawable.number_nine_nahuatl));
        wordsOfNumbers.add(new Word("Ten", "mahtlactli", R.drawable.number_ten_nahuatl));


        WordAdapter adapter = new WordAdapter(getActivity(), wordsOfNumbers, R.color.category_numbers);

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
