package team.tjhis.order;

public class FoodDTO {
	
	/*전역변수 정의*/
	private String productName;		//제품명
	private String productPrice;	//제품가격
	private String productInfo;		//제품정보
	
	/*기본생성자*/
	public FoodDTO() {
		super();
	}

	/*매개변수 있는 생성자*/
	public FoodDTO(String productName, String productPrice, String productInfo) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productInfo = productInfo;
	}

	/*getter setter 정의*/
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	@Override
	public String toString() {
		return "FoodDTO [productName=" + productName + ", productPrice=" + productPrice + ", productInfo=" + productInfo
				+ "]";
	}
	
	
}//FoodDTO
