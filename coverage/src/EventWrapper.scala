package eventwrapper

import java.util.UUID

type SpecVersion = "1.0"

final case class EventWrapper[T](
    id: UUID = UUID.randomUUID,
    specversion: SpecVersion = "1.0",
    data: T
)

object EventWrapper:
    def createId(): UUID = UUID.randomUUID