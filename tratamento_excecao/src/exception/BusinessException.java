package exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String msg) {
        super(msg);
    }
    /*É uma boa prática criar um construtor personalizado para essa classe. O construtor personalizado permite que você crie instâncias da 
    sua exceção com uma mensagem personalizada quando ocorre um erro ou exceção no seu código. 
    Essa mensagem pode explicar o contexto ou a razão para a exceção ter sido lançada, o que pode ser muito útil durante a depuração ou 
    para informar ao usuário o que deu errado.*/
}
