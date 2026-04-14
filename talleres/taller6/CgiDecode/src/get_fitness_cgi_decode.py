from typing import List

from src.evaluate_condition import clear_maps


def get_fitness_cgi_decode(test_suite: List[str]) -> float:
    # Borro la información de branch coverage de ejecuciones anteriores
    # Recuerden que los diccionarios true_distances y false_distances son globales
    clear_maps()

    fitness = 0
    # TODO: COMPLETAR
    return 0
