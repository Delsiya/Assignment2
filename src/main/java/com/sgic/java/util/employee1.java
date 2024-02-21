package com.sgic.java.util;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.FileInputStream;
import java.util.List;
public class employee1 {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("E:/task2/src/main/java/com/sgic/java/util/employee.xml");
            ObjectMapper m = new XmlMapper();
            TypeReference<List<Employee2>> typeReference = new TypeReference<>()
            {
            };
            List<Employee2> user=m.readValue(inputStream,typeReference);
           inputStream.close();


            for (Employee2 r: user) {
              //  String position=r.getPosition();
                if ("Quality Engineer".equals(r.getPosition())) {
                    System.out.println(r.getId() + " " + r.getPosition());
                    r.Database();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}