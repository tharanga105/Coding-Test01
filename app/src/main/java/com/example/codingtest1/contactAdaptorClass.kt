    package com.example.codingtest1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent


class ContactAdaptorClass(private val mList:List<ContactDataClass>): RecyclerView.Adapter<ContactAdaptorClass.ViewHolder>() {

    private lateinit var tvContactName: TextView



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            // Define click listener for the ViewHolder's View
            tvContactName = itemView.findViewById(R.id.tvContactName)

            //Click events
            tvContactName.setOnClickListener {
                var position = absoluteAdapterPosition
                var nextScreen = Intent(itemView.context,ContactDeatailActivity::class.java)

                val contactObject = ContactDataClass(
                    contactId = mList[position].contactId,
                    contactName = mList[position].contactName,
                    contactNumber = mList[position].contactNumber,
                    contactEmail = mList[position].contactEmail,
                    contactBirthday = mList[position].contactBirthday
                )
                nextScreen.putExtra("ContactObject",contactObject)
                itemView.context.startActivity(nextScreen)
            }

            itemView.setOnClickListener {
                var position = absoluteAdapterPosition
                var nextScreen = Intent(itemView.context,ContactDeatailActivity::class.java)

                val contactObject = ContactDataClass(
                    contactId = mList[position].contactId,
                    contactName = mList[position].contactName,
                    contactNumber = mList[position].contactNumber,
                    contactEmail = mList[position].contactEmail,
                    contactBirthday = mList[position].contactBirthday
                )
                nextScreen.putExtra("ContactObject",contactObject)
                itemView.context.startActivity(nextScreen)

            }


            //Click on specific ui view
            /*     uiViewVariable1.setOnClickListener{
                     var position = absoluteAdapterPosition
                     var nextScreen = Intent(itemView.context,nextActivity::class.java)

                     var sampleObject = sampleDataClass(
                         productId = mList[position].productId,
                         productName = mList[position].productName,
                         productPrice = mList[position].productPrice,
                         productImage = mList[position].productImage
                     )
                     nextScreen.putExtra("ProductObject",productObject)

                     itemView.context.startActivity(nextScreen)

                 }*/

            //Click on whole item
            /*       itemView.setOnClickListener{
                       var position = absoluteAdapterPosition
                       var nextScreen = Intent(itemView.context,nextActivity::class.java)

                       var sampleObject = sampleDataClass(
                           productId = mList[position].productId,
                           productName = mList[position].productName,
                           productPrice = mList[position].productPrice,
                           productImage = mList[position].productImage
                       )
                       nextScreen.putExtra("ProductObject",productObject)

                       itemView.context.startActivity(nextScreen)
                   }*/


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.cardview_contact, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.apply {
            tvContactName.text = mList[position].contactName

        }

    }


}