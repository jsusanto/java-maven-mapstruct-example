package student;

import com.medibank.javamavenmapstruct.student.Student;
import com.medibank.javamavenmapstruct.student.StudentEntity;
import com.medibank.javamavenmapstruct.student.StudentMapper;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

public class StudentMapperTest {
    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);
    
   @Test
   public void testEntityToModel() {
      StudentEntity entity = new StudentEntity();
      entity.setClassVal("X");
      entity.setName("John");
      entity.setId(1);
      Student model = studentMapper.getModelFromEntity(entity);
      assertEquals(entity.getClassVal(), model.getClassName());
      assertEquals(entity.getName(), model.getName());
      assertEquals(entity.getId(), model.getId());
   }
   
   @Test
   public void testModelToEntity() {
      Student model = new Student();
      model.setId(1);
      model.setName("John");
      model.setClassName("X");
      StudentEntity entity = studentMapper.getEntityFromModel(model);
      assertEquals(entity.getClassVal(), model.getClassName());
      assertEquals(entity.getName(), model.getName());
      assertEquals(entity.getId(), model.getId());
   }
}
