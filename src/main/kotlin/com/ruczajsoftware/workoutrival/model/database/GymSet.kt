package com.ruczajsoftware.workoutrival.model.database

import com.thinkinglogic.builder.annotation.Builder

@Builder
data class GymSet(
   var reps: Int = 0,
   var weight: Double = 0.0
)