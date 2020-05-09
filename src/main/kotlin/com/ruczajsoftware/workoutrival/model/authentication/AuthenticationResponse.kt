package com.ruczajsoftware.workoutrival.model.authentication

import com.thinkinglogic.builder.annotation.Builder

@Builder
data class AuthenticationResponse(
    var token: String = ""
)