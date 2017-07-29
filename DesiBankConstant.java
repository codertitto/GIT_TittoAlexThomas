package com.desi.bank.constant;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public interface DesiBankConstant {
	
	public long DEFAULT_ACCOUNT_NUMBER=12233444;
	public long DEFAULT_TX_ID=100;
	
	public String PREFIX_ACCOUNT_NUMBER="0031";
	
	public String CURRENCY="Rs";
	
	public static final String USERS_PROPERTIES_FILE="/WEB-INF/users.properties";
	
    public static final  String UUID_NEW_USER = UUID.randomUUID().toString().replaceAll("-", "");
    
    public static final  String APPLICATION_URI = "http://localhost:8080/desi-bank/employee/checkValidLink.htm?uuid=";
    
    public static   Timestamp CURRENT_TIME = new Timestamp(new Date().getTime());


}
