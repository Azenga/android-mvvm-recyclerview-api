package com.shadow.mvvm_recyclerview

import com.shadow.mvvm_recyclerview.data.PropertiesApi

class PropertiesRepository(
    private val api: PropertiesApi
) : SafeApiRequest() {

    suspend fun getProperties() = apiRequest { api.getPropeties() }
}