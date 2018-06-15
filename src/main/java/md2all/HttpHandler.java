package md2all;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import md2all.user.account.Account;
import md2all.user.account.AccountRepository;
import md2all.user.account.BaseAccount;

@Controller
//public class HttpHandler implements Filter{
public class HttpHandler  implements Filter {
    final String SESSION_NAME="user_name";
	final String SUCCESS="success"; 
    final String FAIL="fail";
    final String  RESOURCE_PUBLIC_PATH="public";
	private int count;
//	@Autowired
//	TimerDataRepository timerDataRepository;
	@Autowired			
	AccountRepository accountRepository;
	
	public HttpHandler() {
		// TODO Auto-generated constructor stub
	}
	 /*@RequestMapping("/")
	public String indxe() {
		return "index.html";
	 //return "redirect:/index_.html";
	// return "redirect:/index.html";
	}*/
	
	/* @RequestMapping("/index")
		public String indxe() {
			return "index.html";
		 //return "redirect:/index_.html";
		// return "redirect:/index.html";
		}*/
/*	 
	@RequestMapping("/")
	@ResponseBody
	public String homepage() {
		return "new cert,Hello, world. Welcome";
	}*/

	@RequestMapping("/")
	public String homepage(ServletRequest request) {
		HttpServletRequest req = (HttpServletRequest) request;
		String serverName=req.getServerName();
		//System.out.println("req.getServerName() is:"+serverName);
		if(true)//(serverName.equals("md.aclickall.com"))
		{
			//return "redirect:https://www.aclickall.com/md/index.html";
			return "md/index_v2_7_0.html";
			//return "senddata.html";
		}
		else
		{
			return "index.html";
		}
	}
	
	/*@RequestMapping("/register")
	@ResponseBody
	public String signUp(@RequestBody String requestBody)
	{			
		
		Gson gson=new Gson();
		BaseAccount baseAccount=gson.fromJson(requestBody, BaseAccount.class);
		Account findAccount;
		findAccount=accountRepository.findByName(baseAccount.getName());
		if(findAccount==null)
		{
			Account newAccount=new Account();
			newAccount.setName(baseAccount.getName());
			accountRepository.save(newAccount);
			
			 File dir;
			 Path docPath=Paths.get(RESOURCE_PUBLIC_PATH+"/"+baseAccount.getName());
			 dir= new File(docPath.toUri());
			 if(!dir.exists())  
			 {
					try {
						Files.createDirectories(docPath);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			return SUCCESS;
		}
		else
		{
			return FAIL;
		}
	}
	@RequestMapping("/login")
	@ResponseBody
	public String signIn(@RequestBody String requestBody,HttpServletRequest request)
	{	
		
		Gson gson=new Gson();
		BaseAccount baseAccount=gson.fromJson(requestBody, BaseAccount.class);
		Account findAccount;
		findAccount=accountRepository.findByName(baseAccount.getName());
		if(findAccount!=null)
		{
			request.getSession().setAttribute(SESSION_NAME, baseAccount.getName());
			request.getSession().setMaxInactiveInterval(0);
			String sessionId=request.getSession().getId();
			return SUCCESS;
		}
		else
		{
			return FAIL;
		}
		
	}
	@RequestMapping("/getblogData")
	@ResponseBody
	public String getBlogData(@RequestBody String requestBody,HttpServletRequest request)
	{
		String line;
		String allLine="";
		try (BufferedReader reader = new BufferedReader(new FileReader(RESOURCE_PUBLIC_PATH+"/test.md"))) {
			while((line=reader.readLine())!=null)
			{
				allLine+=(line+"\r\n");
			}
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		return allLine;
	}
	@RequestMapping("/updateblogData")
	@ResponseBody
	public String updateBlogData(@RequestBody String requestBody,HttpServletRequest request)
	{	
		 
		//file:///E:/F/java/doc/javatutorials/tutorial/essential/io/file.html
	
		File file=new File(RESOURCE_PUBLIC_PATH,"test.md");
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESOURCE_PUBLIC_PATH+"/test.md"))) {
		    writer.write(requestBody, 0, requestBody.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		 return SUCCESS;

	}
*/	
	

/*
	@RequestMapping("/lp")//for little program test		
	@ResponseBody
	//public String lp(@RequestBody String data) {	
	public String lp(@RequestParam(value="x",defaultValue="") String x,@RequestParam(value="y",defaultValue="") String y) {
		
		
		//return "get"+count+":"+data;	
		return "x:"+x+",y:"+y;
		
	}
	
	@RequestMapping("/gettimers")		
	@ResponseBody
	public ArrayList<TimerData> getTimers(@RequestParam(value="pruductID",defaultValue="") String pruductID,@RequestParam(value="functionID",defaultValue="") int functionID) {	
		ArrayList<TimerData> timerList=timerDataRepository.findByPruductIDAndFunctionIDAllIgnoringCase(pruductID,functionID);
		return timerList;
	}
	
	@RequestMapping("/gettimer")		
	@ResponseBody
	public TimerData getTimer(@RequestParam(value="id",defaultValue="") Long id)
	{
		return timerDataRepository.findOne(id);
	}
	
	@RequestMapping("/addtimer")		
	@ResponseBody
	public String addTimer(@RequestBody String timer)
	{
		
		Gson gson=new Gson();
		TimerData timerOBJ=gson.fromJson(timer, TimerData.class);
		timerDataRepository.save(timerOBJ);
		return timer;
	}
	
	@RequestMapping("/greeting")		
	@ResponseBody
	public String helloWorld() {	
		
		//Gson gson=new Gson();
		//String gsonstr=gson.toJson(timerList);
		count++;
		String test="Good,";
		return test+"greeting "+count;	
		
	}
*/

