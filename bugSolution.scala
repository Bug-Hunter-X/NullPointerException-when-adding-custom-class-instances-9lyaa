```scala
class MyClass(val value: Int) {
  def add(other: MyClass): MyClass = {
    if (other == null) {
      this // Return the current instance if other is null
    } else {
      new MyClass(this.value + other.value)
    }
  }
}

object Main extends App {
  val obj1 = new MyClass(5)
  val obj2 = new MyClass(10)
  val obj3 = obj1.add(obj2)
  println(obj3.value) // Output: 15

  val obj4: MyClass = null
  val obj5 = obj1.add(obj4)
  println(obj5.value) // Output: 5. Now handles null correctly
}
```