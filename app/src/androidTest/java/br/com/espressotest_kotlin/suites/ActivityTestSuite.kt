package br.com.espressotest_kotlin.suites

import br.com.espressotest_kotlin.activity.MainActivityTest
import br.com.espressotest_kotlin.activity.SecondaryActivityTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * @author RubioAlves
 * Created 12/07/2021 at 10:57
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(MainActivityTest::class,SecondaryActivityTest::class)
class ActivityTestSuite