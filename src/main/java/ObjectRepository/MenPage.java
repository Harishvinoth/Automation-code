package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage {
	
	public MenPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//h1[.=\"Men\"]")
	private WebElement menPage;

	public WebElement getMenPage() {
		return menPage;
	}
	
	@FindBy(xpath = "//div[@class=\"category-products\"]/div/div/div/select")
	private WebElement sortBy;

	public WebElement getSortBy() {
		return sortBy;
	}
	
	@FindBy(xpath = "(//a[@title=\"Set Descending Direction\"])[1]")
	private WebElement direction;

	public WebElement getDirection() {
		return direction;
	}
	
	@FindBy(xpath = "(//strong[.=\"List\"])[1]")
	private WebElement viewAs;

	public WebElement getViewAs() {
		return viewAs;
	}
	
	@FindBy(xpath="(//select[@title=\"Results per page\"])[1]")
	private WebElement  show;

	public WebElement getShow() {
		return show;
	}
	
	@FindBy(xpath = "(//a[@title=\"Next\"])[1]")
	private WebElement pageNext;

	public WebElement getPageNext() {
		return pageNext;
	}
	
	@FindBy(xpath = "(//dd[@class=\"odd\"]/ol/li/a)[1]")
	private WebElement sortbynew;

	public WebElement getSortbynew() {
		return sortbynew;
	}
	
	@FindBy(xpath = "//span[.=\"$0.00\"]")
    private WebElement sorybyprice;

	public WebElement getSorybyprice() {
		return sorybyprice;
	}
	
	@FindBy(xpath = "(//dd[@class=\"even\"]/ol/li/a/span/img)[1]")
	private WebElement sortbycolor;

	public WebElement getSortbycolor() {
		return sortbycolor;
	}
	
	@FindBy(xpath = "(//dd[@class=\"odd\"]/ol/li/a)[3]")
	private WebElement sortbystyle;

	public WebElement getSortbystyle() {
		return sortbystyle;
	}

	@FindBy(xpath = "(//dd[@class=\"even\"]/ol/li/a)[1]")
	private WebElement sortbytype;

	public WebElement getSortbytype() {
		return sortbytype;
	}
	
	@FindBy(xpath = "(//dd[@class=\"even\"]/ol/li/a)[1]")
	private WebElement sortbysleeve;

	public WebElement getSortbysleeve() {
		return sortbysleeve;
	}
	
	@FindBy(xpath = "(//dd[@class=\"even\"]/ol/li/a)[2]")
	private WebElement sortbyfit;

	public WebElement getSortbyfit() {
		return sortbyfit;
	}

    @FindBy(xpath = "(//dd[@class=\"even\"]/ol/li/a)[3]")
    private WebElement sortbysize;

	public WebElement getSortbysize() {
		return sortbysize;
	}

	@FindBy(xpath = "(//dd[@class=\"last even\"]/ol/li/a)")
	private WebElement sortbygender;

	public WebElement getSortbygender() {
		return sortbygender;
	}
	
	@FindBy(linkText = "VIEW DETAILS")
    private WebElement viewDetailsButton;

	public WebElement getViewDetailsButton() {
		return viewDetailsButton;
	}
	
	@FindBy(xpath = "//img[@src=\"https://ecommerce.tealiumdemo.com/media/catalog/swatches/1/21x21/media/white.png\"]")
	private WebElement addToColor;

	public WebElement getAddToColor() {
		return addToColor;
	}
	
	@FindBy(xpath="//a[@id=\"swatch79\"]/span")
    private WebElement addToSize;

	public WebElement getAddToSize() {
		return addToSize;
	}
	
	@FindBy(xpath = "(//button[@type=\"button\"])[2]")
	private WebElement addToCardButton;

	public WebElement getAddToCardButton() {
		return addToCardButton;
	}
	
	
	@FindBy(xpath = "(//a[@href=\"#\"])[7]")
	private WebElement addToWish;

	public WebElement getAddToWish() {
		return addToWish;
	}
	
	@FindBy(xpath = "(//a[@class=\"link-compare\"])[1]")
	private WebElement addToCampare;

	public WebElement getAddToCampare() {
		return addToCampare;
	}

	@FindBy(linkText = "1 Review(s)")
	private WebElement seeReview;

	public WebElement getSeeReview() {
		return seeReview;
	}
	
	@FindBy(linkText = "Add Your Review")
	private WebElement addYourReview;

	public WebElement getAddYourReview() {
		return addYourReview;
	}
	
	@FindBy(xpath = "//label[@for=\"Quality_5\"]/input[@type=\"radio\" and @value=\"5\"]")
	private WebElement qualityStar;

	public WebElement getQualityStar() {
		return qualityStar;
	}

	@FindBy(xpath ="//label[@for=\"Value_5\"]/input[@type=\"radio\" and @value=\"10\"]")
	private WebElement valueStar;

	public WebElement getValueStar() {
		return valueStar;
	}
	
	@FindBy(xpath = "//label[@for=\"Price_5\"]/input[@type=\"radio\" and @value=\"15\"]")
	private WebElement priceStar;

	public WebElement getPriceStar() {
		return priceStar;
	}
	
	@FindBy(xpath = "//textarea[@id=\"review_field\"]")
	private WebElement textArea;

	public WebElement getTextArea() {
		return textArea;
	}
	
	@FindBy(xpath = "//input[@id=\"summary_field\"]")
	private WebElement summary;

	public WebElement getSummary() {
		return summary;
	}
	
	@FindBy(xpath = "//input[@id=\"nickname_field\"]")
	private WebElement nickname;

	public WebElement getNickname() {
		return nickname;
	}
	
	@FindBy(xpath = "//button[@title=\"Submit Review\"]")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath = "//img[@id=\"product-collection-image-406\"]")
	private WebElement productimage;

	public WebElement getProductimage() {
		return productimage;
	}
	
	@FindBy(xpath = "(//a[@title=\"Remove Item\"])[2]")
	private WebElement removeAddToCard;

	public WebElement getRemoveAddToCard() {
		return removeAddToCard;
	}
	
	
}
