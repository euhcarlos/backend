package exceptions.exemplo;

public class ClienteService {
    public static void consultarCliente(String codigo) throws ClienteNãoEncontrado2Exception {
        try {
            ClienteDAO.consultarCliente(codigo);
        } catch (ClienteNaoEncontradoException e) {
            throw new ClienteNãoEncontrado2Exception(e.getMessage(), e);
        }
    }
}
