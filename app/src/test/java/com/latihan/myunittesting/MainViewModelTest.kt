package com.latihan.myunittesting

import junit.framework.TestCase
import org.junit.Before
import org.mockito.Mockito.mock

class MainViewModelTest : TestCase() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var cuboidModel: CuboidModel

    private val dummyLength = 12.0
    private val dummyWidth = 7.0
    private val dummyHeight = 6.0

    private val dummyVolume = 500.0

    @Before
    fun before(){
        cuboidModel = mock(CuboidModel::class.java)
        mainViewModel = MainViewModel(cuboidModel)
    }


    fun testGetCircumference() {}

    fun testGetSurfaceArea() {}

    fun testGetVolume() {}

    fun testSave() {}
}