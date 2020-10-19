package com.ruczajsoftware.workoutrival.model.authentication

import com.thinkinglogic.builder.annotation.Builder

@Builder
data class AuthenticationRequest(
    var login: String = "",
    var password: String = ""
)