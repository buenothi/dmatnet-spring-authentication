package br.com.dmatnet.authentication.model.builders;

import br.com.dmatnet.authentication.model.entities.pessoa.EmailEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.EnderecoEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.EnderecoTipoEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.cidade.CidadeEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.cidade.EstadoEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.PessoaFisicaDocumentosEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.UUID;

@Component
public class UsuarioBuilder {
    
    public UsuarioEntity gerarUsuarioEntityTeste() {

        EstadoEntity estado = new EstadoEntity(
                26,
                "SP",
                "São Paulo",
                null
        );

        CidadeEntity cidade = new CidadeEntity(
                5270,
                "São Paulo",
                estado
        );

        EnderecoEntity endereco = new EnderecoEntity(
                1L,
                new EnderecoTipoEntity(1, "R", "Rua"),
                "Das Almas",
                100,
                null,
                "Centro",
                "01234-567",
                null,
                LocalDate.parse("2022-01-01"),
                null,
                cidade,
                "Rua",
                "Rua"
        );

        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setIdUsuarioPai(UUID.randomUUID());
        usuario.setSenha("123");
        usuario.setAtivo(true);
        usuario.setPerfis(null);
        usuario.setLogin("Teste");
        usuario.setDataCadastroPessoa(LocalDateTime.now());
        usuario.setIdPessoa(UUID.randomUUID());
        usuario.setDataNascimento(LocalDate.parse("2000-01-01"));
        usuario.setDocumentosPessoais(new PessoaFisicaDocumentosEntity
                (
                123L,
                "RFB",
                LocalDate.parse("2020-01-01"),
                "1234567-SP",
                "SSP-SP",
                LocalDate.parse("2020-01-01"),
                "123456789",
                "n/a",
                "n/a",
                null,
                null,
                null,
                null,
                null,
                null,
                null
        ));
        usuario.setRaca(1);
        usuario.setNome("João da Silva de Teste");
        usuario.setEnderecos(new HashSet<>());
        usuario.getEnderecos().add(endereco);
        usuario.setEstadoCivil(1);
        usuario.setEmails(new HashSet<>());
        usuario.getEmails().add(new EmailEntity(
                "teste@teste.com.br",
                true
        ));

        return usuario;
    }
    
    
}
