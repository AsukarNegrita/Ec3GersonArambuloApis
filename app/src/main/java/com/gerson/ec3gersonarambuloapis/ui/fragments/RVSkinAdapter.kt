package com.gerson.ec3gersonarambuloapis.ui.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.gerson.ec3gersonarambuloapis.R
import com.gerson.ec3gersonarambuloapis.databinding.ItemSkinBinding
import com.gerson.ec3gersonarambuloapis.model.Skin

class RVSkinAdapter(var skins:List<Skin>): RecyclerView.Adapter<SkinVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkinVH {
        val binding = ItemSkinBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SkinVH(binding)
    }

    override fun getItemCount(): Int = skins.size

    override fun onBindViewHolder(holder: SkinVH, position: Int) {
        holder.bind(skins[position])
    }
}
class SkinVH(private val binding: ItemSkinBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(skin: Skin) {
        binding.txtSkinname.text=skin.displayName
        if (skin.displayIcon.isNotEmpty()) {
            binding.imageSkins.load(skin.displayIcon)
        } else {
            binding.imageSkins.setImageResource(R.drawable.skin1)
        }

    }

}
