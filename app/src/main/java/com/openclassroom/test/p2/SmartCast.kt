package com.openclassroom.test.p2

import kotlin.contracts.ReturnsNotNull

private fun getDefaultSizeV1(anyObject: Any): Int {
    if(anyObject is String){
        return anyObject.length
    } else if (anyObject is List<*>){
        return  anyObject.size
    }

    return 0
}


private fun getDefaultSizeV2(anyObject: Any) = when(anyObject){
    is String -> anyObject.length
    is List<*> -> anyObject.size
    else -> 0
}
