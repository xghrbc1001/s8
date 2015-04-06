package com.xghrbc1001.s8.spider.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 
 * var hq_str_sh601006="大秦铁路, 27.55, 27.25, 26.91, 27.55, 26.20, 26.91,
 * 26.92, 22114263, 589824680, 4695, 26.91, 57590, 26.90, 14700, 26.89,
 * 14300, 26.88, 15100, 26.87, 3100, 26.92, 8900, 26.93, 14230, 26.94,
 * 25150, 26.95, 15220, 26.96, 2008-01-11, 15:05:32";
 * 
 * 这个字符串由许多数据拼接在一起，不同含义的数据用逗号隔开了，按照程序员的思路，顺序号从0开始。 0：”大秦铁路”，股票名字；
 * 1：”27.55″，今日开盘价； 2：”27.25″，昨日收盘价； 3：”26.91″，当前价格； 4：”27.55″，今日最高价；
 * 5：”26.20″，今日最低价； 6：”26.91″，竞买价，即“买一”报价； 7：”26.92″，竞卖价，即“卖一”报价；
 * 8：”22114263″，成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百；
 * 9：”589824680″，成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；
 * 10：”4695″，“买一”申请4695股，即47手； 11：”26.91″，“买一”报价； 12：”57590″，“买二”
 * 13：”26.90″，“买二” 14：”14700″，“买三” 15：”26.89″，“买三” 16：”14300″，“买四”
 * 17：”26.88″，“买四” 18：”15100″，“买五” 19：”26.87″，“买五”
 * 20：”3100″，“卖一”申报3100股，即31手； 21：”26.92″，“卖一”报价 (22, 23), (24, 25),
 * (26,27), (28, 29)分别为“卖二”至“卖四的情况” 30：”2008-01-11″，日期； 31：”15:05:32″，时间；
 */
public class SinaDomain implements Serializable,Comparable<SinaDomain> {

	private static final long serialVersionUID = -5098235959564218739L;

	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:MM");
	
	private static final DecimalFormat df=new DecimalFormat("#.00");

	private String id;

	private String name;

	// 开盘价
	private Double openingPrice;

	// 昨日收盘价
	private Double closingPrice;

	// 当前价
	private Double currentPrice;

	// 今日最高价
	private Double todayTopPrice;

	// 今日最低
	private Double todayBottomPrice;

	// 投资者以现有卖价的价位申报买入，此为主动性买单，此价格为竞买价。
	private Double bidsPrice;

	// 投资者以现有买价的价位申报卖出，此为主动性卖单，此价格为竞卖价。
	private Double auctionPrice;

	// 成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百
	private Long volume;
	// 成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；
	private Double turnVolume;

	// 买一
	private Double buy1Price;
	// “买一”申请4695股，即47手
	private Long buy1Number;
	// 买二
	private Double buy2Price;
	// 买二
	private Long buy2Number;
	// 买二
	private Double buy3Price;
	// 买二
	private Long buy3Number;
	// 买二
	private Double buy4Price;
	// 买二
	private Long buy4Number;
	// 买二
	private Double buy5Price;
	// 买二
	private Long buy5Number;

	// 卖一
	private Double sale1Price;
	private Long sale1Number;
	private Double sale2Price;
	private Long sale2Number;
	private Double sale3Price;
	private Long sale3Number;
	private Double sale4Price;
	private Long sale4Number;
	private Double sale5Price;
	private Long sale5Number;
	private Date time;
	
	// 涨跌幅
	private Double percentage;
	
	private String percentageShow;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(Double openingPrice) {
		this.openingPrice = openingPrice;
	}

