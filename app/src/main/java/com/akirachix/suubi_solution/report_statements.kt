package com.akirachix.suubi_solution

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.suubi_solution.databinding.ActivityReportLayoutBinding
import com.akirachix.suubi_solution.databinding.ActivityStatementsBinding
import com.akirachix.suubi_solution.databinding.ReportLayoutBinding

class report_statements : AppCompatActivity() {
    lateinit var binding: ActivityReportLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imback.setOnClickListener{
            finish()
        }
        displayReports()

    }
    fun displayReports(){
        val report = ReportList("12/2/24", 2000.0, 2000.0 )
        val report1 = ReportList("12/2/24", 2000.0, 4000.0 )

        val displaylist = listOf(report,report1)
        val listAdapter = ReportAdapter(displaylist)
        binding.rvReport.adapter=listAdapter
    }

}


