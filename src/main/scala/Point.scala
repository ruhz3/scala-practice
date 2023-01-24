class Point(a:Int, b:Int) {
  val x: Int = a
  val y: Int = b

  override def equals(other:Any) = other match {
    case that: Point => this.x == that.x && this.y == that.y
    case _ => false
  }
}

