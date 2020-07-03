import com.dxk.mongodb.MongoDbApplication;
import com.dxk.mongodb.dao.UserDaoImpl;
import com.dxk.mongodb.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/3
 * Time: 12:57
 * Description: 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoDbApplication.class)
public class Testing {
    @Autowired
    private UserDaoImpl userDao;

    @Test
    public void test() {
        User user1 = new User();
        user1.setId(1);
        user1.setName("dxk");
        user1.setAge(18);
        userDao.saveUser(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("dxk");
        user2.setAge(18);
        userDao.saveUser(user2);

        userDao.removeUser(1);

        userDao.findUserById(2);
    }
}
