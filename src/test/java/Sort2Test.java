import com.athome.sortalgorithm.sort2bubble.Bubble;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author 32341
 * @version 1.0
 * @description: 冒泡排序测试类
 * @date 21-1-14 22:13
 */
public class Sort2Test {
    /**
     * @description:  冒泡排序测试方法
     * @param: * @param: student
     * @return: void
     * @author 32341
     * @date: 21-1-14 22:16
     */

    @Test
    public void BubbleTest(){
        Integer[] o={3,5,2,7,2,6,8,4,9};
        Bubble.sort(o);
        System.out.println(Arrays.toString(o));
    }


}
