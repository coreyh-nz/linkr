package nz.coreyh.linkr.application.port.`in`

import nz.coreyh.linkr.application.port.`in`.result.ResolveLinkResult

interface ResolveLinkUseCase {
    fun resolve(rawCode: String): ResolveLinkResult
}
