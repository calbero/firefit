package samples.calbero.firefit.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User (@PrimaryKey(autoGenerate = true) var id: Long?,
                 @ColumnInfo(name = "name") var name: String,
                 @ColumnInfo(name = "surname") var surname: String,
                 @ColumnInfo(name = "weight") var weight: Double,
                 @ColumnInfo(name = "height") var height: Double,
                 @ColumnInfo(name= "age") var age: Int) {

    constructor(): this(null, "", "", 0.0, 0.0, 0)

}