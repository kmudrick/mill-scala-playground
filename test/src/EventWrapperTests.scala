package eventwrapper

import utest.* 

object EventWrapperTests extends TestSuite {

    val tests = TestSuite {

        test("construction") {
            val event = EventWrapper(
                data = "foo"
            )
            assert(event.data == "foo")
        }
    }
}