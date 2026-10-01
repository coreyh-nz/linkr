package nz.coreyh.linkr.application.port.`in`

import nz.coreyh.linkr.application.port.`in`.result.DeleteLinkResult

interface DeleteLinkUseCase {
    fun delete(rawCode: String): DeleteLinkResult
}
