package com.sbsj.baseproduct.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.sbsj.baseproduct.MyApplication
import com.sbsj.baseproduct.R
import com.sbsj.baseproduct.model.User

class UserRecyclerAdapter(private val context: Context) : RecyclerView.Adapter<UserRecyclerAdapter.ViewHolder>() {

    var userList = mutableListOf<User>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UserRecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserRecyclerAdapter.ViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int  = userList.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val txtName: TextView = itemView.findViewById(R.id.item_list_firstTv)
        private val txtAge: TextView = itemView.findViewById(R.id.item_list_secondTv)


        fun bind(item: User) {
            txtName.text = item.name
            txtAge.text = item.nickname


        }
    }

    fun addItem(user:User)
    {
        userList.add(user)
        notifyDataSetChanged()
    }

}