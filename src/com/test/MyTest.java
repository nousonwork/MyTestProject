package com.test;

import java.lang.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MyTest {

	
	/*1597993288943	199.6	18274
	1597993305676	199.7	18275
	1597993322310	199.7	18276
	1597993338914	199.7	18277
	1597993355744	199.7	18278
	1597993373331	199.7	18279
	1597993407977	199.6	18280
	1597993391409	199.6	18281
	1597993475751	199.6	18282
	1597993424731	199.6	18283
	1597993441374	199.6	18284
	1597993458950	199.6	18285
	1597993492344	199.65	18286
	1597993509721	199.65	18287
	1597993526326	199.65	18288
	1597993542923	199.65	18289
		199.65	18290
		199.65	18291
		199.65	18292
		199.65	18293
		199.6	18294
		199.6	18295
		199.6	18296
		199.6	18297
		199.6	18298
		199.6	18299 */
	public static void main(String args[]) 
	{ 
		ConcurrentHashMap<Long, Double> chm = new ConcurrentHashMap<Long, Double>();
		chm.put(1597993676119L, 199.6);
		chm.put(1597993709490L, 199.6);
		chm.put(1597993692891L, 199.6);
		chm.put(1597993642245L, 199.6);
		chm.put(1597993625689L, 199.6);
		chm.put(1597993609164L, 199.6);
		chm.put(1597993559493L, 199.6);
		chm.put(1597993576062L, 199.6);
		chm.put(1597993592541L, 199.6);
		 Map<Long, Double> 
         treeMap = chm 
                       // Get the entries from the hashMap 
                       .entrySet() 

                       // Convert the map into stream 
                       .stream() 

                       // Now collect the returned TreeMap 
                       .collect( 
                           Collectors 

                               // Using Collectors, collect the entries 
                               // and convert it into TreeMap 
                               .toMap( 
                                   Map.Entry::getKey, 
                                   Map.Entry::getValue, 
                                   (oldValue, 
                                    newValue) 
                                       -> newValue, 
                                   TreeMap::new)); 
		 
		 
		 Date d = new Date(1597993676119L);
		 System.out.println(d);
		
		 Calendar c1 = Calendar.getInstance();
		 c1.setTimeInMillis(1597993676119L);
		 System.out.println(c1.get(Calendar.HOUR_OF_DAY) + "" +c1.get(Calendar.MINUTE)+""+c1.get(Calendar.SECOND));
		
		 Iterator hmIterator = chm.entrySet().iterator();
		 TreeMap<Long, Double> datePriceTreeMap = new TreeMap<Long, Double>();
		 TreeMap<Long, ArrayList<Double>> datePriceListTreeMap = new TreeMap<Long, ArrayList<Double>>();
		 while (hmIterator.hasNext()) { 
	            Map.Entry mapElement = (Map.Entry)hmIterator.next();
	            Calendar c = Calendar.getInstance();
	   		 	c.setTimeInMillis((Long)mapElement.getKey());
	            //String hrMinSS = c.get(Calendar.HOUR_OF_DAY) + "" +c.get(Calendar.MINUTE)+""+(c.get(Calendar.SECOND) < 10 ? "0"+c.get(Calendar.SECOND) : c.get(Calendar.SECOND));
	            //String hrMinSS = c.get(Calendar.HOUR_OF_DAY) + "" +c.get(Calendar.MINUTE)+""+c.get(Calendar.SECOND);
	           // System.out.println("Key = "+(Long)mapElement.getKey()+"  ,Seconds = " + c.get(Calendar.SECOND));
	            
	            
	           // System.out.println(hrMinSS +" :- " + Integer.parseInt(hrMinSS) % 100);
	            
	           // System.out.println(hrMinSS +" without remainder :- " +(Integer.parseInt(hrMinSS) -  Integer.parseInt(hrMinSS) % 100));
	            
	            
	            Calendar cal = Calendar.getInstance();
	            cal.set(Calendar.DATE, c.get(Calendar.DATE));
	            cal.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY));
	            cal.set(Calendar.MINUTE, c.get(Calendar.MINUTE));
	            
	            if(datePriceListTreeMap.containsKey(cal.getTimeInMillis())) {
	            	datePriceListTreeMap.get(cal.getTimeInMillis()).add((Double)mapElement.getValue());
	            }else {
	            	ArrayList<Double> value = new ArrayList<Double>();
	            	value.add((Double)mapElement.getValue());
	            	datePriceListTreeMap.put(cal.getTimeInMillis(), value);
	            }
	            
	            datePriceTreeMap.put(cal.getTimeInMillis(), (Double)mapElement.getValue());
	              
	        }
		 
		 System.out.println(datePriceListTreeMap);
		 System.out.println(datePriceTreeMap);
		 
		 Iterator multiPriceItr = datePriceListTreeMap.entrySet().iterator();
		 while (multiPriceItr.hasNext()) { 
	            Map.Entry mapElement = (Map.Entry)multiPriceItr.next();
	            
	            ArrayList<Double> pList = (ArrayList<Double>)mapElement.getValue();
	            double sum = 0;
	            int i = 0;
	            for(i=0; i < pList.size(); i++) {
	            	sum+=pList.get(i);
	            }
	            System.out.println("Sum = "+ sum+ ", i = " + i);
	            sum = sum / (i);
	            
	            datePriceTreeMap.put((Long)mapElement.getKey(), sum);
		 }
		 
		 
		 System.out.println(datePriceTreeMap);
		 
		 
	}
	
	
	public static void main_6(String args[]) 
	{ 
		Class testConstructor = TestConstructor.class;
		String str = new String();
		//Constructor const = testConstructor.getDeclaredConstructor(str);
	}

	
	
	public static void main_5(String args[]) 
	{ 
		byte a[] = { 65, 66, 67 }; 
		byte b[] = { 71, 72, 73, 74, 75, 76 }; 
		System.arraycopy(a, 0, b, 3, a.length); 
		System.out.print(new String(a) + " " + new String(b));
	}

	
	public static void main_4(String args[]) 
	{ 
		int x,y;
		x = 1 & 7; y = 3 ^ 6; 
		System.out.println(x + " " + y);
	}

	
	
	
	
	
	
	
	
	public static void main_2(String args[]) 
	{ 
		int var1 = 5; 
		int var2 = 6; 
		int var3; 
		var3 = ++ var2 * var1 / var2 + var2; 
		System.out.print(var3);

	}

	
	
	
	public static void main_1(String args[]) 
	{ 
		int arr[][] = new int[3][]; 
		arr[0] = new int[1]; 
		arr[1] = new int[2]; 
		arr[2] = new int[3];
		int sum = 0; 
		for (int i = 0; i < 3; ++i) 
			for (int j = 0; j < i + 1; ++j) 
			{	arr[i][j] = j + 1; 
				System.out.println("arr = " + arr[i][j]);
				}
		for (int i = 0; i < 3; ++i) 
			for (int j = 0; j < i + 1; ++j) 
				sum += arr[i][j]; 
		System.out.print(sum); 
		}

}

