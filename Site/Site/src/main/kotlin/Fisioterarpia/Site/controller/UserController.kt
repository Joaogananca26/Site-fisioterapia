package Fisioterarpia.Site.controller

import Fisioterarpia.Site.dto.request.RegisterUserRequest
import Fisioterarpia.Site.dto.response.RegisterUserResponse
import Fisioterarpia.Site.dto.wrapper.DataWrapper
import Fisioterarpia.Site.impl.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService
) {

    @PostMapping("/register")
    fun registerUser(@RequestBody userRequest: RegisterUserRequest): DataWrapper<RegisterUserResponse> {
        return userService.registerUser(userRequest)
    }

}