package com.nubes.cbook.dao;

import java.util.UUID;

public final class IdGenerator {
	
		private  IdGenerator() {
		}
		
		public static String getNewId() {
			return UUID.randomUUID().toString();
		}
}
