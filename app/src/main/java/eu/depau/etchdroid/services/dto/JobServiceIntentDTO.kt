package eu.depau.etchdroid.services.dto

import android.os.Parcel
import eu.depau.kotlet.android.parcelable.KotletParcelable
import eu.depau.kotlet.android.parcelable.parcelableCreator
import java.io.Serializable

data class JobServiceIntentDTO(
        val jobId: Long
) : KotletParcelable, Serializable {
    constructor(parcel: Parcel) : this(
            parcel.readLong()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.apply {
            writeLong(jobId)
        }
    }

    companion object {
        @JvmField
        val CREATOR = parcelableCreator(::JobServiceIntentDTO)

        @JvmField
        val EXTRA = "eu.depau.etchdroid.broadcast.extras.JOB_SERVICE_DTO"
    }
}