"""
    Copyright 2019 Samsung SDS

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

from brightics.function.extraction.bucketizer import bucketizer
from brightics.common.datasets import load_iris
import unittest
import pandas as pd
import numpy as np
import HtmlTestRunner
import os


class Bucketizer(unittest.TestCase):
    
    def setUp(self):
        print("*** Bucketizer UnitTest Start ***")
        self.testdata = load_iris()

    def tearDown(self):
        print("*** Bucketizer UnitTest End ***")
    
    def test(self):
        result = bucketizer(self.testdata, input_cols='sepal_length', radio_splits='merong', splits_from=0, splits_to=10, splits_by=0.1, new_name='prediction')['out_table']
        np.testing.assert_array_almost_equal(result.prediction[:5], [52.0000000000 , 50.0000000000 , 48.0000000000 , 47.0000000000 , 51.0000000000] , 10)


if __name__ == '__main__':
    filepath = os.path.dirname(os.path.abspath(__file__))
    reportFoler = filepath + "/../../../../../../../reports"
    unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner(combine_reports=True, output=reportFoler))
