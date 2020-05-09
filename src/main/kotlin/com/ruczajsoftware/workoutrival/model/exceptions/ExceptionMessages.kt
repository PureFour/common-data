package com.ruczajsoftware.workoutrival.model.exceptions

enum class ExceptionMessages(private val msg: String) {
    USER_NOT_FOUND("User not found in database"),
    PASSWORD_CONFLICT("Password must be different"),
    INCORRECT_CREDENTIALS("Incorrect username or password"),
    EMAIL_CONFLICT("Email must be different"),
    EMAIL_INCORRECT("Incorrect email"),
    USER_CONFLICT("User exists in database"),
    PIN_INCORRECT("Incorrect PIN"),
    PIN_NOT_FOUND("Cannot find reset password PIN for given email");

    fun getMsg(): String = msg
}
