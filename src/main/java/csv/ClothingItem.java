package csv;

public class ClothingItem {

	private String title;
	private String aff_code;
	private float price;
	private String brand;
	private boolean product_active;
	private String category;
	private String subcategory;
	private String url;
	private String image_urls;

	public ClothingItem(String title, String aff_code, float price, String brand, boolean product_active,
			String category, String subcategory, String url, String image_urls) {
		super();
		this.title = title;
		this.aff_code = aff_code;
		this.price = price;
		this.brand = brand;
		this.product_active = product_active;
		this.category = category;
		this.subcategory = subcategory;
		this.url = url;
		this.image_urls = image_urls;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAff_code() {
		return aff_code;
	}

	public void setAff_code(String aff_code) {
		this.aff_code = aff_code;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isProduct_active() {
		return product_active;
	}

	public void setProduct_active(boolean product_active) {
		this.product_active = product_active;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImage_urls() {
		return image_urls;
	}

	public void setImage_urls(String image_urls) {
		this.image_urls = image_urls;
	}

	@Override
	public String toString() {
		return "ClothingItem [title=" + title + ", aff_code=" + aff_code + ", price=" + price + ", brand=" + brand
				+ ", product_active=" + product_active + ", category=" + category + ", subcategory=" + subcategory
				+ ", url=" + url + ", image_urls=" + image_urls + "]";
	}

}
