package dao;

/**
 *
 * @author duecl801
 */
public class DAOException extends RuntimeException {

    public DAOException(String reason) {
        super(reason);
    }

    public DAOException(String reason, Throwable cause) {
        super(reason, cause);
    }

}
