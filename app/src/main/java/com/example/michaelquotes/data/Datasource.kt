package com.example.michaelquotes.data

import com.example.michaelquotes.R
import com.example.michaelquotes.model.Quote

class Datasource {
    fun loadQuotes(): List<Quote>{
        return listOf<Quote>(
            Quote(R.string.quote1, R.drawable.michael1),
            Quote(R.string.quote2, R.drawable.michael2),
            Quote(R.string.quote3, R.drawable.michael3),
            Quote(R.string.quote4, R.drawable.michael4),
            Quote(R.string.quote5, R.drawable.michael5),
            Quote(R.string.quote6, R.drawable.michael6),
            Quote(R.string.quote7, R.drawable.michael7),
            Quote(R.string.quote8, R.drawable.michael8),
            Quote(R.string.quote9, R.drawable.michael9),
            Quote(R.string.quote10, R.drawable.michael10),
        )
    }
}