import com.athome.sortalgorithm.sort1interface.Student;
import org.junit.jupiter.api.Test;

/**
 * @author Wldz
 * @time 21-1-13  22:44
 * @todo  2.定义测试类Test，在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
 */
public class Sort1Test {

    public static Comparable getMax(Comparable c1,Comparable c2){
        int result=c1.compareTo(c2);
        //result<0 c1<c2 ==
        //result>=0 c1>=c2
        if (result >= 0)
            return c1;
        else {
            return c2;
        }
    }

    /**
     * @description: 测试方法
     * @param: * @param:
     * @return: void
     * @author Wldz
     * @date: 21-1-13 23:20
     */
    @Test
    public void sortTest(){
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",19);
        Comparable max =getMax(s1,s2);
        System.out.println(max);

    }


}
