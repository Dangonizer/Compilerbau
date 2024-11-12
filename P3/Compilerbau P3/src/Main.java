import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class SymbolAlreadyDefinedException extends Exception {
    public SymbolAlreadyDefinedException(String error){
        super(error);
    }
}

class UnknownSymbolException extends Exception {
    public UnknownSymbolException(String error){
        super(error);
    }
}

class SymTable {
    HashMap<String,String> tb = new HashMap<>();

    void addConstant(String id, String wert) throws SymbolAlreadyDefinedException{
        if (tb.containsKey(id))
            throw new SymbolAlreadyDefinedException("Symbol " + id + " already defined.");
        tb.put(id,wert);
    }

    String getSymbol(String id) throws UnknownSymbolException{
        if(!tb.containsKey(id))
            throw new UnknownSymbolException("Symbol " + id + " not defined.");
        return tb.get(id);
    }
}