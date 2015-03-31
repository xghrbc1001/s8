package com.xghrbc1001.s8.spider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.xghrbc1001.s8.spider.domain.SinaDomain;

public class SinaSpider {

	public static List<SinaDomain> getSinaDomains(String codesStr) throws Exception {
		if (codesStr == null || codesStr.isEmpty()) {
			return null;
		}
		//List<SinaDomain> sinaDomains = new ArrayList<SinaDomain>();

		HttpClient httpclient = new DefaultHttpClient();
			HttpGet httpget;
			StringBuilder sb = new StringBuilder();
			httpget = new HttpGet("http://hq.sinajs.cn/list=" + codesStr);
			/*if (codesStr.startsWith("6")) {
				httpget = new HttpGet("http://hq.sinajs.cn/list=sh" + codesStr);
			} else {
				httpget = new HttpGet("http://hq.sinajs.cn/list=sz" + codesStr);
			}*/
			// HttpGet httpget = new
			// HttpGet("http://xueqiu.com/v4/stock/quote.json?code=SZ002707&_=1427015633777");
			// httpget.addHeader("Referer", "http://xueqiu.com");

			// System.out.println(i);
			HttpResponse responseBody = httpclient.execute(httpget);

			HttpEntity httpEntity = responseBody.getEntity();

			List<SinaDomain> sinaDomains=null;
			if (httpEntity != null) {
				InputStream instreams = httpEntity.getContent();
				String str = convertStreamToString(instreams);
				System.out.println(str);
				//SinaDomain sinaDomain=SinaDomain.sinaDatatoDomain(str);
				//sinaDomains.add(sinaDomain);
				sinaDomains=SinaDomain.sinaDatatoDomains(str);
			}

		httpclient.getConnectionManager().shutdown();

		return sinaDomains;
	}

	public static String convertStreamToString(InputStream is) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is, "GBK"));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

}
