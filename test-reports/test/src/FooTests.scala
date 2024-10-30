package foo

import zio.test._

object FooTests extends ZIOSpecDefault {

    def spec = suite("Foo")(
        test("construction") {
            val f = Foo(id = "123", data = "bar")
            assertTrue(
                "123".equals(f.id)
            )
            assertTrue(
                "bar".equals(f.data)
            )
        }
    )

}