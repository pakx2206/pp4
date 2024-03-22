import org.junit.jupiter.api.Test;
import pl.ppacocha.creditcard.CreditCard;

import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAllowsToAssignCreditLimit(){
        CreditCard card = new CreditCard("1234-56789");
        card.assingCreditLimit(BigDecimal.valueOf(1000));
        assert BigDecimal.valueOf(1000).equals(card.getBalance());
    }
}
