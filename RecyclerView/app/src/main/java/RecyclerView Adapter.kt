import android.graphics.ColorSpace
import android.provider.ContactsContract.Directory.PACKAGE_NAME
import androidx.recyclerview.widget.RecyclerView

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.*

class ${NAME} : RecyclerView.Adapter<${ ColorSpace.Model }Adapter.ViewHolder>() {

    var data: MutableList<${ ColorSpace.Model }> = mutableListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.${ Item_Layout_ID }, parent, false)
        )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = holder.bind(data[position])

    override fun getItemCount() = data.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: ${
            ColorSpace.Model
        }) = with(itemView) {
            // TODO: Bind the data with View
        }
    }
}