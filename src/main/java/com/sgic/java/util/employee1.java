package com.sgic.java.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.FileInputStream;
import java.util.List;
public class employee {

    public static void main(String[] args) {


        try {
            ObjectMapper mapper = new XmlMapper();

            FileInputStream inputStream = new FileInputStream("E:/task2/src/main/java/com/sgic/java/util/employee.xml");
            TypeReference<List<get1>> typeReference = new TypeReference<List<get1>>() {
            };
            List<get1> user = mapper.readValue(inputStream, typeReference);
            inputStream.close();


            for (get1 i : user) {
                if ("Quality Engineer".equals(i.getPosition())) {
                    System.out.println(i.getId() + " " + i.getPosition());
                    i.Database();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}