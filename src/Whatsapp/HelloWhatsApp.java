package Whatsapp;


import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class HelloWhatsApp {

	public static void main(String args[])
	{
		String message="";

        System.setProperty("webdriver.chrome.driver",
                "/home/ayush/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "https://web.whatsapp.com/";
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        int x = 1;
        	int run = 0;
        		System.out.println( "Lets Have Some Fun! ;-)");
        		while(x>0)
        		{
        			try{
        				run++;
        				int y=1;
        				while(y>0)
        				{
        					WebElement group=driver.findElement(By.xpath("//*[@id=\"pane-side\"]/div/div/div/div[5]/div/div/div[2]"));
        					try
        					{
        						TimeUnit.SECONDS.sleep(1);
        						group.click();
        						y=0;
        					}
        					catch (Exception e) {
								// TODO: handle exception
        						System.out.println(e.getMessage());
							}
        					Scanner scan=new Scanner(System.in);
        					int m=Integer.parseInt(scan.nextLine());
        					if(m==1)
        					{
        						System.exit(0);
        					}
        					else
        					{
        						message=scan.nextLine();
        					}
        					
        					
        				}
        				System.out.println( "Lets Have Some Fun! ;-)");
        				List<WebElement> inputField=driver.findElements(By.className("input"));
        				TimeUnit.SECONDS.sleep(6);
        				System.out.println( "Lets Have Some Fun! ;-)");
        				WebElement[] inputF = new WebElement[inputField.size()];
        				inputF = inputField.toArray(inputF);

        				//WebElement[] inputF=(WebElement[])inputField.toArray();
        				inputF[1].sendKeys("hi");
        				inputF[1].sendKeys(Keys.RETURN);
        				for(int i=0;i<5;i++)
        				{
        					inputF[1].sendKeys(message);
            				inputF[1].sendKeys(Keys.RETURN);
            					
        				}
        			x=0;
        			}
        			catch(Exception e)
        			{
        				System.out.println(e.getMessage());
        			}
        		}
	}
	}