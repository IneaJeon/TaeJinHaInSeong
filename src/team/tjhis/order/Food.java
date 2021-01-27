package team.tjhis.order;

public class Food {

	private String foodName;
	private int price;
	private int calorie;
	private String countryOfOrigin;
	
	public Food() {}

	public Food(String foodName, int price, int calorie, String countryOfOrigin) {
		this.foodName = foodName;
		this.price = price;
		this.calorie = calorie;
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", price=" + price + ", calorie=" + calorie + ", countryOfOrigin="
				+ countryOfOrigin + "]";
	}
	
}
