package com.uniteinc.a7minutesworkout

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.uniteinc.a7minutesworkout.databinding.ItemsExerciseStatusBinding


class ExerciseStatusAdapter( var items :ArrayList<ExerciseModel>):
    RecyclerView.Adapter<ExerciseStatusAdapter.ViewHolder>() {

        class ViewHolder(binding: ItemsExerciseStatusBinding): RecyclerView.ViewHolder(binding.root){
                val tvItems = binding .tvItem
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemsExerciseStatusBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model :ExerciseModel   = items[position]
        holder.tvItems.text = model.getId().toString()

        when{
            model.getIsSelected() ->{
                holder.tvItems.background =
                    ContextCompat.getDrawable(holder.itemView.context,
                    R.drawable.item_color_thin_border)
                holder.tvItems.setTextColor(Color.parseColor("#212121"))
            }
            model.getIsCompleted()->{
                holder.tvItems.background =
                    ContextCompat.getDrawable(holder.itemView.context,
                        R.drawable.items_circular_color_accent_background)
                holder.tvItems.setTextColor(Color.parseColor("#ffffff"))
            }
            else->{
                holder.tvItems.background =
                    ContextCompat.getDrawable(holder.itemView.context,
                        R.drawable.item_circular_color_grey_background)
                holder.tvItems.setTextColor(Color.parseColor("#212121"))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}