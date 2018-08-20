package com.example.syend.womaniya.features

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.syend.womaniya.R
import com.example.syend.womaniya.data.local.DbModel
import com.example.syend.womaniya.data.remote.models.Child
import com.example.syend.womaniya.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter<Adapter.Holder>() {

    var mList = ArrayList<DbModel>()

    /**
     * Setting [DbModel] list
     */
    fun setList(list: List<DbModel>) {
        mList = list as ArrayList<DbModel>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemBinding: ItemLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_layout, parent, false)
        return Holder(itemBinding)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(mList[position])
    }

    inner class Holder(itemView: ItemLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {
        var mItemView = itemView

        fun bind(model: DbModel) {
            mItemView.viewModel = ItemViewModel(model)

            if (model.imgUrl != null)
                Glide.with(itemView.context)
                        .load(model.imgUrl)
                        .apply(RequestOptions()
                                .circleCrop()
                                .placeholder(R.mipmap.loading)
                                .error(R.mipmap.loading)
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                        ).into(mItemView.imageView)
        }
    }

}