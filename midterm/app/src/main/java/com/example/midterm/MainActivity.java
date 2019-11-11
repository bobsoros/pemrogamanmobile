package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

     ArrayList<Model> models = new ArrayList<>();

     Model model = new Model();
     model.setTitle("BILLFOLD");
     model.setDescription("BILLFOLD adalah pop punk hardcore band berasal dari Bandung yang terbentuk di awal tahun 2010. Band ini merupakan sebuah project baru dari Gania Alianda bersama Pam, Anga dan Ferin. Mereka mencoba untuk membuat suasana baru di belantika musik Indonesia, dengan front line wanita di dalamnya");
     model.setImg(R.drawable.bilfold);
     models.add(model);

     model = new Model();
     model.setTitle("STAND HERE ALONE");
     model.setDescription("Stand Here Alone digawangi oleh Ocan  pada posisi gitar dan vokal, Mbenk di posisi bass dan vokal dan Chio sebagai penggebuk drum. Band ini awalnya terbentuk untuk meramaikan perayaan kemerdekaan atau yang biasa disebut tujuh belasan, di daerah rumahnya sang bassist yakni Mbenk, yang berada di Pajajaran, Bandung.\n" +
             "\n" +
             "Kemudian Ocan pun bergabung atas dasar rekomendasi dari sang kakak, yang merupakan teman nongkrong dari Mbenk dan Chio, sekaligus Evan sang manajer Stand Here Alone. Sebagai band yang baru terbentuk, sudah sewajarnya mereka mengawali dengan main sebagai band registrasi, dari panggung ke panggung. Adapula masa di saat mereka harus berjuang berdarah-darah untuk manggung, yang mungkin akan selalu mereka kenang sampai sekarang.");
     model.setImg(R.drawable.sha);
     models.add(model);

     model = new Model();
     model.setTitle("SHEILA ON7");
     model.setDescription("Sheila On 7 adalah grup musik Indonesia yang berdiri pada 6 Mei 1996 di Yogyakarta. Grup band ini pada awalnya adalah sekumpulan anak-anak sekolah dari beberapa SMA di Yogyakarta. ... Mereka sepakat untuk membentuk sebuah band dan membawakan lagu-lagu dari kelompok Oasis, U2, Bon Jovi, Guns N' Roses, dll.");
     model.setImg(R.drawable.sheila);
     models.add(model);

     model = new Model();
     model.setTitle("REVENGE THE FATE");
     model.setDescription("Singkat cerita, Cikhal setuju untuk bergabung dengan band yang telah didirikan oleh Sona cs., band tersebut bernama Revenge The Fate. Masuknya Cikhal membawa angin segar untuk perkembangan band pengusung Deathcore tersebut.\n" +
             "\n" +
             "Disadari atau nggak, Cikhal seperti membawa “hoki” untuk band yang sekarang tengah menggarap album keduanya itu. Secara alamiah, “Fengshui” formasi Revenge The Fate ikutan berubah, Anggi yang tadinya drummer, menjadi vokalis, posisi tukang gebuk drum akhirnya sempat digantikan ke beberapa drummer cabutan.\n" +
             "\n" +
             "“Anggi mau jadi vokalis karena waktu ada acara tahun baru sebuah radio di Cicalengka, saya sama Anggi iseng bikin band sama anak-anak di Cicalengka. Nah, Anggi coba waktu itu iseng jadi vokalis, ternyata  bagus, ya udah coba dilanjut, waktu itu, bawain lagu apa ya, Nggi?” tanya Sona ke Anggi.");
     model.setImg(R.drawable.rtf);
     models.add(model);

     model = new Model();
     model.setTitle("AVENGED SEVENFOLD");
     model.setDescription("Avenged Sevenfold (sering juga ditulis A7X) adalah grup musik Heavy Metal Amerika Serikat yang dibentuk pada tahun 1999. Grup musik ini berasal dari Huntington Beach, California. Anggota Avenged Sevenfold pada saat ini terdiri dari M. Shadows, Synyster Gates, Zacky Vengeance, Johnny Christ, dan Brooks Wackerman.\n" +
             "\n" +
             "Band ini dikenal dengan genre Metalcore pada debut mereka Sounding the Seventh Trumpet, yang mengandung banyak vokal scream. Band ini mengubah gaya mereka di album ketiga mereka, City of Evil, yang menampilkan vokal melodis dan power ballad. Band ini terus mengeksplorasi suara baru dengan mengeluarkan yang berjudul Avenged Sevenfold dan menikmati kesuksesan sebelum drummer mereka, James \"The Rev\" Owen Sullivan, meninggal karena penyakit jantung karena dampak gabungan dari obat dan alkohol di tubuhnya pada tahun 2009. Meskipun drummer sudah meninggal, band ini melanjutkan dengan bantuan mantan drummer Dream Theater Mike Portnoy untuk merilis dan melakukan tur dalam mendukung Nightmare, album kelima mereka pada tahun 2010 yang menjadi album top di Billboard 200.[1] Akhir - akhir ini, album keenam mereka, Hail to the King menjadi album nomor satu di berbagai negara, seperti Amerika Serikat, Finlandia, Brazil, dan Irlandia.\n" +
             "\n" +
             "Sampai saat ini, Avenged Sevenfold telah merilis enam album studio, satu album live, kompilasi, DVD, dan delapan belas single dan terjual lebih dari 8 juta album di seluruh dunia.[2][3]");
     model.setImg(R.drawable.yuhu);
     models.add(model);

     return models;
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profile:
                Intent activity1 = new Intent( this, biodata.class);
                startActivity(activity1);
                return true;
            default:
                return true;

        }
    }
}
