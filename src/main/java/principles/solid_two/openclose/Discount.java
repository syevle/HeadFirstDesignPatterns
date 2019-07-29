package principles.solid_two.openclose;

import java.math.BigDecimal;

public interface Discount {

    BigDecimal apply(BigDecimal price);
}
