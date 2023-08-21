package com.example.iquizz.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.iquizz.databinding.FragmentDemoBinding;
import com.example.iquizz.databinding.FragmentDemoBinding;
import com.example.iquizz.demo1;

public class DemoFragment extends Fragment {
    Button b1;

    private @NonNull FragmentDemoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DemoViewModel homeViewModel =
                new ViewModelProvider(this).get(DemoViewModel.class);

        binding = FragmentDemoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(), demo1.class);
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