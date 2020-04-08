package com.example.kotlin_app

import android.os.Environment

fun printEnvironment() {
    val dataDir = Environment.getDataDirectory()
    println(dataDir.absolutePath)
    val rootDir = Environment.getRootDirectory()

    val files = rootDir.listFiles()
    if (files != null) {
        for (index in files.indices) {
            val f = files[index]
            println(" file $index = ${f.name} ")
        }
    }


    println("root dir = ${rootDir.absolutePath}")
    val externalState = Environment.getExternalStorageState()
    println(" external state =  $externalState")

    val downloadCache = Environment.getDownloadCacheDirectory()
    println("download cache = ${downloadCache.absolutePath}")
}



private fun getIndex(count: Int) {
//    return null
    val index = count + 10

}