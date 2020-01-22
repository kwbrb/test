package com.zds.dao;

import com.zds.entity.DVD;

import java.util.List;

public interface IDVDDao {
    public boolean add(DVD dvd) ;



    public boolean deleteById(int id) ;
    public boolean deleteByName(String dname) ;



    public boolean update(DVD dvd) ;



     DVD queryById(int id) ;
     List<DVD> queryByName(String dname) ;

    List<DVD> queryAllDVD();
    List<DVD> queryDVDSort(int index,int number);//查询下标范围内的dvd
    List<DVD> queryDVDByStatus(int status);//查询可借的dvd


}
