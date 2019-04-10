package samples.calbero.firefit.model

import androidx.room.*
import androidx.room.ForeignKey.CASCADE

@Entity(tableName = "records", foreignKeys = [ForeignKey(entity = User::class,
    parentColumns = ["id"], childColumns = ["user_id"], onDelete = CASCADE)],
    indices = [Index("user_id")])
data class Record (@PrimaryKey(autoGenerate = true) val id: Long,
                   @ColumnInfo(name = "user_id") val userId: Long,
                   @ColumnInfo(name = "reps_number") var repsNumber: Int,
                   @ColumnInfo(name = "weight_lifted") var weightLifted: Double) {

}