package federicocogoni.u5_w2_d2.Exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id){
        super("id: " + id + " not found.");
    }
}
