package com.app.safferha.DataAccessLayer;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataAccessLayer extends SQLiteOpenHelper{

	private static String DBNAME = "SafferhaDB";
	private static int VERSION = 1;
	
	SQLiteDatabase db;
	
	private String User = "USER";
//	private String User = "USER";
//	private String User = "USER";
//	private String User = "USER";
//	private String User = "USER";
//	private String User = "USER";
//	private String User = "USER";
	
	
	
	
	public DataAccessLayer(Context context) {
		super(context, DBNAME, null, VERSION);		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		db.execSQL("CREATE TABLE IF  NOT EXISTS "+User+" ( ID INTEGER PRIMARY KEY AUTOINCREMENT,UserName TEXT, Password TEXT );");
//		db.execSQL("CREATE TABLE IF  NOT EXISTS "+User+" ( ID INTEGER PRIMARY KEY AUTOINCREMENT,UserName TEXT, Password TEXT );");
//		db.execSQL("CREATE TABLE IF  NOT EXISTS "+User+" ( ID INTEGER PRIMARY KEY AUTOINCREMENT,UserName TEXT, Password TEXT );");
//		db.execSQL("CREATE TABLE IF  NOT EXISTS "+User+" ( ID INTEGER PRIMARY KEY AUTOINCREMENT,UserName TEXT, Password TEXT );");
//		db.execSQL("CREATE TABLE IF  NOT EXISTS "+User+" ( ID INTEGER PRIMARY KEY AUTOINCREMENT,UserName TEXT, Password TEXT );");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
		db.execSQL("DROP TABLE IF EXISTS"+ User);
//		db.execSQL("DROP TABLE IF EXISTS"+ User);
//		db.execSQL("DROP TABLE IF EXISTS"+ User);
//		db.execSQL("DROP TABLE IF EXISTS"+ User);
//		db.execSQL("DROP TABLE IF EXISTS"+ User);
//		db.execSQL("DROP TABLE IF EXISTS"+ User);
//		db.execSQL("DROP TABLE IF EXISTS"+ User);
		
	}

	
	public long inputUser(String UserName, String Password)
	{
		ContentValues values = new ContentValues();
		long i = 0;
		try
		{
			values.put("UserName", UserName);
			values.put("Password", Password);
			
			db = getWritableDatabase();
			i = db.insert(User, null, values);
			db.close();
			
		}catch(Exception ex){}
		
		return i;
	}
	
	
	
	
	
}
