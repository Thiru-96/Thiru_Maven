package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

public class Base_class {

	public static WebDriver driver;

	public static WebDriver getbrowser(String brow) { // browser launch

		if (brow.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\Chrome Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (brow.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Drivers\\Chrome Driver\\chromedriver.exe");

			driver = new FirefoxDriver();
		}

		return driver;
	}

	public static void geturl(String url) { // get

		driver.get(url);

	}

	public static void max() {
		driver.manage().window().maximize();
	}

	public static void inputvalueemail(WebElement element, String value) { // Send keys

		element.sendKeys(value);

	}

	public static void inputvaluepass(WebElement element, String value) { // Send keys

		element.sendKeys(value);

	}

	public static void clickonElement(WebElement element) { // Click

		element.click();

	}

	public static void gettxt(WebElement element) { // gettxt

		String text = element.getText();
		System.out.println(text);

	}

	public static void getAttribute(WebElement element, String Attname) { // getAttribute

		String Att = element.getAttribute(Attname);

		System.out.println(Att);

	}

	public static void close() { // Close

		driver.close();

	}

	public static void quit() { // Quit

		driver.quit();

	}

	public static void waitbrowser(Integer time_in_millisecs) throws InterruptedException { // Thread(Wait browser)

		Thread.sleep(time_in_millisecs);

	}

	public static void gettitle() { // getTitle

		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void getcurrenturl() { // getCurrenturl

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void getwindowhandles() { // windowshandles

		Set<String> Switch = driver.getWindowHandles();
		for (String string : Switch) {
			System.out.println(driver.switchTo().window(string).getTitle());
		}

	}

	public static void getwindowhandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(driver.switchTo().window(windowHandle).getTitle());

	}

	public static void navigateTo(String url) { // navigate to

		driver.navigate().to(url);
	}

	public static void navigateback() { // navigate back

		driver.navigate().back();
	}

	public static void navigateForward() { // navigate forward

		driver.navigate().forward();
	}

	public static void navigateRefresh() { // navigate refresh

		driver.navigate().refresh();
	}

	public static void alert() { // alert

		driver.switchTo().alert();

	}

	public static void alertAccept() { // alertAccept

		driver.switchTo().alert().accept();

	}

	public static void alertDismiss() { // alertDismiss

		driver.switchTo().alert().dismiss();

	}

	public static void alertSendkeys(String value) { // alertSendkeys

		driver.switchTo().alert().sendKeys(value);

	}

	public static void alertGettxt() { // alertGettxt

		driver.switchTo().alert().getText();

	}

	public static void frameById(String id) { // framebyid

		driver.switchTo().frame(id);
	}

	public static void frameByIndex(Integer Index) { // framebyindex

		driver.switchTo().frame(Index);
	}

	public static void frameByElement(String webelement) { // frameByElement

		driver.switchTo().frame(webelement);
	}

	public static void isDisplayed(WebElement element) { // isDisplayed

		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	public static void isEnable(WebElement element) { // isEnable

		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	public static void isSelected(WebElement element) { // isSelected

		boolean selected = element.isSelected();
		System.out.println(selected);

	}

	public static void clear(WebElement element) { // clear

		element.clear();

	}

	public static void Radiobutton(WebElement element) { // Radiobutton

		element.click();

	}

	public static void select(String type, WebElement element, String value) { // select

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byvalue")) {

			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("byindex")) {

			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);

		}

		else if (type.equalsIgnoreCase("byvisibletext")) {

			s.selectByVisibleText(value);

		}

		else if (type.equalsIgnoreCase("getoptions")) {

			List<WebElement> options = s.getOptions();
			System.out.println(options);

		}

		else if (type.equalsIgnoreCase("ismultiple")) {

			boolean multiple = s.isMultiple();
			System.out.println(multiple);

		}

		else if (type.equalsIgnoreCase("getfirstselectedoptiond")) {

			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption);

		}

		else if (type.equalsIgnoreCase("getallselectedoptions")) {

			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			System.out.println(allSelectedOptions);

		}
	}

	public static void Actions(String type, WebElement element, WebElement element1) { // Actions

		Actions ac = new Actions(driver);

		if (type.equalsIgnoreCase("draganddrop")) {

			ac.dragAndDrop(element, element1).build().perform();

		}

		else if (type.equalsIgnoreCase("clickandhold")) {

			ac.clickAndHold(element).build().perform();

		}

		else if (type.equalsIgnoreCase("movetoelement")) {

			ac.moveToElement(element1).build().perform();

		}

		else if (type.equalsIgnoreCase("release")) {

			ac.release().build().perform();

		}

		else if (type.equalsIgnoreCase("click")) {

			ac.click().build().perform();

		}

		else if (type.equalsIgnoreCase("Contextclick")) {

			ac.contextClick(element).build().perform();

		}

		else if (type.equalsIgnoreCase("doubleclick")) {

			ac.doubleClick(element).build().perform();

		}

	}

	public static void Robot1(String type, String value) throws AWTException { // Robot

		Robot r = new Robot();

		if (type.equalsIgnoreCase("pressdown")) {

			r.keyPress(KeyEvent.VK_DOWN);

		}

		else if (type.equalsIgnoreCase("releasedown")) {

			r.keyRelease(KeyEvent.VK_DOWN);

		}

		else if (type.equalsIgnoreCase("pressenter")) {

			r.keyPress(KeyEvent.VK_ENTER);

		}

		else if (type.equalsIgnoreCase("releaseenter")) {

			r.keyRelease(KeyEvent.VK_ENTER);

		}
	}

	public static void takeScreenShot() throws IOException { // Takesscreenshot

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\THIRUMURUGAN R\\eclipse-workspace\\Thiru_Maven\\Screenshot\\sc.png");
		FileUtils.copyFile(src, des);

	}

	public static JavascriptExecutor jscriptClick(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].click();", element);

		return j;

	}

	public static void implicitywait(long valueinSeconds) {

		driver.manage().timeouts().implicitlyWait(valueinSeconds, TimeUnit.SECONDS);
	}

	public static String stringCellValue;

//	public static String data_Driven(String path, int sheetindex, int rowindex, int cellindex) throws Throwable {
//
//		File f = new File(path);
//
//		FileInputStream fi = new FileInputStream(f);
//
//		Workbook wb = new XSSFWorkbook(fi);
//
//		Sheet s = wb.getSheetAt(sheetindex);
//
//		Row r = s.getRow(rowindex);
//
//		Cell cell = r.getCell(cellindex);
//
//		CellType cellType = cell.getCellType();
//
//		if (cellType.equals(CellType.STRING)) {
//
//			stringCellValue = cell.getStringCellValue();
//
//		}
//
//		else if (cellType.equals(CellType.NUMERIC)) {
//
//			double numericCellValue = cell.getNumericCellValue();
//
//			long ncv = (long) numericCellValue;
//
//			stringCellValue = String.format("%d", ncv);
//
//			// String a = String.valueOf(ncv);
//
//		}
//		return stringCellValue;
//
//	}

}
