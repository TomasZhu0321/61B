

# 1. Java Programming Principles

###Variables

1. Before java variables can be used, they must be declared.

2. Java variables must have a specific type
3. Java variable types can never change
4. ==!!== Types are verified **before** the code even runs!

###Functions

1. Functions must be declared as part of a class in Java.

   A function that is part of a class is called a "method"

   So in Java, all functions are methods

2. To define a function in Java, we use "public static".

   We will use alternative ways of defining functions later.

3. All parameters of a function must have a declared type, and the **return** value of the function must have a declared type.
4. Functions in Java only return only one value!

5./** */ 注释

###Java

* Java is an object oriented language with strict requirements:
  * Every java file must contain a class declaration.
  * All code lives inside a class, even helper functions (a function that performs part of the computation of another function.), global constants , etc.
  * To run a Java program, you typically define a main method using `public static void main(String[] args)`
* Java is statically typed!

***

## Reading 1.1

-**Executing java in the terminal**

* The process 

![截屏2021-10-31 下午2.27.01](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-10-31 下午2.27.01.png)

​	通过`javac`先在终端编译 Hello.class 文件，然后 然后通过` java`进行运行

​	->*Why make a **class** at all?*

​		1..class file has been type checked. Distributed code is safer

​		2..class files are 'simpler' for machine to execute. 

​		3.Protects your intellectual property.No need to give out source

* `cat`: `cat HelloWorld.java` 能够直接在终端显示java程序
* 输入名字`+tab`能够自动生成名字

**-static typing**

* all variables and expressions have a so-called `static type`
* Java variables only contain values of that type, which can never change

***

# Lecture 2.Defining and Using Classes

##1. Method

1. Every method is associated with some class
2. To run a class, we must define a main method
   * Not all classes have a main method!

## 2. Object instantiation

1. Classes can contain not just methods, but also data
2. Claasses can be instantiated as objects:
   * We'll create a single Dog class, and then create instances(*These instances are also called 'objects'*) of this Dog.
   * The class provides a blueprint that all Dog objects will follow.

## 3. Defining a Typical Class (Terminology)

![截屏2021-11-02 下午7.31.44](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-02 下午7.31.44.png)

* 如果method中需要用到instance variable, 就需要non-static
* instructor的作用是可以直接在 main method中可以通过parameters 直接invoke

![截屏2021-11-02 下午7.44.23](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-02 下午7.44.23.png)

***

## 4. Arrays of Objects

To create an array of objects:

* First use the **new **keyword to create the array
* Then use **new** again for each object that you want to put in the array

![截屏2021-11-02 下午7.50.40](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-02 下午7.50.40.png)

***

## 5. Static vs. Non-static

![截屏2021-11-02 下午7.54.53](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-02 下午7.54.53.png)

1. **static method**

   * 引用里面的子method只能使用class name
   * 不需要在main函数创建对象，直接调用

2. **non-static**

   * 引用里面的子method需要初始化成具体的instance，然后通过instance引用
   * Non-static的method可以调用 class 下面 instance variables

3. Static method：

   * main 

     ![截屏2021-11-02 下午10.55.43](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-02 下午10.55.43.png)

   * Dog method

     ![截屏2021-11-02 下午10.56.33](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-02 下午10.56.33.png)

   * Non-static method:

     ![截屏2021-11-02 下午10.58.22](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-02 下午10.58.22.png)

![截屏2021-11-02 下午10.58.51](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-02 下午10.58.51.png)

![截屏2021-11-15 下午12.19.34](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-15 下午12.19.34.png)

![截屏2021-11-15 下午12.21.34](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-15 下午12.21.34.png)

***

 

