package org.zsz.common;

import java.util.concurrent.Callable;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

/**
 * 函数工具类
 *
 * @author Linus Zhang
 * @create 2022-04-28 00:03
 */
public final class Functions {

  private Functions() {
  }

  public static <T, R> Function<T, R> noInputFunction(Supplier<R> supplier) {
    return t -> supplier.get();
  }

  public static <T, R> Function<T, R> noInputFunction(R result) {
    return t -> result;
  }

  public static <T> BinaryOperator<T> outputAfter() {
    return (a, b) -> b;
  }

  public static <T> BinaryOperator<T> outputBefore() {
    return (a, b) -> a;
  }

  public static <T> IntConsumer noInputIntConsumer(Supplier<T> supplier) {
    return i -> supplier.get();
  }

  public static <T> Consumer<T> noInputConsumer(Runnable runnable) {
    return useless -> runnable.run();
  }

  public static <T> Callable<T> noOutputCallable(Runnable runnable) {
    return () -> {
      runnable.run();
      return null;
    };
  }

}
