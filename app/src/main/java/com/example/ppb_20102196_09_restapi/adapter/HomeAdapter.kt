package com.example.ppb_20102196_09_restapi.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.ppb_20102196_09_restapi.databinding.UserListBinding
import com.example.ppb_20102196_09_restapi.model.request.DataMahasiswa

class HomeAdapter(private var DataMahasiswa : List<DataMahasiswa>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>(){
    class ViewHolder(val binding : UserListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = UserListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return DataMahasiswa.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position:
    Int) {
        holder.binding.txtNama.text = DataMahasiswa[position].nama
        holder.binding.txtNim.text = DataMahasiswa[position].nIM
        holder.binding.txtTelepon.text = DataMahasiswa[position].telepon
        holder.binding.cardView.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nim",DataMahasiswa[position].nIM)
            bundle.putString("nama",DataMahasiswa[position].nama)
            bundle.putString("telepon",DataMahasiswa[position].telepon)
            Navigation.findNavController(it).navigate(com.example.ppb_20102196_09_restapi.R.id.action_homeFragment_to_detailFragment, bundle)
        }
    }
}
