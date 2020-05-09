package com.ruczajsoftware.workoutrival.model.email

import com.thinkinglogic.builder.annotation.Builder

@Builder
data class EmailTemplate(
    var email: String = "",
    var subject: String = "",
    var payload: String = ""
)