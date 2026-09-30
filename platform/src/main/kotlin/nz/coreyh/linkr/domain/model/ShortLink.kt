package nz.coreyh.linkr.domain.model

import kotlin.time.Instant

data class ShortLink(
    val code: ShortCode,
    val target: TargetUrl,
    val createdAt: Instant,
    val expiresAt: Instant? = null,
) {
    fun isExpiredAt(now: Instant): Boolean = expiresAt != null && now >= expiresAt
}
