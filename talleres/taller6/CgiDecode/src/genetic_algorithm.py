from random import random
from typing import List

from src.create_population import create_population
from src.crossover import crossover
from src.evaluate_population import evaluate_population
from src.mutate import mutate
from src.selection import selection

class GeneticAlgorithm():
    def __init__(self):
        self.population_size = 100
        self.tournament_size = 5
        self.p_crossover = 0.70
        self.p_mutation = 0.20

        self.generation = 0
        self.best_individual = None
        self.fitness_best_individual = None

    def get_best_individual(self):
        return self.best_individual
    
    def get_fitness_best_individual(self):
        return self.fitness_best_individual
    
    def get_generation(self):
        return self.generation

    def generate_crossovers(self, population: List[List[str]], fitness_by_individual: dict) -> List[List[str]]:
        # TODO COMPLETAR
        # Pista: no olvidarse de usar selection, deben crear una nueva poblacion
        return None

    def generate_mutations(self, population: List[List[str]]) -> List[List[str]]:
        # TODO COMPLETAR
        return None

    def covered_all_branches(self, fitness_individual: float) -> bool:
        # TODO COMPLETAR
        return False

    def run(self):
        # Generar y evaluar la poblacion inicial
        population = None # TODO COMPLETAR
        fitness_by_individual = None # TODO COMPLETAR

        # Imprimir el mejor valor de fitness encontrado
        self.best_individual = None # TODO COMPLETAR
        self.fitness_best_individual = None # TODO COMPLETAR

        # Continuar mientras la cantidad de generaciones es menor que 1000
        # y no haya ningun individuo que cubra todos los objetivos

        while False: # TODO COMPLETAR

            # Producir una nueva poblacion en base a la anterior.
            # Usar selection, crossover y mutation.
            new_population = None # TODO COMPLETAR

            # Una vez creada, reemplazar la poblacion anterior con la nueva
            self.generation += 1
            population = new_population

            # Evaluar la nueva poblacion e imprimir el mejor valor de fitness
            fitness_by_individual = None # TODO COMPLETAR
            self.best_individual = None # TODO COMPLETAR
            self.fitness_best_individual = None # TODO COMPLETAR

        # retornar el mejor individuo de la ultima generacion
        return self.best_individual