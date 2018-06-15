package md2all;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/*
 server.port=443
server.ssl.key-store=classpath:214256483460199.pfx
server.ssl.key-store-password=214256483460199
server.ssl.keyStoreType=PKCS12
logging.level.org.hibernate.SQL=debug
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/iot
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.generate-ddl=true 
spring.jpa.hibernate.ddl-auto=update
 */

@SpringBootApplication
public class ServerMain {


	public static void main(String[] args)  throws Exception{
		    
		SpringApplication.run(ServerMain.class, args);
	}
	

	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

        };
    }
	 
}

/*@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses=Timer.TimerDataRepository.class)
//@EnableJpaRepositories(basePackageClasses={Timer.TimerDataRepository.class,Timer.TimerData.class})
public class ServerMain extends WebMvcConfigurerAdapter implements CommandLineRunner{
//public class ServerMain implements CommandLineRunner{
	@Autowired			
	AccountRepository accountRepository;			
	

	
	static final boolean SSL = System.getProperty("ssl") != null;
	static final int PORT = Integer.parseInt(System.getProperty("port", "1010"));
	

	public static void main(String[] args) throws Exception {
				
		SpringApplication.run(ServerMain.class, args);
	}
	
	

	
	@Override
	public void run(String... arg0) throws Exception {
	
	
		String  RESOURCE_PUBLIC_PATH="public";
		 File dir;
		 Path photoPath=Paths.get(RESOURCE_PUBLIC_PATH+"/test");
		 dir= new File(photoPath.toUri());
		 if(!dir.exists())  
		 {
				Files.createDirectories(photoPath);
		}
			      

	}
	 
}*/
