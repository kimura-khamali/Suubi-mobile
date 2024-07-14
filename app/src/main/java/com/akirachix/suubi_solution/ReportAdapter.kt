package com.akirachix.suubi_solution

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.suubi_solution.databinding.ReportLayoutBinding

class ReportAdapter(val reports: List<ReportList>):RecyclerView.Adapter<ReportViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportViewHolder {
        var binding = ReportLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ReportViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReportViewHolder, position: Int) {
        val reportlist = reports[position]
        holder.binding.tvDate.text = reportlist.date
        holder.binding.tvSaving.text = reportlist.saving.toString()
        holder.binding.tvBalance.text = reportlist.balance.toString()

    }

    override fun getItemCount(): Int {
        return reports.size
    }
}
class ReportViewHolder(var binding: ReportLayoutBinding):RecyclerView.ViewHolder(binding.root)