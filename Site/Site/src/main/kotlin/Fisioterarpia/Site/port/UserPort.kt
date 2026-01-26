package Fisioterarpia.Site.port

import Fisioterarpia.Site.domain.entity.User

interface UserPort {

    fun saveUser(user: User): User

}