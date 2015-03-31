package com.xghrbc1001.s8.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.xghrbc1001.s8.spider.SinaSpider;
import com.xghrbc1001.s8.spider.domain.SinaDomain;

@Controller
public class MainController {

	static Properties bankuaiProperties = new Properties();
	static {
		InputStream in = MainController.class.getClassLoader().getResourceAsStream("bankuai.properties");
		
		
		try {
			bankuaiProperties.load(in);
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/")
	public ModelAndView getHome() {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("home", model);
	}
	
	@RequestMapping(value = "/bankuai",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String bangkuai() {
		Map<String, Object> model = new HashMap<String, Object>();
		HashMap<String,List<SinaDomain>> bankuais=new HashMap<String,List<SinaDomain>>();
		Enumeration<Object> keys=bankuaiProperties.keys();
		
		Map<String,SinaDomain> hmStocks=new HashMap<String,SinaDomain>();
		if(keys!=null){
			while(keys.hasMoreElements()){
				String key=(String)keys.nextElement();
				String stocks=(String) bankuaiProperties.get(key);
				if(stocks!=null || !stocks.isEmpty()){
					String[] codes=stocks.split(",");
					for(String code: codes){
						hmStocks.put(code, null);
					}
				}
			}
		}
		
		try{
			String allStocks="";
			Set<String> codeSets=hmStocks.keySet();
			if(codeSets!=null){
				for(String code:codeSets){
					if(code!=null && !code.trim().isEmpty()){
					if (code.startsWith("6")) {
						allStocks+="sh"+code+",";
					} else {
						allStocks+="sz"+code+",";
					}
					}
				}
			}
			List<SinaDomain> sinaDomains=SinaSpider.getSinaDomains(allStocks.substring(0, allStocks.length()-1));
			
			for(SinaDomain sinaDomain:sinaDomains){
				hmStocks.put(sinaDomain.getId().toString(), sinaDomain);
			}
			
			keys=bankuaiProperties.keys();
			
			while(keys.hasMoreElements()){
				String key=(String)keys.nextElement();
				String stocks=(String) bankuaiProperties.get(key);
				List<SinaDomain> bankuaiDomains=new ArrayList<SinaDomain>();
				if(stocks!=null || !stocks.isEmpty()){
					String[] codes=stocks.split(",");
					for(String code: codes){
						bankuaiDomains.add(hmStocks.get(code));
					}
				}
				bankuais.put(key, sinaDomains);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
			
		}
		
		Gson gson=new Gson();
		return gson.toJson(bankuais);
		
	}
}
