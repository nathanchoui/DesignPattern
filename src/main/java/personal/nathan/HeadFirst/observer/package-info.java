/**
 * Created by za-zhangwei002 on 2019/1/22.
 */
package personal.nathan.HeadFirst.observer;
/**
 * 【观察者模式】
 *  定义了对象之间的一对多依赖，这样一来，当一个对象改变时，它的所有依赖者都会收到通知并自动更新。
 *
 *  设计原则：
 *  1、为了交互对象之间松耦合设计而努力。
 *
 *  主题：此处为WeatherData类，实现subject,有一个订阅者列表，有数据更新时通知这些观察者。以及remove和register方法，以供观察者删除或者订阅主题。
 *  观察者：此处为xxxDisplay类，实现Observer。可以收到来自主题的更新信息。
 *
 *  此设计模式和MQ消息队列非常像，订阅主题的消费者可以收到更新信息，只是没有MQ的broker的概念，主题即为生产者。
 *
 *  spring事件驱动模型，是观察者模式在spring中的应用，可参考。
 *
 */
