package com.example.iquizz.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.iquizz.databinding.FragmentGkBinding;
import com.example.iquizz.databinding.FragmentGkBinding;
import com.example.iquizz.gk1;

public class gkFragment extends Fragment {

    private FragmentGkBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gkViewModel gkViewModel =
                new ViewModelProvider(this).get(gkViewModel.class);

        binding = FragmentGkBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.gkStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(), gk1.class);
                startActivity(i);
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