	public Double getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(Double closingPrice) {
		this.closingPrice = closingPrice;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Double getTodayTopPrice() {
		return todayTopPrice;
	}

	public void setTodayTopPrice(Double todayTopPrice) {
		this.todayTopPrice = todayTopPrice;
	}

	public Double getTodayBottomPrice() {
		return todayBottomPrice;
	}

	public void setTodayBottomPrice(Double todayBottomPrice) {
		this.todayBottomPrice = todayBottomPrice;
	}

	public Double getBidsPrice() {
		return bidsPrice;
	}

	public void setBidsPrice(Double bidsPrice) {
		this.bidsPrice = bidsPrice;
	}

	public Double getAuctionPrice() {
		return auctionPrice;
	}

	public void setAuctionPrice(Double auctionPrice) {
		this.auctionPrice = auctionPrice;
	}

	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Double getTurnVolume() {
		return turnVolume;
	}

	public void setTurnVolume(Double turnVolume) {
		this.turnVolume = turnVolume;
	}

	public Double getBuy1Price() {
		return buy1Price;
	}

	public void setBuy1Price(Double buy1Price) {
		this.buy1Price = buy1Price;
	}

	public Long getBuy1Number() {
		return buy1Number;
	}

	public void setBuy1Number(Long buy1Number) {
		this.buy1Number = buy1Number;
	}

	public Double getBuy2Price() {
		return buy2Price;
	}

	public void setBuy2Price(Double buy2Price) {
		this.buy2Price = buy2Price;
	}

	public Long getBuy2Number() {
		return buy2Number;
	}

	public void setBuy2Number(Long buy2Number) {
		this.buy2Number = buy2Number;
	}

	public Double getBuy3Price() {
		return buy3Price;
	}

	public void setBuy3Price(Double buy3Price) {
		this.buy3Price = buy3Price;
	}

	public Long getBuy3Number() {
		return buy3Number;
	}

	public void setBuy3Number(Long buy3Number) {
		this.buy3Number = buy3Number;
	}

	public Double getBuy4Price() {
		return buy4Price;
	}

	public void setBuy4Price(Double buy4Price) {
		this.buy4Price = buy4Price;
	}

	public Long getBuy4Number() {
		return buy4Number;
	}

	public void setBuy4Number(Long buy4Number) {
		this.buy4Number = buy4Number;
	}

	public Double getBuy5Price() {
		return buy5Price;
	}

	public void setBuy5Price(Double buy5Price) {
		this.buy5Price = buy5Price;
	}

	public Long getBuy5Number() {
		return buy5Number;
	}

	public void setBuy5Number(Long buy5Number) {
		this.buy5Number = buy5Number;
	}

	public Double getSale1Price() {
		return sale1Price;
	}

	public void setSale1Price(Double sale1Price) {
		this.sale1Price = sale1Price;
	}

	public Long getSale1Number() {
		return sale1Number;
	}

	public void setSale1Number(Long sale1Number) {
		this.sale1Number = sale1Number;
	}

	public Double getSale2Price() {
		return sale2Price;
	}

	public void setSale2Price(Double sale2Price) {
		this.sale2Price = sale2Price;
	}

	public Long getSale2Number() {
		return sale2Number;
	}

	public void setSale2Number(Long sale2Number) {
		this.sale2Number = sale2Number;
	}

	public Double getSale3Price() {
		return sale3Price;
	}

	public void setSale3Price(Double sale3Price) {
		this.sale3Price = sale3Price;
	}

	public Long getSale3Number() {
		return sale3Number;
	}

	public void setSale3Number(Long sale3Number) {
		this.sale3Number = sale3Number;
	}

	public Double getSale4Price() {
		return sale4Price;
	}

	public void setSale4Price(Double sale4Price) {
		this.sale4Price = sale4Price;
	}

	public Long getSale4Number() {
		return sale4Number;
	}

	public void setSale4Number(Long sale4Number) {
		this.sale4Number = sale4Number;
	}

	public Double getSale5Price() {
		return sale5Price;
	}

	public void setSale5Price(Double sale5Price) {
		this.sale5Price = sale5Price;
	}

	public Long getSale5Number() {
		return sale5Number;
	}

	public void setSale5Number(Long sale5Number) {
		this.sale5Number = sale5Number;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	
	public Double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getPercentageShow() {
		return df.format(percentage)+"%";
	}

	public void setPercentageShow(String percentageShow) {
		this.percentageShow = percentageShow;
	}

	@Override
	public String toString() {
		return "SinaDomain [代码=" + id + ", 名称=" + name + ", 开盘价=" + openingPrice + ", 收盘价=" + closingPrice + ", 当前价=" + currentPrice
				+ ", 今日最高=" + todayTopPrice + ", 今日最低=" + todayBottomPrice + ", 竞买价=" + bidsPrice + ", 竞卖价=" + auctionPrice + ", 成交量="
				+ volume + ", 成交额度=" + turnVolume + ", 买一价=" + buy1Price + ", 买一=" + buy1Number + ", 买二价=" + buy2Price + ", 买二=" + buy2Number
				+ ", 买三价=" + buy3Price + ", 买三=" + buy3Number + ", 买四价=" + buy4Price + ", 买四价=" + buy4Number + ", 买五价=" + buy5Price
				+ ", 买五价=" + buy5Number + ", 卖一价=" + sale1Price + ", 卖一=" + sale1Number + ", 卖二价=" + sale2Price + ", 卖二=" + sale2Number
				+ ", 卖三价=" + sale3Price + ", 卖三=" + sale3Number + ", 卖四价=" + sale4Price + ", 卖四=" + sale4Number + ", 卖五价=" + sale5Price
				+ ", 卖五=" + sale5Number + ", 时间=" + time + "]";
	}
	
	public static List<SinaDomain> sinaDatatoDomains(String multiSinaData){
		if(multiSinaData==null){
			return null;
		}
		List<SinaDomain>   sinaDomains=new ArrayList<SinaDomain>();
		String[] sinaDatas=multiSinaData.replaceAll("\n", "").split(";");
		if(sinaDatas==null){
			return null;
		}
		
		for(String sinaData: sinaDatas){
			sinaDomains.add(sinaDatatoDomain(sinaData));
		}
		
		return sinaDomains;
		
	}

	public static SinaDomain sinaDatatoDomain(String sinaData) {
		try {
			if (sinaData == null) {
				return null;
			}

			SinaDomain sinaDomain = new SinaDomain();
			sinaData=sinaData.replaceAll("var hq_str_sh", "").replaceAll("var hq_str_sz", "").replaceAll("=", ",").replaceAll("\"", "").replaceAll("\r\n", "").replaceAll("\n", "");
			String[] datas = sinaData.split(",");
			sinaDomain.setId(datas[0]);
			sinaDomain.setName(datas[1]);
			sinaDomain.setOpeningPrice(Double.parseDouble(datas[2]));
			sinaDomain.setClosingPrice(Double.parseDouble(datas[3]));
			sinaDomain.setCurrentPrice(Double.parseDouble(datas[4]));
			sinaDomain.setTodayTopPrice(Double.parseDouble(datas[5]));
			sinaDomain.setTodayBottomPrice(Double.parseDouble(datas[6]));
			sinaDomain.setBidsPrice(Double.parseDouble(datas[7]));
			sinaDomain.setAuctionPrice(Double.parseDouble(datas[8]));
			sinaDomain.setVolume(Long.parseLong(datas[9]));
			sinaDomain.setTurnVolume(Double.parseDouble(datas[10]));
			sinaDomain.setBuy1Price(Double.parseDouble(datas[12]));
			sinaDomain.setBuy1Number(Long.parseLong(datas[11]));
			sinaDomain.setBuy2Price(Double.parseDouble(datas[14]));
			sinaDomain.setBuy2Number(Long.parseLong(datas[13]));
			sinaDomain.setBuy3Price(Double.parseDouble(datas[16]));
			sinaDomain.setBuy3Number(Long.parseLong(datas[15]));
			sinaDomain.setBuy4Price(Double.parseDouble(datas[18]));
			sinaDomain.setBuy4Number(Long.parseLong(datas[17]));
			sinaDomain.setBuy5Price(Double.parseDouble(datas[20]));
			sinaDomain.setBuy5Number(Long.parseLong(datas[19]));
			sinaDomain.setSale1Price(Double.parseDouble(datas[22]));
			sinaDomain.setSale1Number(Long.parseLong(datas[21]));
			sinaDomain.setSale2Price(Double.parseDouble(datas[24]));
			sinaDomain.setSale2Number(Long.parseLong(datas[23]));
			sinaDomain.setSale3Price(Double.parseDouble(datas[26]));
			sinaDomain.setSale3Number(Long.parseLong(datas[25]));
			sinaDomain.setSale4Price(Double.parseDouble(datas[28]));
			sinaDomain.setSale4Number(Long.parseLong(datas[27]));
			sinaDomain.setSale5Price(Double.parseDouble(datas[30]));
			sinaDomain.setSale5Number(Long.parseLong(datas[29]));
			sinaDomain.setTime(simpleDateFormat.parse(datas[31] + " " + datas[32]));
			
			try{
				double percentage= (sinaDomain.getCurrentPrice() - sinaDomain.getClosingPrice())/sinaDomain.getClosingPrice();
				sinaDomain.setPercentage(getDecimal(percentage*100));
			}catch(Exception ex){
				sinaDomain.setPercentage(0.00);
			}
			return sinaDomain;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}
	
	public static double getDecimal(double num) {
		   if (Double.isNaN(num)) {
		    return 0;
		   }
		   BigDecimal bd = new BigDecimal(num);
		   num = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		   return num;
		 }

	@Override
	public int compareTo(SinaDomain sinaDomain) {
		if(this.percentage == sinaDomain.percentage){
			return 0;
		}
		if(this.percentage < sinaDomain.percentage){
			return 1;
		}else{
			return -1;
		}
	}
}
