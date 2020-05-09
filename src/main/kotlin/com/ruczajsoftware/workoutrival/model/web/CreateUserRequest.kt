package com.ruczajsoftware.workoutrival.model.web

import com.thinkinglogic.builder.annotation.Builder

@Builder
data class CreateUserRequest(
    var username: String = "",
    var password: String = "",
    var email: String = ""
)