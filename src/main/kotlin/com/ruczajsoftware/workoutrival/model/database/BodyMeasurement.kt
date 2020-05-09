package com.ruczajsoftware.workoutrival.model.database

import com.thinkinglogic.builder.annotation.Builder
import java.util.Date

@Builder
data class BodyMeasurement(
    var actualDay: Date = Date(),
    var weight: Float = Float.NaN
)