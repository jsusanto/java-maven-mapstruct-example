package com.medibank.javamavenmapstruct.student;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
   @Mapping(target="className", source="classVal")
   Student getModelFromEntity(StudentEntity student);

   @Mapping(target="classVal", source="className")
   StudentEntity getEntityFromModel(Student student);
}
