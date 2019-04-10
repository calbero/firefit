package samples.calbero.firefit.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Record::class, User::class], version = 1)
abstract class MainDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    abstract fun recordDao(): RecordDao

}