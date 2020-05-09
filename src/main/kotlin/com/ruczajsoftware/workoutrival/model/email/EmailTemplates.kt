package com.ruczajsoftware.workoutrival.model.email

enum class EmailTemplates(private val key: String) {
    RESET_PASSWORD("reset_password");

    fun getKey(): String = key;
}
