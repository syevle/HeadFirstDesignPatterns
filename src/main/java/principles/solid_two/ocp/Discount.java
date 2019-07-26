package principles.solid_two.ocp;

import java.math.BigDecimal;

public interface Discount {

    BigDecimal apply(BigDecimal price);
}
