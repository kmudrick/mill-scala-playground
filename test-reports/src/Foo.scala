package foo

final case class Foo[T](
    id: String,
    data: T
)