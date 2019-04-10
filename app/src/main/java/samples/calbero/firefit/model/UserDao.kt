package samples.calbero.firefit.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE

@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    fun insert(user: User): Long

}