package com.ruczajsoftware.workoutrival.model.authentication

import com.thinkinglogic.builder.annotation.Builder

@Builder
data class AuthenticationRequest(
    var email: String = "",
    var password: String = ""
)