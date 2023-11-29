package xapthdemo2.com;

public class XpathDemo2 {

	public static void main(String[] args) {
		//1.syntax
		//-->//tagName[@attribute='Value']
	
		
		//2.By using text
		
				//syntax
				//-->//tagname[text()='value']
				
			//-->	//p[text()='Forgot your password? ']
		
		
		//p[text()='Forgot your password? ']
		
		
		
		
		
				
		//3.way
				//-->//tagname[@attribute='vaue' and @attribute='vaue']
				//-->//tagname[@attribute='vaue' and text()='value']
				//-->//tagname[@attribute='vaue' or text()='value']
				
				//example
				//->//input[@id='username' and @type='email']
		
				//input[@id='username' and @type='email']
		
		
		
		
		
		
		
		
		//	4.	
		//contains
				//syntax-->//tagNmae[contains(@attribute,'value')]
				
				//tagName[contains(text(),'value')]
				//tagName[contains(@id,'value')]
				//tagName[contains(@name,'value')]
				//tagName[contains(@class,'value')]
				
		//p[contains(@class,'oxd-text oxd-text--p orangehrm-login-forgot-header')]
			
		//-->example--> //td[contains(text(),'Please identify yourself')]
				
		
		
		
		
		
		
		

		//index postion
				//-->(//tagName[@attribute='value'])[index]
				//-->exampme-->(//a[@class='nav-a  '])[6]
				
				
		
		
		//-->(//div[@class='_1FNrEw'])[4]
				
				
				
		
		
		
		
		
		
		
		
		
		
		//starts-with
				
				
				//--> //tagName[starts-with(@attribute,'value')]
				
				//--> //tagName[ends-with(@attribute,'value')]
				
				
				
				//index
				
				
				//-->(//tagName)[index]
				
				
				//--using last()
				
				//-->(//tagName[@attribute='value'])[last()]
				//-->(//tagName[@attribute='value'])[last()-1]
				//-->(//tagName[@attribute='value'])[last()-2]
				//--->example-->(//td[@class='navFooterDescItem'])[last()-4]
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				//-->Select the parent node
				
				
				//-->//tagName[@attribute='value']/parent::parenttagName
				
				
				
				//-->Select the child node
				
				
				//-->//tagName[@attribute='value']/child::childtagName
						
				
				//-->example--//div[@class='navFooterVerticalRow navAccessibility']/child::div
				

		
		

	}

}
