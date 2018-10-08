package com;

import com.Guest;

public interface GuestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Guest record);

    int insertSelective(Guest record);

    Guest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Guest record);

    int updateByPrimaryKey(Guest record);
}