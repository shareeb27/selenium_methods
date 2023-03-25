package Selenium_1class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Selenium_1class {
 
	
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {
			
  
	                         
			               // THIS THE SET PROPERTY SYNTAX !!									
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\driver2\\chromedriver.exe");
								//----use this location from DRIVER -->copy location---
	                
			
			                     //THIS IS SELENIUM SYNTAX !!!			
			
		            	ChromeDriver d = new ChromeDriver();
	
						
						
                    	// WANT TO OPEN AN WEB LINK (USING URL) USE THIS KEYWORD !!!					
						
		            /*    d.get("https://www.facebook.com/login/");
						
							String title = d.getTitle();
							System.out.println("OPENING");
				
							String currentUrl = d.getCurrentUrl();
							System.out.println("done");   
															
							
	                   //WANT TO MOVE ON NEXT LINK USE THIS KEYWORDS !!!
							
				 
						  d.get("https://www.instagram.com");
			
							String title1 = d.getTitle();
							System.out.println("opening instagram");
			
							String currentUrl1 = d.getCurrentUrl();
							System.out.println("opened"); 
							
							
							
							
	                     // TGO TO BACK LINK USE THIS KEYWORDS !!!
			
	            		d.navigate().back();
							System.out.println("getting back to b instagram");
			            d.navigate().back();
							System.out.println("getting back facebook done..."); */
							
                        
							
							  // TO CLOSE THE PROGRAM !!! 			
							
				                       //d.close();
				                       //d.quit();
				 
							
								//	[  FIND ELEMENT TOPICS  ]
							
				 
	//#working done			//  FACEBOOK AUTOMATION LOGIN SETUP 
				  
							
							 /* d.get("https://www.facebook.com/login/");
								
								String title11 = d.getTitle();
								System.out.println("OPENING");
					
								String currentUrl11 = d.getCurrentUrl();
								System.out.println("done"); 
							
							
							
							WebElement email = d.findElement(By.name("email"));
				 email.sendKeys("8610765217");
				       
				       System.out.println("inserting number");
				       
				       
				  WebElement password = d.findElement(By.name("pass"));
				       password.sendKeys("shayumm27");
				       
				        System.out.println("inserting password");
				       
				//  WebElement log = d.findElement(By.name("login"));
//				       log.click();
				      

				             
				             System.out.println("successfully logged in ");  */
				             
				            
				          // d.close();
							
							
							
												//X - PATH TYPES 
		            	
		            	
		            	
		            	//x-path with index --> use (//tagname[@attribute name = 'attribute value'])[index]
		            	
		            	//x-path with text --> use //tagname[text() = 'eg:Become a seller']
		            	
		            	//x-path with contains --> //tagname[contains(@attribute name,'attribute value')]
				     
									// INSTAGRAM LOGIN USINHG X-PATH 
						
							
						/*	d.navigate().to("https://www.instagram.com/login/");
							
								d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);     
							    d.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
										         
							
									 System.out.println("inserting username");
							 WebElement email1 = d.findElement(By.xpath("//input[@type='text']"));
										 email1.sendKeys("itz_me_shareeb03");
												 
								     System.out.println("inserting password");
							WebElement password1 = d.findElement(By.xpath("//input[@type=\"password\"]"));
										 password1.sendKeys("shayumm18");
									 System.out.println("logging in");			 
							WebElement login = d.findElement(By.xpath("//button[@type=\"submit\"]"));
										 login.click();   */
							 
							 
			
			
			
			                  // CREATING GOOGLE ACCOUNT USING X-PATH METHOD 
			
			
			
		      				
    /*	d.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
								
						String title111 = d.getTitle();
						System.out.println(title111 + "opening");

		     			String currentUrl111 = d.getCurrentUrl();
						System.out.println(currentUrl111+"opened"); 
							 
										
						       d.navigate().refresh();
          						System.out.println("refreshed successfully");
								
          						System.out.println("inserting first name");

								
				WebElement name = d.findElement(By.xpath("//input[@type=\"text\"]"));
						      name.sendKeys("Mohammed");
								       
								                       
	                      System.out.println("inserting second name");
						       
			   WebElement name1 = d.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
			                   name1.sendKeys("shareeb");
								                 
						   				
								  System.out.println("DONE");	*/ 
							
							
							 
							         // FINDING  WEBELEMENTS 
								  
							 
							
								  /*d.get("https://www.facebook.com/");
							     	 
							     	 
							     	 
								    WebElement login1 = d.findElement(By.xpath("//button[@type=\"submit\"]"));
								    
								    		boolean displayed = login1.isDisplayed();
								    		System.out.println("is displayed :"+ displayed);
								            
								    		
								    		boolean enabled = login1.isEnabled();
								    		System.out.println("is enabled :"+ enabled);
								    		
								    		
								    		boolean selected = login1.isSelected();
								    		System.out.println("is selected :"+ selected);
								    		
								    		
								            String tagName = login1.getTagName();
								            System.out.println("LOGIN tagName :"+ tagName);
								            
								            
								            String text = login1.getText();
								            System.out.println("TEXT :"+ text); 
				 
				 
				 
									 
							     	 // SCREENSHOT METHOD  
							     	 
							        TakesScreenshot ts = (TakesScreenshot) d ;
							     	 
							     	 File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
							     	 
							     	 File dest = new File("C:\\Selenium_1\\screenshots\\googleUrl.png");
							     	 
							     	 FileUtils.copyFile(screenshotAs,dest);
							     	 
							     	 System.out.println("captured");*/
		            	
		            	
		            	
		            	
		            	// TRIED TO FIND OUT ELEMENTS NAME AND TOOK SCREENSHOTS 
		            	
		            	
		            	
		            /*	d.navigate().to("https://www.flipkart.com/");
                       	
		                WebElement travel = d.findElement(By.xpath("//div[text () = 'Travel']"));
		                       
		                       String text1 = travel.getText();
		                            System.out.println("TEXT is  :"+ text1);
		                            
		                            
		                       String tagName1 = travel.getTagName();
		                            System.out.println("TAG NAME : "+tagName1);
		                            
		                       
		                       boolean displayed1 = travel.isDisplayed();
		                          	System.out.println("is Displayed :"+displayed1);
		                            	
		                            
		                       boolean enabled1 = travel.isEnabled();
		                          	System.out.println("IS ENABLED : "+enabled1);
		                          	
		                          	
		                       boolean selected1 = travel.isSelected();
		                          	System.out.println("IS SELECTED : "+selected1);
		                          	
		                          	
		                          	System.out.println("TRAVEL IS CHECKED");
		                          	
		               //           	
		                          	
		                WebElement top_offers = d.findElement(By.xpath("//div[text () = 'Top Offers']"));
		                			
		                		String tagName2 = top_offers.getTagName();
		                		System.out.println("TAG NAME IS :"+tagName2);
		                		
		                		String text2 = top_offers.getText();
		                		System.out.println("TEXT IS : "+text2);
		                		   		
		                		boolean displayed2 = top_offers.isDisplayed();
		                		System.out.println("IS DISPLAYED : "+displayed2);
		                		
		                		boolean enabled2 = top_offers.isEnabled();
		                		System.out.println("IS ENABLED : "+enabled2);
		                		
		                		boolean selected2 = top_offers.isSelected();
		                		System.out.println("IS SELECTED : "+selected2);
		                		
		                		
		                		  System.out.println("TOP_OFFERS IS CHECKED");
		                		  
		             //   		  
		                		
		              WebElement home = d.findElement(By.xpath("//div[text () = 'Home']"));
		              			
		                  		String tagName3 = home.getTagName();
		                  		System.out.println("TAG NAME IS :"+tagName3);
		                  		
		                  		String text3 = home.getText();
		                  		System.out.println("TEXT IS : "+text3);
		                  		   		
		                  		boolean displayed3 = home.isDisplayed();
		                  		System.out.println("IS DISPLAYED : "+displayed3);
		                  		
		                  		boolean enabled3 = home.isEnabled();
		                  		System.out.println("IS ENABLED : "+enabled3);
		                  		
		                  		boolean selected3 = home.isSelected();
		                  		System.out.println("IS SELECTED : "+selected3);
		                  		
		                  		
		                  		  System.out.println("HOME IS CHECKED");
		                  		   
		              //
		                  		  
		                  WebElement appliance = d.findElement(By.xpath("//div[text () = 'Appliances']"));
		                  
		                   
		                       String text4 = appliance.getText();
		                       System.out.println("TEXT IS :"+text4);
		                       
		                       String tagName4 = appliance.getTagName();
		                       System.out.println("TAG NAME IS :"+tagName4);
		                       
		                       boolean displayed4 = appliance.isDisplayed();
		                       System.out.println("IS SELECTED :"+displayed4);
		                       
		                       boolean enabled4 = appliance.isEnabled();
		                       System.out.println("IS ENABLED : "+enabled4);
		                       
		                       boolean selected4 = appliance.isSelected();
		                       System.out.println("IS SELECTED :"+selected4);
		                       
		                       
		                          System.out.println("APPLIANCE IS CHECKED");
		                          
		                 //         
		                          
		                             System.out.println(" FLIPKART OPENED ");
		                                       
		                          TakesScreenshot ts1 = (TakesScreenshot) d ;
		        			     	 
		        			     	 File screenshotAs1 = ts1.getScreenshotAs(OutputType.FILE);
		        			     	 
		        			     	 File dest1 = new File("C:\\Selenium_1\\screenshots\\flipkartUrl.png");
		        			     	 
		        			     	 FileUtils.copyFile(screenshotAs1,dest1);
		        			     	 
		        			     	 System.out.println("captured"); */
		            	
		            	
		            	
		            	
							     	 
				 
				 
		            	                     // CODINGS FOR ALERT METHODS  
				 
				 
		               /* d.get("https://demo.automationtesting.in/Alerts.html");
		     	       
		    	        WebElement simple = d.findElement(By.xpath("//a[text() = 'Alert with OK ']"));
		    	         simple.click();
		    	       
		    	       WebElement simple_button = d.findElement(By.xpath("//div[@id=\"OKTab\" ]           "));
		    	        simple_button.click();
		    	        
		    	              System.out.println("DONE");
		    	                 
		    	    
		    	              Thread.sleep(5000);
		    	              
		    	 	     	 d.switchTo().alert().accept();

		    	     	 
		    	     	 
		    	     	  WebElement confirm = d.findElement(By.xpath("//a[text () ='Alert with OK & Cancel ']           "));
		    		         confirm.click();
		    		       
		    		      WebElement confirm_button = d.findElement(By.xpath("//div[@id='CancelTab']           "));
		    		         confirm_button.click();
		    		           
		    		         
		    		         System.out.println("DONE");
		    		           Thread.sleep(5000);

		    		         
		    		         d.switchTo().alert().dismiss();
		    		         
		    		         
		    		         
		    		        WebElement textBox = d.findElement(By.xpath("//a[text () =\"Alert with Textbox \"]           "));
		    		         textBox.click();
		    		        
		    		         WebElement textBox_button = d.findElement(By.xpath("//div[@id=\"Textbox\"]           "));
		    		         textBox_button.click();
		    		         
		    		         
		    		         d.switchTo().alert().sendKeys("shareeb");
		    		          
		    		              System.out.println("DONE");
		    		           Thread.sleep(5000);

		    		           
		    		            d.switchTo().alert().accept();
		    		            
		    		            System.out.println("DONE"); */
		    		            
		    		            
		    		            
		    		            
		    		            
		    		            
		    		           //  FINDING FRAMES ELEMENT METHODS
				 

		        			/*	d.get("https://demo.automationtesting.in/Frames.html");

		        				
		        				
		        				
			       		WebElement singleframe = d.findElement(By.id("singleframe"));
		           
		                        d.switchTo().frame(singleframe);
		           
		                WebElement text11 = d.findElement(By.xpath("//input[@type=\"text\"]"));
		                text11.sendKeys("Hi shareeb");
		       
		          
		                    Thread.sleep(5000);
		              
		                 	System.out.println("single frame done");
		          
		                     	d.switchTo().defaultContent();
		          
		                       System.out.println("returning to previous frame");
		          	
		             	WebElement frameinframe = d.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		            	frameinframe.click();
		          	
		          	
		             	WebElement nestedframe = d.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		          		d.switchTo().frame(nestedframe);
		          		
		          		
		          		WebElement iframedemo = d.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		          		d.switchTo().frame(iframedemo);
		          		
		          		
		          		Thread.sleep(5000);
		          		
		                System.out.println("frame in frame done");
		          		
		          		WebElement text111 = d.findElement(By.xpath("//input[@type=\"text\"]"));
		          		text111.sendKeys("frame in frame done");
		          		
		          		          System.out.println("BOTH FRAMES DONE");*/
		          		
				 
				 
				 
				 
		                         		 // ACTIONS TASK USING MOUSE BASED 
				 

			                	/*d.get("https://www.flipkart.com/");
			          				 
			     	  d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			          				
			     WebElement button = d.findElement(By.xpath("//button[text()='✕']"));
     				button.click();
			          				
		    	System.out.println("done");
			          				
  				WebElement fashion = d.findElement(By.xpath("//div[text()='Fashion']"));
					        
  				System.out.println("done");
			          			    
			          			    
			          			
			          				Actions as = new Actions(d);
			          				
			          				as.clickAndHold(fashion).build().perform();
			          				 
			          				System.out.println("DONE");		
			          			    
			          				WebElement menswear = d.findElement(By.xpath("//a[text()=\"Men's Bottom Wear\"]"));
			          		        
			          				System.out.println("DONE");
			          				
			          			    as.clickAndHold(menswear).build().perform();
			          			    
			          			    WebElement mensjeans = d.findElement(By.xpath("//a[text()=\"Men's Jeans\"]"));
			          			    
			          			    System.out.println("DONE");
			          			    
			          			    as.click(mensjeans).build().perform();*/
			          			   
			          							 
			          			    //TASK USING KEYBOARD BASE EG: R O B O T METHOD
				 
			          			    
			          		/*	  d.get("https://www.facebook.com/login/");
			          			 
			          			WebElement email11 = d.findElement(By.id("email"));	
			          					
			          			  Actions a = new Actions(d);
			          			  
			          			  	a.moveToElement(email11).build().perform();
			          			  	
			          			  	Robot r = new Robot();
			          			  
			          			  r.keyPress(KeyEvent.VK_S);
			          			  r.keyRelease(KeyEvent.VK_S);
			          			  
			          			  r.keyPress(KeyEvent.VK_H);
			          			  r.keyRelease(KeyEvent.VK_H);
			          			  
			          			  r.keyPress(KeyEvent.VK_A);
			          			  r.keyRelease(KeyEvent.VK_A);
			          			  
			          			  r.keyPress(KeyEvent.VK_R);
			          			  r.keyRelease(KeyEvent.VK_R);
			          			  
			          			  r.keyPress(KeyEvent.VK_E);
			          			  r.keyRelease(KeyEvent.VK_E);
			          			  
			          			  r.keyPress(KeyEvent.VK_E);
			          			  r.keyRelease(KeyEvent.VK_E);
			          			  
			          			  r.keyPress(KeyEvent.VK_B);
			          			  r.keyRelease(KeyEvent.VK_B);
			          			  
			          			  r.keyPress(KeyEvent.VK_2);
			          			  r.keyRelease(KeyEvent.VK_2);
			          			  
			          			  r.keyPress(KeyEvent.VK_7);
			          			  r.keyRelease(KeyEvent.VK_7);
			          			  
			          			  
			          			  System.out.println("INSERTING USERNAME DONE");
			          			  
			          			  
			          			  WebElement password11 = d.findElement(By.xpath("//input[@autocomplete=\"current-password\"]"));
			          			  
			          			  Actions a1 = new Actions(d);
			          			  
			          			  a1.moveToElement(password11).build().perform();
			          			  a1.click().perform();
			          			  
			          			  
			          			  r.keyPress(KeyEvent.VK_M);
			          			  r.keyRelease(KeyEvent.VK_M);
			          			  
			          			  r.keyPress(KeyEvent.VK_O);
			          			  r.keyRelease(KeyEvent.VK_O);
			          			  
			          			  r.keyPress(KeyEvent.VK_R);
			          			  r.keyRelease(KeyEvent.VK_R);
			          			  
			          			  r.keyPress(KeyEvent.VK_N);
			          			  r.keyRelease(KeyEvent.VK_N);
			          			  
			          			  r.keyPress(KeyEvent.VK_I);
			          			  r.keyRelease(KeyEvent.VK_I);
			          			  
			          			  r.keyPress(KeyEvent.VK_N);
			          			  r.keyRelease(KeyEvent.VK_N);
			          			  
			          			  
			          			  r.keyPress(KeyEvent.VK_G);
			          			  r.keyRelease(KeyEvent.VK_G);
			          			  
			          			  r.keyPress(KeyEvent.VK_0);
			          			  r.keyRelease(KeyEvent.VK_0);
			          			  
			          			  r.keyPress(KeyEvent.VK_3);
			          			  r.keyRelease(KeyEvent.VK_3);
			          			  
			          			  System.out.println("INSERTING PASSWORD DONE");
			          					 
			          					 
			          					 d.get("https://www.instagram.com/accounts/login/");
			          					 
			          					 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			          					 
			          					 WebElement username = d.findElement(By.xpath("//input[@type=\"text\"]"));
			          					 
			          						
			          					  Actions a2 = new Actions(d);
			          					  
			          					  	a.moveToElement(username).build().perform();
			          					  	a.click().perform();
			          					  	
			          					  	Robot r1 = new Robot();
			          					  
			          					  r1.keyPress(KeyEvent.VK_I);
			          					  r1.keyRelease(KeyEvent.VK_I);
			          					  
			          					  r1.keyPress(KeyEvent.VK_T);
			          					  r1.keyRelease(KeyEvent.VK_T);
			          					  
			          					  r1.keyPress(KeyEvent.VK_Z);
			          					  r1.keyRelease(KeyEvent.VK_Z);
			          					  
			          					  r1.keyPress(KeyEvent.VK_SPACE);
			          					  r1.keyRelease(KeyEvent.VK_SPACE);
			          					    
			          					  r1.keyPress(KeyEvent.VK_M);
			          					  r1.keyRelease(KeyEvent.VK_M);
			          					  
			          					  r1.keyPress(KeyEvent.VK_E);
			          					  r1.keyRelease(KeyEvent.VK_E);
			          					  
			          					  r1.keyPress(KeyEvent.VK_SPACE);
			          					  r1.keyRelease(KeyEvent.VK_SPACE);
			          					  
			          					  r1.keyPress(KeyEvent.VK_S);
			          					  r1.keyRelease(KeyEvent.VK_S);
			          					  
			          					  r1.keyPress(KeyEvent.VK_H);
			          					  r1.keyRelease(KeyEvent.VK_H);
			          					  
			          					  r1.keyPress(KeyEvent.VK_A);
			          					  r1.keyRelease(KeyEvent.VK_A);
			          					  
			          					  r1.keyPress(KeyEvent.VK_R);
			          					  r1.keyRelease(KeyEvent.VK_R);
			          					  
			          					  r1.keyPress(KeyEvent.VK_E);
			          					  r1.keyRelease(KeyEvent.VK_E);
			          					  
			          					  r1.keyPress(KeyEvent.VK_E);
			          					  r1.keyRelease(KeyEvent.VK_E);
			          					  
			          					  
			          					  r1.keyPress(KeyEvent.VK_B);
			          					  r1.keyRelease(KeyEvent.VK_B);
			          					  
			          					  r1.keyPress(KeyEvent.VK_0);
			          					  r1.keyRelease(KeyEvent.VK_0);
			          			  
			          					  r1.keyPress(KeyEvent.VK_3);
			          					  r1.keyRelease(KeyEvent.VK_3);
			          					  
			          					   
			          					  WebElement login11 = d.findElement(By.xpath("//div[text()='Log in']"));
			          					  
			          					  a.moveToElement(login11).build().perform();
			          					  
			          					  a.click().perform();
			          					  
			          					  System.out.println("FINISHED");*/
			          					  
			          					  
			          					  // DRAG AND DROP METHOD 
			          					  
			          	/* d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
			          					 
			          					 
						d.get("https://www.globalsqa.com/demo-site/draganddrop/");
			          					 
		          					
			          	WebElement frame = d.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
			          				
			          		d.switchTo().frame(frame);
			          					
			          	WebElement drag = d.findElement(By.xpath("//h5[text()='High Tatras']"));
			          					 
			          					
			          	WebElement drop = d.findElement(By.xpath("//div[@id=\"trash\"]"));
			          					
			          		Actions a3 = new Actions(d);
			          					
			      			a3.dragAndDrop(drag, drop).build().perform();
			          					
			          					
	    					System.out.println("ALL DONE");*/
			          					
			          					  
				 
			          					  //USING WITHOUT  DRAG AND DROP METHOD 
	    					
	    					d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	    					 
	    					 
	    						d.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    						 
	    						
	    						WebElement frame1 = d.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
	    						 
	    						d.switchTo().frame(frame1);
	    						
	    						WebElement drag1 = d.findElement(By.xpath("//h5[text()='High Tatras']"));
	    						 
	    						
	    						WebElement drop1 = d.findElement(By.xpath("//div[@id=\"trash\"]"));
	    						
	    						Actions a11 = new Actions(d);
	    						
	    						//a.dragAndDrop(drag, drop).build().perform();
	    						a11.moveToElement(drag1).build().perform();
	    						System.out.println("moving to tatras");
	    						
	    						a11.clickAndHold(drag1).perform();
	    						System.out.println("dragging the element");
	    						
	    						a11.release(drop1).perform();
	    						System.out.println("droppppping the element");
	    						
	    						System.out.println("ALL DONE");
	    						
			          					  
				 
				 
				 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
				
								
			
			
	    
		
		}
	
}
