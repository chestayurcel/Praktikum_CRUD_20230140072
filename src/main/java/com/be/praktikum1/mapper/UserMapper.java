package com.be.praktikum1.mapper;

import com.be.praktikum1.model.dto.UserDto;
import com.be.praktikum1.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
    UserDto toUserDtoData (User user);
}
