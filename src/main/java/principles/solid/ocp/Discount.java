package principles.solid.ocp;

import java.math.BigDecimal;

public interface Discount {

    BigDecimal apply(BigDecimal price);
}
