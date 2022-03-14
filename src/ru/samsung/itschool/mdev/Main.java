package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeMap<String,TreeMap<String,Integer>> sales2 = new TreeMap<>();

        for(Map.Entry e: sales2.entrySet()) {
            System.out.println(e.getKey()); // Ivanov
            TreeMap<String,Integer> user = (TreeMap)e.getValue();
            for(Map.Entry e1: user.entrySet()) {
                System.out.println(e1.getKey() + " "+e1.getValue()); // paper 12
            }
        }

        // добавление данных в TreeMap
        sales.put()
        // проверка данных по ключу
        sales.containsKey()









        Scanner scanner = new Scanner(System.in);
        String line;
        TreeMap<String, TreeMap<String,Integer>> sales = new TreeMap<>();

        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] input = line.split(" ");
            if(sales.containsKey(input[0])) {
                TreeMap<String,Integer> user = sales.get(input[0]);
                if(user.containsKey(input[1])) {
                    user.put(input[1],user.get(input[1]) + Integer.parseInt(input[2]));
                } else {
                    user.put(input[1],Integer.parseInt(input[2]));
                }
            } else {
                TreeMap<String,Integer> product = new TreeMap<>();
                product.put(input[1],Integer.parseInt(input[2]));
                sales.put(input[0],product);
            }
        }
    }





}
