package Fisioterarpia.Site.domain.entity

import Fisioterarpia.Site.domain.role.Role
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.Date

@Entity
@Table(name = "TB_USUARIO")
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private var id: Long? = null

    @Column(name = "nome_usuario", nullable = false)
    private var nomeUsuario: String = ""

    @Column(name = "email_usuario", nullable = false, unique = true)
    private var emailUsuario: String = ""

    @Column(name = "telefone_usuario", nullable = false)
    private var telefoneUsuario: String = ""

    @Column(name = "senha_usuario", nullable = false)
    private var senhaUsuario: String = ""

    @Column(name = "data_nascimento_usuario", nullable = false)
    private var dataNascimento: Date? = null

    @Column(name = "role_usuario", nullable = false)
    private var roleUsuario: Role = Role.USER

    @Column(name = "ativo_usuario", nullable = false)
    private var ativoUsuario: Boolean = true

    @Column(name = "ultimo_acesso", nullable = true)
    private var ultimoAcesso: LocalDateTime? = null


}