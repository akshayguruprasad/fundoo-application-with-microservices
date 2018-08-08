///**
// * 
// */
//package com.indream.configuration;
//
//import javax.annotation.PreDestroy;
//
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author Akshay
// *
// */
//@Configuration
//public class ElasticConfig {
//
//	@Bean
//	public RestHighLevelClient getHighClient() {
//		RestHighLevelClient client = new RestHighLevelClient(
//				RestClient.builder());
//		return client;
//	}
//
//	@PreDestroy
//	public void closeEsClient() {
//		try {
//			getHighClient().close();
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Error while closing elasticsearch client");
//
//		}
//
//	}
//
//}
