package org.example.exercicioFacade2;

public class CadastroFacade {

    private ValidadorDados validador;
    private EmailService email;
    private LogService log;
    private UsuarioService usuarioService;

    public CadastroFacade(ValidadorDados validador, EmailService email, LogService log, UsuarioService usuarioService) {
        this.validador = validador;
        this.email = email;
        this.log = log;
        this.usuarioService = usuarioService;
    }

    public void cadastrarUsuario(Usuario usuario) {

         if (validador.validar(usuario)) {
            if (!usuarioService.cpfExiste(usuario.getCpf())){
                usuarioService.salvar(usuario);
                email.enviarBoasVindas(usuario.getEmail());
                log.registrar("Usuário cadastrado: " + usuario.getNome());
            }
            else {
                log.registrar("CPF Já cadastrado");
            }
         }
         else {
             log.registrar("Dados inválidos");
         }
    }
}
