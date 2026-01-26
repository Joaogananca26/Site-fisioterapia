package Fisioterarpia.Site.dto.request

import jakarta.validation.constraints.NotBlank

data class RegisterUserRequest(
    @field:NotBlank(message = "Nome é obrigatório")
    val nomeUsuario: String,
    @field:NotBlank(message = "Email é obrigatório")
    val emailUsuario: String,
    @field:NotBlank(message = "Telefone é obrigatório")
    val telefoneUsuario: String,
    @field:NotBlank(message = "Senha é obrigatória")
    val senhaUsuario: String,
    @field:NotBlank(message = "Data de nascimento é obrigatória")
    val dataNascimento: String
)