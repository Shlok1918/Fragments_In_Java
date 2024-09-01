package com.shlok.blackcoffer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BusinessFragment extends Fragment {

    private List<item_profile> profileList;
    private RecyclerView recyclerView;
    private profile_adapter profileAdapter;
    public BusinessFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_personal, container, false);

        profileList = generate_item_profile();

        recyclerView = rootView.findViewById(R.id.personal_Recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        profileAdapter = new profile_adapter(profileList);
        recyclerView.setAdapter(profileAdapter);

        return rootView;
    }
    private List<item_profile> generate_item_profile() {
        List<item_profile> profiles = new ArrayList<>();
        profiles.add(new item_profile(R.drawable.dummy_profile, "Shreyash Yadav", "Badlapur | Full-Stack developer", "Within 200-300 m", "Coffee | Friendship | Movies | Hobbies", "Hi community! I am open to new Connections"));
        profiles.add(new item_profile(R.drawable.dummy_profile, "Mohit Mahamulkar", "Juhu | Frontend developer", "Within 500-600 m", "Coffee | Business | Movies | Hobbies", "Hi community! I am open to new Connections"));
        profiles.add(new item_profile(R.drawable.dummy_profile, "Umesh Lodha", "Vadala | Software developer", "Within 100-200 m", "Coffee | Business | Friendship | Movies | Hobbies", "Hi community! I am open to new Connections"));
        profiles.add(new item_profile(R.drawable.dummy_profile, "Hardik Shetty", "Chakala | Java Backend", "Within 100-200 m", "Coffee | Business | Friendship | Hobbies", "Hi community! I am open to new Connections"));

        return profiles;
    }
}