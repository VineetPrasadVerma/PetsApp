package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    public static class PetEntry implements BaseColumns {

        /**
         * Inner class that defines constant values for the pets database table.
         * Each entry in the table represents a single pet.
         */
        public static final String TABLE_NAME = "pets";
        public static final String ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_WEIGHT = "weight";

        //posssible values for the column gender.
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;
    }
}
