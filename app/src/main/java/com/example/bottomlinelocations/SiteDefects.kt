package com.example.bottomlinelocations

import java.text.SimpleDateFormat

data class SiteDefects(
    val id: Int,
    val siteName: String,
    val address: String,
    val location: String,
    val remark: String,
    val timestamp: String = SimpleDateFormat("yyyyMMdd_HHmm").format(java.util.Date())
) {
    companion object {
        fun getAll(): List<SiteDefects> {
            return listOf(
                SiteDefects(1, "Esso Brabantbad", "Kerkstraat 3", "","Telemetry of site is defect, this needs to be repaired"  ,"2020-10-03 1200"),
                SiteDefects(2, "Esso Molenhoek", "Dorpstraat 54", "","Telemetry of site is defect, this needs to be repaired"  ,"2020-10-06 1200"),
                SiteDefects(3, "Esso Vosje", "Tegenoverstraat 1", "","Telemetry of site is defect, this needs to be repaired"  ,"2020-10-10 1200"),
                SiteDefects(4, "Esso De Pomp", "Europalaan 21", "","Telemetry of site is defect, this needs to be repaired"  ,"2020-10-12 1200"),
                SiteDefects(5, "Esso De Oever", "Kerkstraat 343", "","Telemetry of site is defect, this needs to be repaired"  ,"2020-10-20 1200")
            )
        }

        fun getById(id: Int): SiteDefects? {
            return getAll().firstOrNull() { siteDefects -> siteDefects.id == id }
        }
    }
}