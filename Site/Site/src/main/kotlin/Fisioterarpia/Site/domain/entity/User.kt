package Fisioterarpia.Site.domain.entity

import Fisioterarpia.Site.domain.role.Role
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "TB_USUARIO")
class User (

    // Criar tabela no banco de dados para funcionar

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_usuario")
    var idUsuario: String? = null,

    @Column(name = "nome_usuario", nullable = false)
    var nomeUsuario: String,

    @Column(name = "email_usuario", nullable = false, unique = true)
     var emailUsuario: String,

    @Column(name = "telefone_usuario", nullable = false)
     var telefoneUsuario: String,

    @Column(name = "senha_usuario", nullable = false)
     var senhaUsuario: String,

    @Column(name = "data_nascimento_usuario", nullable = false)
     var dataNascimento: String,

    @Column(name = "role_usuario", nullable = false)
     var roleUsuario: Role = Role.USER,

    @Column(name = "ativo_usuario")
     var ativoUsuario: Boolean = true,

    @Column(name = "ultimo_acesso", nullable = false)
     var ultimoAcesso: LocalDateTime? = null,

    @Column(name = "data_criacao_usuario", nullable = false)
     var dataCriacaoUsuario: LocalDateTime = LocalDateTime.now()

)