package Fisioterarpia.Site.dto.response

import Fisioterarpia.Site.domain.role.Role
import java.time.LocalDateTime

data class RegisterUserResponse(
    val idUsuario: String,
    val nomeUsuario: String,
    val emailUsuario: String,
    val telefoneUsuario: String,
    val dataNascimento: String,
    val roleUsuario: Role,
    val ativoUsuario: Boolean,
    val ultimoAcesso: LocalDateTime?,
    val dataCriacaoUsuario: LocalDateTime
)
