package com.ruczajsoftware.workoutrival.model.web

import com.thinkinglogic.builder.annotation.Builder

@Builder
data class UpdateUserPasswordRequest(
    var email: String = "",
    var newPassword: String = "",
    var pin: String = ""
)