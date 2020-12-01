package com.example.bottomlinelocations.database
/*
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.bottomlinelocations.data.SiteDefects
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized
import kotlinx.coroutines.launch

@Database(entities = [SiteDefects::class], version = 1, exportSchema = false)
abstract class MyRoomDatabase: RoomDatabase() {

    abstract fun siteDefectDAO(): com.example.bottomlinelocations.data.SiteDefectDAO

    companion object {

        @Volatile
        private var INSTANCE: MyRoomDatabase? = null

        @InternalCoroutinesApi
        fun getInstance(context: Context): MyRoomDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    if (INSTANCE == null) {
                        val instance = Room.databaseBuilder(
                            context.applicationContext,
                            MyRoomDatabase::class.java,
                            "myRoomDatabase"
                        ).addCallback(MyRoomDatabasePopulator())
                            .build()
                        INSTANCE = instance
                    }
                }
            }
            return INSTANCE!!
        }
    }

    private class MyRoomDatabasePopulator : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            INSTANCE?.let {
                GlobalScope.launch {
                    val siteDefectDAO = it.siteDefectDAO()
                    siteDefectDAO.deleteAll()
                    siteDefectDAO.insert(SiteDefects(1, "Esso Brabantbad", "Kerkstraat 3", "","Telemetry of site is defect, this needs to be repaired"  ,"2020-10-03 1200") )
                    siteDefectDAO.insert(SiteDefects(2, "Esso Molenhoek", "Dorpstraat 54", "","Telemetry of site is defect, this needs to be repaired"  ,"2020-10-06 1200"))
                }
            }
        }
    }
}

 */