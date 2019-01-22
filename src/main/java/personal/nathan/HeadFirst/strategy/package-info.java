/**
 * Created by za-zhangwei002 on 2019/1/21.
 */
package personal.nathan.HeadFirst.strategy;
/**
 *  鸭子模型，主要用到了策略模式，以及一些设计原则。
 *
 *  fly和quack，可以看成是算法族，实现类是算法实现。
 *
 *  duck依赖了FlyBehavior和QuackBehavior，没有直接依赖实现类，这样可以避免因为依赖类的实现改动而改变。
 *  【面向接口编程】
 *
 *
 *
 *
 *
 */
