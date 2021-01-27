package team.tjhis.order;

public class KoreanFood extends Food {
	
	public KoreanFood() {}
	
	public KoreanFood(String foodName, int price, int calorie, String countryOfOrigin) {
		super(foodName, price, calorie, countryOfOrigin);
	}
	
	public String getFoodName() {
		return super.getFoodName();
	}

	public void setFoodName(String foodName) {
		super.setFoodName(foodName);
	}
	
	public int getPrice() {
		return super.getPrice();
	}
	
	public void setPrice(int price) {
		super.setPrice(price);
	}
	
	public int getCalorie() {
		return super.getCalorie();
	}
	
	public void setCalorie(int calorie) {
		super.setCalorie(calorie);
	}
	
	public String getCountrOfOrigin() {
		return super.getCountryOfOrigin();
	}
	
	public void setCountrOfOrigin(String countrOfOrigin) {
		super.setCountryOfOrigin(countrOfOrigin);
	}

	@Override
	public String toString() {
		return "Food [foodName=" + super.getFoodName() + ", price=" + super.getPrice() + ", calorie=" + super.getCalorie() + ", countryOfOrigin="
				+ super.getCountryOfOrigin() + "]";
	}

}
