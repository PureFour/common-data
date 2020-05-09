package com.ruczajsoftware.workoutrival.model.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class BadRequestException(message: ExceptionMessages) : Exception(message.getMsg())
