package com.example.notemu;

import androidx.cardview.widget.CardView;

import com.example.notemu.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
