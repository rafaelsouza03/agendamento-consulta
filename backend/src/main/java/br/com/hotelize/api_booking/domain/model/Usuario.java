package br.com.hotelize.api_booking.domain.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Representa um usuário no sistema.
 * 
 * A classe {@code User} é uma entidade JPA que é mapeada para uma tabela no
 * banco de dados.
 * Ela contém informações essenciais sobre o usuário, como nome de usuário,
 * senha, e-mail e papel (role).
 * 
 * O papel do usuário é usado para controle de acesso no sistema, permitindo a
 * definição de permissões baseadas no papel do usuário.
 * 
 * A classe implementa {@code Serializable}, permitindo que o objeto do usuário
 * seja armazenado em sessões ou transmitido por mensagens.
 * 
 * @see Serializable
 * @author Eric Rafael da Silva Souza <rafael.souza29184@gmail.com>
 */
@Table(name = "usuarios")
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // A RFC 5321 especifica (seção 4.5.3): máximo de 256 caracteres para um e-mail
    // completo.
    @Column(nullable = false, length = 256)
    private String email;

    @Column(nullable = false, length = 100, name = "nome_completo")
    private String nomeCompleto;

    @Column(nullable = false)
    private String senha;

}
