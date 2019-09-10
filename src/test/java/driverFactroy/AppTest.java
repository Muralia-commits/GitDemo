package driverFactroy;

import org.testng.annotations.Test;

public class AppTest 
{
	
		@Test
		public void kickStart() throws Throwable {
			DriverScript ds= new DriverScript();
			DataDrivenFramework obj=new DataDrivenFramework();
			try {
				
				ds.primusbank();
				/*obj.launch();
				 obj.verifyLogin();
				 obj.logout();
				 */
				}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	
	}


