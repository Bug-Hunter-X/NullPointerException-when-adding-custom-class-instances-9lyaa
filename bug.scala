```scala
class MyClass(val value: Int) {
  def add(other: MyClass): MyClass = {
    new MyClass(this.value + other.value) 
  }
}

object Main extends App {
  val obj1 = new MyClass(5)
  val obj2 = new MyClass(10)
  val obj3 = obj1.add(obj2) 
  println(obj3.value) // Output: 15

  // This will throw a NullPointerException because obj4 is null
  val obj4: MyClass = null 
  val obj5 = obj1.add(obj4) //Throws NullPointerException
  println(obj5.value)
}
```