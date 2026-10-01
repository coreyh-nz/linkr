package nz.coreyh.linkr.application.port.out

import kotlin.time.Instant

/** Current time, behind an interface so tests can control it. */
interface ClockPort {
    fun now(): Instant
}
