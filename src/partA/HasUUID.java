package partA;

import java.util.UUID;

public interface HasUUID {

    public static UUID getUUID(){
        return UUID.randomUUID();
    }
}
