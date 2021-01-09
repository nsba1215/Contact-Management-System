package contactmanagementsoftware;

import java.io.Serializable;

public class CanAnnoy implements Annoy, Serializable {

    @Override
    public String annoy() {
        return "Relatives are annoying.";
    }
}
