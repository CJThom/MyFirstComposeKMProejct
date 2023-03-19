import com.example.core.presentation.di.corePresentationModule
import com.example.data.common.di.coreDataModule
import com.example.domain.common.di.coreDomainModule
import org.koin.core.module.Module

fun coreModule(): List<Module> = listOf(
    coreDataModule(),
    coreDomainModule(),
    corePresentationModule()
).flatten()