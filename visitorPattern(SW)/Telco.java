public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private Integer dataAllowance;
    private boolean unliCallText;

    @Override
    public String accept(UsagePromo promo) {
        return promo.showAllowance(this.getTelcoName(), this.promoPrice);
    }

    @Override
    public String accept(UnliCallTextOffer offer) {
        return offer.showUnliCallsTextOffer(this.getTelcoName(), this.unliCallText);
    }

    public Telco(Integer dataAllowance, double promoPrice, String telcoName, boolean unliCallText){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public String getTelcoName() {
        return this.telcoName;
    }
    
    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public double getPromoPrice() {
        return this.promoPrice;
    }
    
    public void setDataAllowance(Integer dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public Integer getDataAllowance() {
        return this.dataAllowance;
    }
    
    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    public boolean getUnliCallText() {
        return this.unliCallText;
    }
}