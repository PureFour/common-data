package com.ruczajsoftware.workoutrival.model.database

import com.thinkinglogic.builder.annotation.Builder
import java.util.Date

@Builder
data class PersonalData(
    var birthday: Date = Date(),
    var weight: Float = 0f,
    var height: Int = 0,
    var sex: Sex = Sex.MALE
)