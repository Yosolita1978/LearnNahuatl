package co.yosola.nahuatl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class FamilyFragment extends Fragment {
    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_family, container, false);
        ArrayList<Word> wordsOfFamily = new ArrayList<Word>();

        wordsOfFamily.add(new Word("Father", "Tlahtli", R.drawable.family_father));
        wordsOfFamily.add(new Word("Mother", "Nantli", R.drawable.family_mother));
        wordsOfFamily.add(new Word("Son", "Pilli", R.drawable.family_son));
        wordsOfFamily.add(new Word("Daughter", "Cihua-pilli", R.drawable.family_daughter));
        wordsOfFamily.add(new Word("Grandmother", "Cihtzin", R.drawable.family_grandmother));
        wordsOfFamily.add(new Word("Grandfather", "Coltzin", R.drawable.family_grandfather));
        wordsOfFamily.add(new Word("Brother", "Ihni", R.drawable.family_younger_brother));
        wordsOfFamily.add(new Word("Sister", "Cihua-ihni", R.drawable.family_younger_sister));
        wordsOfFamily.add(new Word("Uncle", "Yez-tahtzin", R.drawable.family_older_brother));
        wordsOfFamily.add(new Word("Aunt", "Cihua-yez-tahtzin", R.drawable.family_older_sister));


        WordAdapter adapter = new WordAdapter(getActivity(), wordsOfFamily, R.color.category_family);

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
