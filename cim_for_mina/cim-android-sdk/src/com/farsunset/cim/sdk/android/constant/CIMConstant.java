/**
 * probject:cim-android-sdk
 * @version 2.1.0
 * 
 * @author 3979434@qq.com
 */  
package com.farsunset.cim.sdk.android.constant;

/** 
 * 常量
 */
public   interface  CIMConstant  {
    
	
	public static String UTF8="UTF-8";
	
	public static byte  MESSAGE_SEPARATE='\b';
	
	public static long RECONN_INTERVAL_TIME= 30 * 1000;
	
	public static int  CIM_DEFAULT_MESSAGE_ORDER=1;
	
    public static class ReturnCode{
		
		public static String CODE_404 ="404";
		
		public static String CODE_403 ="403";
		
		public static String CODE_405 ="405";
		
		public static String CODE_200 ="200";
		
		public static String CODE_206 ="206";
		
		public static String CODE_500 ="500";
		
		
	}
	 
	/**
	 * 服务端心跳请求命令  cmd_server_hb_request
	 */
	public static final String CMD_HEARTBEAT_REQUEST="S_H_RQ";
	/**
	 * 客户端心跳响应命令  cmd_client_hb_response
	 */
	public static final String CMD_HEARTBEAT_RESPONSE ="C_H_RS"; 

	
   public static class RequestKey{
		
	   
	    public static String CLIENT_BIND ="client_bind";
		
		public static String CLIENT_OFFLINE_MESSAGE ="client_get_offline_message";
		
	}
   
   
   public static class MessageType{
		
	    //用户会 踢出下线消息类型
		public static String TYPE_999 ="999";
		
	}
   
}