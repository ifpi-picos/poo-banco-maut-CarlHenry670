public class NotificacaoSMS implements Notificacao {

    @Override
    public boolean enviaNotificacao(String tipo, double valor) {
        System.out.println("Enviando notificação por SMS !! \nTipo: " + tipo + " \nValor: R$" + valor);
        return true;
    }

}
