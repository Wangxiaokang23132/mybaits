import com.itcast.Mapper.StudentMapper;
import com.itcast.daomain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo {
    @Test
    public void findAll() throws IOException {
        //读取核心配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> list = mapper.findAll();
        System.out.println(list);



        }
}
