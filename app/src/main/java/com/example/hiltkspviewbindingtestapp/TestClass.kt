package com.example.hiltkspviewbindingtestapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

class TestClass(val value: String)

@Module
@InstallIn(ActivityComponent::class)
object TestClassModule {
    @Provides
    fun provideTestClass(): TestClass = TestClass("Value from hilt module")
}
