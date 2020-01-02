package lambda.test2;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 *
 * java内置四大函数式接口
 *
 * Consumer<T> :消费型接口
 *          void accept(T t);
 *
 * Supplier<T> :供给型接口
 *          T get();
 *
 * Function<T,R> :函数型接口
 *          R apply(T t);
 *
 * Predicate<T> :断言型接口
 *          boolean test(T t);
 *
 */

public class FunctionTest3 {

    @Test
    public void test1(){
       // con(100,(x)->System.out.println(x));
    }

    public void con(Double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
}
