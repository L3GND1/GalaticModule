public class main
{
	
	//changing a number text string to one with commas
		public static String addCommasToNumericString(String digits) {
			//set empty string result to "" (a string that is essentially empty
		    String result = "";
		    //begin for loop (does something until stopped) do until i is less than or equal to digits length
		    for (int i=1; i <= digits.length(); ++i) {
		    	
		    	//set char ch to a character at location:  digits length -1
		        char ch = digits.charAt(digits.length() - i);
		        //if i / 3 is equal to 1 AND i is greater than 1
		        if (i % 3 == 1 && i > 1) {
		        	//add a comma to result at position
		            result = "," + result;
		        }
		        //add the current digit at charat to string
		        result = ch + result;
		    }

		    //return full string
		    return result;
		}

	//changing a number text string to one with commas
    public static void main(String[] args) {
    	
    	
    	//good ole hello world
        System.out.println("Hello World");
        
        //settle variables for measurements ly = light year
        //m - meters, km = kilomters, etc, could use better consistency
        long lym = 0;
        long lykm = 0;
        long lyAU = 0;
        long lymi = 0;
        long lyParsec = 0;
        long lyms = 299792458;
        long lykms = 300000;
        long lymis = 186000;
        //double lyAUs = 0.00200399;
        //double lyParsecs = .307;
        
        //seconds calculatory variables
        int numsecmin = 60;
        int numminhour = 60;
        int numhoursday = 24;
        int numsecsday = 0;
        int numsecsyear = 0;
        int daysyear = 365;
        
        //setting string variables to be maybe used later 
        //String lymstring = "9,460,730,472,580,800 meters";
        //String lykmsstring = "9.461 trillion km";
        String lyAUstring = "63241.077 AU";
        String lyParsecstring = ".306601 Parsec";
        
        //seconds of the day and year calculation
        numsecsday = numhoursday * numminhour * numsecmin;
        numsecsyear = numsecsday * daysyear;
        
        //setting light year in unit of measure variables
        lym = numsecsyear * lyms;
        lykm = numsecsyear * lykms;
        lymi = numsecsyear * lymis;
        
        //a line with \r\n is a space break
        //a line with \r\n is a space break
        //a line with \r\n is a space break
        System.out.println("\r\n");
        
        //displaying unit of measure distances against 1 ly
        System.out.println("1 Light years in meters " + lym);
        System.out.println("1 Light years in kilometers: " + lykm);
        System.out.println("1 Light years in miles : " + lymi);
        System.out.println("1 Light years in AU: " + lyAUstring);
        System.out.println("1 Light years in Parsec: " + lyParsecstring);
        System.out.println("\r\n");
        
        //displaying number of seconds in a day and year
        System.out.println("There are " + numsecsday + " seconds in a day");
        System.out.println("There are " + numsecsyear + " seconds in a year");
        System.out.println("\r\n");       
        
        //creating and adding coordinate variables
        String centeruniverselong = "17h 45m 40.0409s";
        String centeruniverselat = " −29° 00′ 28.118″ (J2000)";
        String galaxylong = "359 56' 39.4";
        String galaxylat = "-0 2' 46.2";
        String earthlong = "179 57 39.4";
        String earthlat = "+0 2' 46.2";
        String earthdistance = "7,940 ± 420 parsecs";
        String earthdistanceLY = "25,900 ± 1,400 light years";
        
        //displaying coordinates center of universe, galaxy and earth
        System.out.println("The center of universe near Sagittarius A* long: " + centeruniverselong );
        System.out.println("The center of universeynear Sagittarius A* lat: " + centeruniverselat );
        System.out.println("\r\n");
        System.out.println("The galaxy coordinates long: " + galaxylong );
        System.out.println("The galaxy coordinates lat: " + galaxylat );
        System.out.println("\r\n");
        System.out.println("The earths (milky way) coordinates long: " + earthlong );
        System.out.println("The earths (milky way) coordinates lat: " + earthlat );
        System.out.println("\r\n");
        System.out.println("The earths distance: " + earthdistance );
        System.out.println("The earths distance LY: " + earthdistanceLY );
        System.out.println("\r\n");
        
        //setting hard coded variables for the first two galaxies
        int acLY = (int) 4.25;
        int cmdLY = 25000;
        
        //manually put in variables for first two galaxies
        System.out.println("It would take us " + (acLY * lykm) + " KM to get to nearest solar system");
        System.out.println("It would take us " + (cmdLY * lykm) + " KM to get to nearest galaxy system");
        System.out.println("\r\n");        
        System.out.println("It would take us " + (acLY * lymi) + " MI to get to nearest solar system");
        System.out.println("It would take us " + (cmdLY * lymi) + " MI to get to nearest galaxy system");
                
        //creating a string array to categorize the dictionary of all closest galaxies and their distance 
        String[] galaxyarrdata = 
        		{"SagDEG", "sagdeg", "81000",
        	    "Large Magellanic Cloud", "lmc", "160000",
        		"Small Magallanic Cloud", "smc", "190000",
        		"Ursa Minor Dwarf", "umd", "205500",
		    	"Draco Dwarf", "draco", "248000",
            	"Sculptor Dwarf", "sculptor", "254000",
		    	"Sextans Dwarf", "sextans", "257000",
            	"Carina Dwrf", "carina", "283500",
		    	"Fornax Dwarf", "fornax","427000",
            	"Leo II", "leo2","701000",
		    	"Leo I", "leo1", "890000",
            	"Phoenix Dwarf", "phoenix", "127100",
		    	"Barnards Galaxy (NGC6822)", "ngc8822", "1760000",
            	"NGC185", "ngc185","2021000",
		    	"NGC147", "ngc147","2162000",
            	"Andromeda M31", "adromedam31","2363000",
		    	"M32 (NGS221)", "ngs221","2353500",
            	"M110 (NGC 205)", "ngs205","2363500",
		    	"Andromeda I", "andromeda1","2363500",
            	"Andromeda II", "andromedia2", "2353500",
            	"Andromeda III", "andromedia3", "2477500",
            	"LGS 3", "lgs3", "2477500",
            	"IC1613", "ic1613", "2494000",
            	"Triangulum M33", "triganulumm33", "2592000",
            	"Aquarius Dwarf", "aquariusdwarf", "2608000",
            	"Tucana Dwarf Galaxy", "tucanadwarf", "2836000",
            	"Wolf-Lundmark-Melotte", "wolfludmarkmelotte", "3064500",
        		};
       
        //printing out the first two galaxies 
        System.out.println("\r\n");  
        System.out.println("The closest solar system to Earth is Alpha Centauri "  + acLY + " light years away");
        System.out.println("\r\n");  
        System.out.println("The closest galaxy to Earth is Canis Major dwarf " + cmdLY + "k light years away"); 
        System.out.println("\r\n");
        
        //setting the for loop variable
        int r = 0;
        
        //set r to 0, while r is less than the total length of array, add 3 to r every loop
        for(r=0; r<galaxyarrdata.length; r=r+3)
        {
        	//setting current array string variable position
        	String number = galaxyarrdata[r+2];
        	//update number variable and call function to set number with commas
            number = addCommasToNumericString(number);
        	
        	//print out nearest galaxies at position
        	System.out.print("The galaxy " +  galaxyarrdata[r] +  " is " + number   + " light years away");
            System.out.println("\r\n");    
           
            //setting variables to potentially be used later by position in variable (calculations)
            //String tempvar = galaxyarrdata[r+2];
            //String varname = galaxyarrdata[r+1];
            /*
            System.out.println(tempvar);
            System.out.println(varname); 
            */  
        };    

    }
}
