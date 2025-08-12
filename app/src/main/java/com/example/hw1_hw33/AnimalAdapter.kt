package com.example.hw1_hw33

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hw1_hw33.databinding.ItemAnimalBinding

class AnimalAdapter: RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    var animalList = arrayListOf<AnimalModel>(
        AnimalModel(title = "Mama", desc = "0559595959", img = "https://icdn.lenta.ru/images/2023/09/15/17/20230915175028782/square_320_62dfd2e5218b89d74316ddf923d9d7d3.jpg"),
        AnimalModel(title = "Dad", desc = "0555555555", img = "https://icdn.lenta.ru/images/2023/09/15/17/20230915175028782/square_320_62dfd2e5218b89d74316ddf923d9d7d3.jpg"),
        AnimalModel(title = "Sister", desc = "0557575757", img = "https://icdn.lenta.ru/images/2023/09/15/17/20230915175028782/square_320_62dfd2e5218b89d74316ddf923d9d7d3.jpg"),
        AnimalModel(title = "Brother", desc = "0557575757", img = "https://icdn.lenta.ru/images/2023/09/15/17/20230915175028782/square_320_62dfd2e5218b89d74316ddf923d9d7d3.jpg"),
    );

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.onBind(animalList[position])
    }

    override fun getItemCount(): Int {
        return animalList.size;
    }


    class ViewHolder(private val binding: ItemAnimalBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(animalModel: AnimalModel) {
            binding.tvTitle.text = animalModel.title
            binding.tvDesc.text = animalModel.desc
            Glide.with(binding.ivPhoto).load(animalModel).into(binding.ivPhoto);
        }

    }
}