package nz.coreyh.linkr.application.port.out

import nz.coreyh.linkr.domain.model.ShortCode
import nz.coreyh.linkr.domain.model.TargetUrl

interface ShortCodeGenerator {
    /**
     * [attempt] increases on each retry within one shorten call, so
     * deterministic strategies can vary their output.
     */
    fun generate(
        target: TargetUrl,
        attempt: Int = 0,
    ): ShortCode
}
