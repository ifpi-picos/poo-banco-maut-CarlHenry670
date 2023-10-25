public class NotificacaoEmail implements Notificacao{
    @Override
    public boolean enviaNotificacao(String operacao, double valor) {
        System.out.println("\nEnviando notificação por email - Operação: " + operacao + ", Valor: " + valor);
        return true;
    }
}
