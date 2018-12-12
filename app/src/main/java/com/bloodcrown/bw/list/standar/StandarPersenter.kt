package com.bloodcrown.bw.list.standar

import android.util.Log
import com.bloodcrown.basecomponents.toast.ToastComponent

/**
 * 作者 ： BloodCrown
 * 时间 ： 2018/12/1 上午10:02
 * 描述 ：
 */
class StandarPersenter {

    fun miaoMiaoJiao(info: String) {
        ToastComponent.instance.show(info)
    }

    fun show(info: String, visibility: Int) {
        Log.d("AA", "vis:" + info + ",isshow:" + visibility)
    }

}