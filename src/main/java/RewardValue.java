public class RewardValue{
  private int cash;
  private int miles;
  private static final miles_to_cash_rate = 0.0035; 
  public RewardValue(int cash){
    this.cash = cash;
    this.miles = cash/miles_to_cash_rate; 
  }
/*public RewardValue(int miles){
this.cash = miles*miles_to_cash_rate;
  this.miles = miles;
}*/
public static int getCashValue(){
return cash;
}
public static int getMilesValue(){
return miles;
}
}
