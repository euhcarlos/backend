package exceptions.exemplo;

public class ClienteNãoEncontrado2Exception extends Exception{

    private Exception ex;

    public ClienteNãoEncontrado2Exception(String msg, Throwable e){
        super(msg,e);
    }
}
