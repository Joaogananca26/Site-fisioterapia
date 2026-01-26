package Fisioterarpia.Site.repository


import Fisioterarpia.Site.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, String> {

}