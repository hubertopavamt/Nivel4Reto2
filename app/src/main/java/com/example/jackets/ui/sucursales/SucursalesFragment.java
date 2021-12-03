package com.example.jackets.ui.sucursales;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.jackets.R;

public class SucursalesFragment extends Fragment {

    private SucursalesViewModel sucursalesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sucursalesViewModel =
                new ViewModelProvider(this).get(SucursalesViewModel.class);


        View root = inflater.inflate(R.layout.fragment_sucursales, container, false);

        final TextView textView = root.findViewById(R.id.text_sucursales);
        sucursalesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
