package Fisioterarpia.Site.adapter

import Fisioterarpia.Site.domain.entity.User
import Fisioterarpia.Site.port.UserPort
import Fisioterarpia.Site.repository.UserRepository
import org.springframework.stereotype.Component

@Component
class UserJpaAdapter(
    private val userRepository: UserRepository
): UserPort {

    override fun saveUser(user: User): User =
        userRepository.save(user)

}