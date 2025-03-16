package org.example.kyu8;

public class DNAToRNA {
    public static String dnaToRna(String dna){
        return dna.replaceAll("(?i)[t]","U");
    }
}
