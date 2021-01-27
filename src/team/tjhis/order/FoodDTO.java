package team.tjhis.order;

public class FoodDTO {
	
	/*�������� ����*/
	private String productName;		//��ǰ��
	private String productPrice;	//��ǰ����
	private String productInfo;		//��ǰ����
	
	/*�⺻������*/
	public FoodDTO() {
		super();
	}

	/*�Ű����� �ִ� ������*/
	public FoodDTO(String productName, String productPrice, String productInfo) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productInfo = productInfo;
	}

	/*getter setter ����*/
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
