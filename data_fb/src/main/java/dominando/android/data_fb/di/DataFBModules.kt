package dominando.android.data_fb.di

import dominando.android.data.source.FbData
import dominando.android.data_fb.FbDataImpl
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object DataFBModules {

    fun load() {
        loadKoinModules(module {
            factory<FbData> { FbDataImpl() }
        })
    }
}