package org.andestech.learning.rfb18.g2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestFileReader
{

   public static Collection<Object[]> getDatafromFile(String fileName)
   {
      List<String> lines  = null;
       ArrayList<Object[]> testData = new ArrayList<>();
      Object arrData[];

          try {

             lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
          }
          catch (IOException ex)
          {
             ex.printStackTrace();
             return new ArrayList<>();
          }

      for(String st: lines)
      {
        if( !st.isEmpty() && !st.startsWith("#"))
        {
           System.out.println(st);

           st = st.trim();
           int j =0;
           arrData = new Object[3];
           for(String s: st.split(","))
           {
               s = s.trim();
               arrData[j] = Double.parseDouble(s);
               j++;
           }

           testData.add(arrData);


        }

      }

      return testData;
   }

}
