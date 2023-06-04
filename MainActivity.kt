package com.ugurhakan.mylistvewactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ugurhakan.mylistvewactivity.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val icardi = Landmark(" Icardi","Argentina", R.drawable.icardi,R.drawable.arjantinaflag)
        val muslera = Landmark("Muslera","Uruguay", R.drawable.muslera,R.drawable.uruguayflag)
        val mertens = Landmark("Mertens","Belgium", R.drawable.mertens,R.drawable.belgiumflag)


        landmarkList.add(icardi)
        landmarkList.add(muslera)
        landmarkList.add(mertens)


        //RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = adapter
        /*
        //Adapter: Layout & Data

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(applicationContext,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList[position])
            //MySingleton.selectedLandmark = landmarkList[position]
            startActivity(intent)
        }

         */

    }
}