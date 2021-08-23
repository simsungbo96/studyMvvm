package com.sbsj.baseproduct.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(

    @SerializedName("name")val name: String,
    @SerializedName("nickname")val nickname: String,
    @SerializedName("RESULT_CD") val resultCd: String
    ) : Serializable
