package com.sovell.brvahdemo

import android.content.Context
import android.view.ViewGroup
import com.chad.library.adapter4.BaseQuickAdapter
import com.chad.library.adapter4.viewholder.QuickViewHolder
import com.sovell.brvahdemo.databinding.ItemTagBinding

/**
 * @Title: BRVAHDemo
 * @Package com.sovell.brvahdemo
 * @Description: (用一句话描述该文件做什么)
 * @author MrSimpleZ
 * @date 2023/11/22 10:25
 * @version V1.0
 */
class TagAdapter : BaseQuickAdapter<String, QuickViewHolder>() {
    override fun onBindViewHolder(holder: QuickViewHolder, position: Int, item: String?) {
        val binding = ItemTagBinding.bind(holder.itemView)
        binding.tvName.text = item
    }

    override fun onCreateViewHolder(
        context: Context,
        parent: ViewGroup,
        viewType: Int
    ): QuickViewHolder {
        return QuickViewHolder(R.layout.item_tag, parent)
    }
}