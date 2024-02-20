package com.example.affirmations013.data
import com.example.affirmations013.R
import com.example.affirmations013.model.Affirmations

class Datasource() {
    fun loadAffirmations(): List<Affirmations> {
        return listOf<Affirmations>(
            Affirmations(R.string.affirmation1, R.drawable.angel_cookie_costume01),
            Affirmations(R.string.affirmation2, R.drawable.annoyed),
            Affirmations(R.string.affirmation3, R.drawable.happy),
            Affirmations(R.string.affirmation4, R.drawable.pure_vanilla_cookie_costume01),
            Affirmations(R.string.affirmation5, R.drawable.resource_default),
            Affirmations(R.string.affirmation6, R.drawable.sad),
            )
    }
}