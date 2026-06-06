
import numpy

# Casting from a Python list
scores = numpy.array([85, 92, 78, 95, 88])

# Using the built in array creator
numpy.zeros(5)      # [0. 0. 0. 0. 0.]
numpy.ones((2, 3))  # 2x3 matrix of ones

# Random arrays
rng = numpy.random.default_rng(seed=42)
rng.random(5)
rng.integers(1, 100, size=10)

