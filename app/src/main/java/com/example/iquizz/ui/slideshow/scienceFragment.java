package com.example.iquizz.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.iquizz.databinding.FragmentScienceBinding;
import com.example.iquizz.databinding.FragmentScienceBinding;
import com.example.iquizz.sci1;

public class scienceFragment extends Fragment {
    Button start;
    private FragmentScienceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        scienceViewModel slideshowViewModel =
                new ViewModelProvider(this).get(scienceViewModel.class);

        binding = FragmentScienceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.sciStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), sci1.class);
                startActivity(intent);
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}