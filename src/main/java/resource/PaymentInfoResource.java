package resource;

import java.math.BigDecimal;

public class PaymentInfoResource extends BaseResource{
    private BigDecimal amount;
    private String modeOfPayment;

    public PaymentInfoResource() {
    }

    public PaymentInfoResource(BigDecimal amount, String modeOfPayment) {
        this.amount = amount;
        this.modeOfPayment = modeOfPayment;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }
}
