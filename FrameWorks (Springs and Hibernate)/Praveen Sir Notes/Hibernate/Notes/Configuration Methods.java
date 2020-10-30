1.	public Configuration configure() 
	throws HibernateException 

	"hibernate.cfg.xml" 
	& directly under"src" (i.e. Project Class Path)
	
	and/or
	
	Configuration config = new Configuration();
	config.configure();

		
2.	public Configuration configure(String resource) 
	throws HibernateException 

	
	Configuration config = new Configuration();
	config.configure("any_name.xml");

	OR
	
	config.configure("com/pkg/any_name.xml");
	
	
	
3.	public Configuration configure(File configFile) 
	throws HibernateException

	
	
	
	String fileLoc = "C:\\frameworks\\any_name.xml";
	java.io.File configFileLocation 
						= new java.io.File(fileLoc);
	
	Configuration config = new Configuration();
	config.configure(configFileLocation);

	
4.	public Configuration configure(URL url) 
	throws HibernateException

	
	String configFileUrl 
	= "http://localhost:8080/myApp/any_name.cfg.xml";
	
	java.net.URL url = new java.net.URL(configFileUrl);
	
	Configuration config = new Configuration();
	config.configure(url);

	
	
	
	
5. public Configuration configure(org.w3c.dom.Document document) 
   throws HibernateException 

   
   
   
   
   
   
   
   
   
   
   
