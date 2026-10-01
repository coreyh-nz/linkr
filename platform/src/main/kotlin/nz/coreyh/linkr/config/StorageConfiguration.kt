package nz.coreyh.linkr.config

import io.github.oshai.kotlinlogging.KotlinLogging
import nz.coreyh.linkr.adapter.out.persistence.InMemoryLinkRepositoryAdapter
import nz.coreyh.linkr.application.port.out.LinkRepository
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

private val logger = KotlinLogging.logger {}

/** Uses the in-memory store unless `linkr.storage` is set to another value. */
@Configuration
class StorageConfiguration {
    @Bean
    @ConditionalOnProperty(prefix = "linkr", name = ["storage"], havingValue = "inmemory", matchIfMissing = true)
    fun inMemoryLinkRepository(): LinkRepository {
        logger.debug { "Registering LinkRepository -> InMemoryLinkRepositoryAdapter" }
        return InMemoryLinkRepositoryAdapter()
    }
}
