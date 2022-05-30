/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Data {
    public static ArrayList<SinhVien> dsSV = new ArrayList<>();
    
    public void loadData(){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("src\\data.txt");
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {                
                String []path = line.split(",");
                String maSv= path[0];
                String tenSV = path[1];
                String diaChi = path[2];
                String email = path[3];
                int sodt = Integer.parseInt(path[4]);
                double diem = Double.parseDouble(path[5]);
                SinhVien sv = new SinhVien(maSv, tenSV, diaChi, email, sodt, diem);
                dsSV.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if(fr != null) fr.close();
                if(br != null) br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public ArrayList<User> docdsUser(){
        ArrayList<User> dsUser = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("src\\user.txt"))){
            while (sc.hasNext()) {
               User us = new User();
               us.setUserName(sc.nextLine());
               us.setUserPassword(sc.nextLine());
               dsUser.add(us); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsUser;
    }
    public admin docdsAdmin(){
        admin ad = new admin();
        try (Scanner sc = new Scanner(new File("src\\admin.txt"))){
            while (sc.hasNext()) {
               ad.setTkadmin(sc.nextLine());
               ad.setMkadmin(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ad;
    }
    
}
