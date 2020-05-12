
public class Player{
	private String name = " ";
	private int abilityRatingMax = 0;
	private int abilityRatingCurrent = 0;
	private int fatigue = 0;
	private int initialFatigue = 0;
	private int injury = 0;
	private int daysSinceLastMatch = 0;
	private int rateConstant = 7;
	private int posNum = 0;
	
	public Player(String name, int abilityRatingMax, int posNum) {
		this.setName(name);
		this.abilityRatingMax = abilityRatingMax;
		this.setPosNum(posNum);
	}
	public void postMatchCondition(int fatigue, int injury) {
		this.fatigue = fatigue;
		initialFatigue = fatigue;
		this.injury = injury;
		daysSinceLastMatch = 0;
		updateRating();
	}
	public void updateRating() {
		abilityRatingCurrent = rateConstant/((initialFatigue-((5/injury)*daysSinceLastMatch))-(rateConstant/(-abilityRatingMax)));
		fatigue = (initialFatigue-((5/injury)*daysSinceLastMatch));
	}
	public void restDay() {
		daysSinceLastMatch++;
		updateRating();
	}
	public String toString() {
		String s1 = name + "    " + abilityRatingMax + "    " + posNum;
		return s1;
	}
	
	public int getRateConstant() {
		return rateConstant;
	}
	public void setRateConstant(int rateConstant) {
		this.rateConstant = rateConstant;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
		
}
