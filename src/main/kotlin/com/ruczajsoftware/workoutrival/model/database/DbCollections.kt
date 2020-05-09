package com.ruczajsoftware.workoutrival.model.database

enum class DbCollections(val collectionName: String) {
    USERS("Users"),
    EXERCISES("Exercises"),
    TRAINING_MODELS("TrainingModels"),
    TRAINING_HISTORY("TrainingHistory");
}

fun getDbCollections(): List<String> {
    return enumValues<DbCollections>().toList().map { dbCollections ->  dbCollections.collectionName }
}
