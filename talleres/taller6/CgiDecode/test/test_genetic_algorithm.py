#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):
    def test1(self):
        # TODO COMPLETAR
        seed(1)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(True, False)

    def test2(self):
        # TODO COMPLETAR
        pass

    def test3(self):
        # TODO COMPLETAR
        pass