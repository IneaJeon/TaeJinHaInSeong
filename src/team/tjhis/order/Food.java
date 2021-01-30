package team.tjhis.order;

public class Food {

	private String foodName;
	private int price;
	private int calorie;
	private int foodNo;
	private int count;
	private String countryOfOrigin;
	
	public Food() {}

	public Food(int foodNo, String foodName, int price, int calorie, String countryOfOrigin) {
		super();
		this.foodName = foodName;
		this.price = price;
		this.calorie = calorie;
		this.foodNo = foodNo;
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

	public int getFoodNo() {
		return foodNo;
	}

	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public String toString() {
		return foodNo + ". : " + foodName + "\n가격 : " + price + "원\n칼로리 : " + calorie + "kcal\n원산지 : " + countryOfOrigin;
	}
	
}
