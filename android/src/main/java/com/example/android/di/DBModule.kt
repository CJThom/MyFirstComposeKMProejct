package com.example.android.di


//@Module
//@InstallIn(SingletonComponent::class)
//internal object DatabaseModule {
//
//    @Provides
//    @Singleton
//    fun provideDatabase(
//        @ApplicationContext context: Context,
//    ): Database {
//        val SQLDriverFactory = SQLDriverFactory(context)
//        val sqlDriver: SqlDriver = SQLDriverFactory.createDriver()
//
//        return Database(sqlDriver)
//
//    }
//
//}
//@ComponentScan("com.example.helloworldkmp.android")
//@Module
//@ComponentScan("com.example.android")
//class AndroidModule