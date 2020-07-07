package com.yusril.musicplayler.model

import java.io.Serializable

/**
 * Created by Yusril Ihza Mahendra
 */

class ModelListLagu : Serializable {

    var strId: String? = null

    @JvmField
    var strJudulMusic: String? = null

    @JvmField
    var strNamaBand: String? = null

    @JvmField
    var strCoverLagu: String? = null

}