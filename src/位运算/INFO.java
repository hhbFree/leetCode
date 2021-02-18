package 位运算;

/**
 * @Description: byte 1个字节 8位；short、char 2个字节 16位；int float 4个字节 32位；double、long 8个字节 64位；
 *              计算机内的存储都是按照补码存储的
 * @Author: hbHao
 * @Date: 2021/2/18 15:17
 */
public class INFO {

    public static void main(String[] args) {
        //我们只关心二进制的机器数而不关注十进制的值,那么byte &0xff只是对其最低8位的复制,通常配合逻辑或 ‘’|’'使用,达到字节的拼接,但不保证其十进制真值不变
        //只有在源码、反码、补码相互转换时，符号位不变，在&、|、~等位运算时，符号位根据规则改变
        byte a=-127;
        //源码 11111111
        //反码 10000000
        //补码 10000001

        int b=a;
        //将byte 类型提升为int时候，b的补码提升为 32位，补码的高位补1
        //1111 1111 1111 1111 1111 1111 1000 0001
        // **负数补码转源码 符号位不变 ，其他位取反，再加1
        //1000 0000 0000 0000 0000 0000 0111 1111

        System.out.println(b);

        int c=b&0xff;//因为计算机内存储的都是补码，所以计算也是按补码计算
        //1111 1111 1111 1111 1111 1111 1000 0001
        //&
        //0000 0000 0000 0000 0000 0000 1111 1111
        //=
        //0000 0000 0000 0000 0000 0000 1000 0001
        //计算结果和原来的补码一致但是高位的符号位变化了，之前的是byte类型（8位），高位的符号位是1，现在是int类型（32位），高位的符号位是0，转成十进制为129
        System.out.println(c);


        System.out.println("---------------------------------------------------------------------");

        int size=1<<4;

        System.out.println(size);

        System.out.println(122%size);
        System.out.println(122&(size-1));
        // **正数的补码和反码都不变
        //0000 0000 0000 0000 0000 0000 0111 1010
        //&
        //0000 0000 0000 0000 0000 0000 0000 1111
        //=
        //0000 0000 0000 0000 0000 0000 0000 1010

    }

}
