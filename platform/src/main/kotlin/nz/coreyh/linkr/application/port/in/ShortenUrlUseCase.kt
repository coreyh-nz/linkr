package nz.coreyh.linkr.application.port.`in`

import nz.coreyh.linkr.application.port.`in`.command.ShortenUrlCommand
import nz.coreyh.linkr.application.port.`in`.result.ShortenUrlResult

interface ShortenUrlUseCase {
    /**
     * A caller-supplied custom code is never retried; generated codes are
     * retried on collision.
     */
    fun shorten(command: ShortenUrlCommand): ShortenUrlResult
}
