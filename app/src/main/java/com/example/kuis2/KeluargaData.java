package com.example.kuis2;

import java.util.ArrayList;

public class KeluargaData {
    private static String[] keluargaNama = {
            "Wasis Siswanto",
            "Lilik Suhartini",
            "Kevin Merico Setiawan",
            "Noval Dwi Pamungkas",
            "Nur Azizah Trialila"
    };

    private static String[] keluargaKeterangan = {
            "Ayah",
            "Ibu",
            "Anak Pertama",
            "Anak Kedua",
            "Anak Ketiga"
    };

    private static int[] heroesImages = {
            R.drawable.ayah,
            R.drawable.mamski,
            R.drawable.iko,
            R.drawable.noval,
            R.drawable.ila
    };

    static ArrayList<Keluarga> getListData() {
        ArrayList<Keluarga> list = new ArrayList<>();
        for (int pos = 0; pos < keluargaNama.length; pos++){
            Keluarga keluarga = new Keluarga();
            keluarga.setNama(keluargaNama[pos]);
            keluarga.setKeterangan(keluargaKeterangan[pos]);
            keluarga.setFoto(heroesImages[pos]);
            list.add(keluarga);
        }
        return list;
    }
}
