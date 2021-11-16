# Lecture 3 : References, Recursion, and Lists

## 1. Primitive type

### 基本运算符

* **Def**: Primitive types are the most basic data types available within the Java language. 
* There are 8: **boolean , byte , char , short , int , long , float and double **.( These types serve as the building blocks of data manipulation in Java. )

### Golden Rule of Equals(= 赋值运算)

* Given y and x => 

  ​	y =x **copies** all the bits from x into y<img src="/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-16 上午8.05.01.png" alt="截屏2021-11-16 上午8.05.01" style="zoom:33%;" />

 

## 2. Reference Types

* **Def** : Excluded primitive types, everything else is **reference type**
* **Reference Types Obey the Golden Rule of Equals**:
  * Just as with primitive types, the equals sign copies the bits 

## 3. Parameter Passing

* **pass by value**: In java, we always pass by value (i.e. copy the bits)

![截屏2021-11-16 上午9.45.39](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-16 上午9.45.39.png)

* pass by value, 所以并不是改变指针的位置，而是直接复制了main x,y的值给了average x,y
* ![截屏2021-11-16 上午9.48.45](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-16 上午9.48.45.png)

***

## 4. Instantiating Arrays

![截屏2021-11-16 上午10.02.07](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-16 上午10.02.07.png)

![截屏2021-11-16 上午10.03.13](/Users/tomas/Library/Application Support/typora-user-images/截屏2021-11-16 上午10.03.13.png)

