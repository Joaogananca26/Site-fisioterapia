package Fisioterarpia.Site.impl

import Fisioterarpia.Site.domain.entity.User
import Fisioterarpia.Site.domain.role.Role
import Fisioterarpia.Site.dto.request.RegisterUserRequest
import Fisioterarpia.Site.dto.response.RegisterUserResponse
import Fisioterarpia.Site.dto.wrapper.DataWrapper
import Fisioterarpia.Site.port.UserPort
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.UUID

@Service
class UserService(
    private val userPort: UserPort
) {

    fun registerUser(request: RegisterUserRequest): DataWrapper<RegisterUserResponse> {
        val entity = User(
            nomeUsuario = request.nomeUsuario,
            emailUsuario = request.emailUsuario,
            telefoneUsuario = request.telefoneUsuario,
            senhaUsuario = request.senhaUsuario,
            dataNascimento = request.dataNascimento,
            roleUsuario = Role.USER,
            ativoUsuario = true,
            ultimoAcesso = null,
            dataCriacaoUsuario = LocalDateTime.now()
        )

        val savedEntity = userPort.saveUser(entity)

        val response = RegisterUserResponse(
            idUsuario = savedEntity.idUsuario ?: UUID.randomUUID().toString(),
            nomeUsuario = savedEntity.nomeUsuario,
            emailUsuario = savedEntity.emailUsuario,
            telefoneUsuario = savedEntity.telefoneUsuario,
            dataNascimento = savedEntity.dataNascimento,
            roleUsuario = savedEntity.roleUsuario,
            ativoUsuario = savedEntity.ativoUsuario,
            ultimoAcesso = savedEntity.ultimoAcesso,
            dataCriacaoUsuario = savedEntity.dataCriacaoUsuario
        )

        return DataWrapper(data = response)
    }

}