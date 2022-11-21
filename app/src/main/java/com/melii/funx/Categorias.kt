package com.melii.funx

import android.os.Parcel
import android.os.Parcelable

data class Categorias(val image:Int , val name:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Categorias> {
        override fun createFromParcel(parcel: Parcel): Categorias {
            return Categorias(parcel)
        }

        override fun newArray(size: Int): Array<Categorias?> {
            return arrayOfNulls(size)
        }
    }
}