	@RequestMapping("/getInfo")		
	@ResponseBody
	public String getInfo(@RequestParam(value="id",defaultValue="") int id) {	
		
		/*String msg="the pc getting your info" ;
		ChannelId channelId;
		
		channelId=DataStore.getInstance().getIdConnect(id);
		if(channelId!=null)
		{
			ChannelGroup channels =NettyEchoServerHandler.getChannelGroup();
			Channel chanel=channels.find(channelId);
			if(chanel!=null)
			{
				chanel.writeAndFlush( msg + '\n');
			}
		}*/
		
		/*DataObj dataObj=DataStore.getInstance().getObjInfo( id);	
		if(dataObj!=null)
		{
			return ""+dataObj.getValue();
		}
		else
		{
			return "not connect yet";
		}*/
		return SUCCESS;
	}
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub	
		HttpServletResponse response_2 = (HttpServletResponse) response;  
		response_2.setHeader("Access-Control-Allow-Origin", "*"); 
		response_2.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		chain.doFilter(request, response_2);  
	}
/*	
	@RequestMapping("/sendInfo")		
	@ResponseBody
	public String sendInfo(@RequestParam(value="message",defaultValue="") String message) {	
		ChannelGroup channels =NettyEchoServerHandler.getChannelGroup();
		for(Channel chanel:channels)
		{
			chanel.writeAndFlush( message + '\n');
		}
		return OK;
	}
	
	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub	
		HttpServletResponse response_2 = (HttpServletResponse) response;  
		response_2.setHeader("Access-Control-Allow-Origin", "*"); 
		response_2.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		chain.doFilter(request, response_2);  
	}
*/	
/*	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub	
		String str;
		str=request.getLocalName();
		str=request.getLocalAddr();
		str=request.getServerName();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse response_2 = (HttpServletResponse) response;  
		response_2.setHeader("Access-Control-Allow-Origin", "*"); 
		response_2.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	
		
		
	  
        String path = req.getContextPath();
        String basePath = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+path;
        System.out.println("path is:"+path);
        System.out.println("req.getServerName() is:"+req.getServerName());
        HttpSession session = req.getSession(true);
        if(req.getServerName().equals("md.aclickall.com"))
        {
        	 String newPath = req.getScheme()+"://"+"www.aclickall.com"+":"+req.getServerPort()+path;
        	 System.out.println("newPath is:"+newPath);
        	 response_2.sendRedirect(newPath+"/test.html");
        }
        else
        {
        	chain.doFilter(request, response_2);
        }
  
	}
*/	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}				
															


}
