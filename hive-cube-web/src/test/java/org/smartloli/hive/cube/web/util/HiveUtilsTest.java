/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package org.smartloli.hive.cube.web.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.smartloli.hive.cube.common.util.HiveUtils;

/**
 * Test Sample.
 * 
 * @author smartloli.
 *
 *         Created by Jul 4, 2017
 */
public class HiveUtilsTest {

	public static void main(String[] args) throws SQLException {
		HiveUtils hive = new HiveUtils();
		ResultSet rs = hive.executeQuery("desc formatted ip_login");
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		while (rs.next()) {
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			for (int i = 1; i <= columnCount; i++) {
				if(rsmd.getColumnName(i).contains("Table Type")){
				}
				map.put(rsmd.getColumnName(i), rs.getString(i));
			}
			System.out.println(map.toString());
		}
		hive.close(rs);
	}
	
}
