package exceptions.exemplo;

import javax.swing.*;

public class AppCliente {

    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null, "Digite o códiog do cliente", "", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(opcao);
        } catch (ClienteNãoEncontrado2Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
