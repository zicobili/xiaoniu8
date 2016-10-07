package com.example.administrator.xiaoniu;

/**
 * Created by Administrator on 2016/10/1.
 */
public class Job {
    private  String title,time,salary,storename,image01,image02,image03,image04,image05,image06,header,bossname,office;


    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }

    public String getSalary(){return salary;}
    public void setSalary(String salary){
        this.salary = salary;
    }

    public String getStorename(){
        return storename;
    }
    public void setStorename(String storename){
        this.storename = storename;
    }

    public String getHeader(){
        return header;
    }
    public void setHeader(String header){
        this.header = header;
    }

    public String getBossname(){
        return bossname;
    }
    public void setBossname(String bossname){
        this.bossname = bossname;
    }

    public String getOffice(){
        return office;
    }
    public void setOffice(String office){
        this.office = office;
    }

    public String getImage01(){
        return image01;
    }
    public void setImage01(String image01){
        this.image01 = image01;
    }

    public String getImage02(){
        return image02;
    }
    public void setImage02(String image02){
        this.image02 = image02;
    }

    public String getImage03(){
        return image03;
    }
    public void setImage03(String image03){
        this.image03 = image03;
    }

    public String getImage04(){
        return image04;
    }
    public void setImage04(String image04){
        this.image04 = image04;
    }

    public String getImage05(){
        return image05;
    }
    public void setImage05(String image05){
        this.image05 = image05;
    }

    public String getImage06(){
        return image06;
    }
    public void setImage06(String image06){
        this.image06 = image06;
    }


    public Job(String title, String time, String salary, String storename, String header, String bossname, String office, String image01,
               String image02, String image03, String image04, String image05, String image06){
        super();
        this.title = title;

        this.time = time;


        this.salary = salary;

        this.storename = storename;

        this.header = header;

        this.bossname = bossname;

        this.office = office;

        this.image01 = image01;
        this.image02 = image02;
        this.image03 = image03;
        this.image04 = image04;
        this.image05 = image05;
        this.image06 = image06;

    }




}
