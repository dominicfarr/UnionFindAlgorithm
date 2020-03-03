
# Coursera - Computer Science from Princeston. 
## Algorithms, Part I, Week 1


[![Build Status](https://travis-ci.com/dominicfarr/UnionFindAlgorithm.svg?branch=master)](https://travis-ci.com/dominicfarr/UnionFindAlgorithm) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=domfarr%3AUnionFindAlgorithm&metric=alert_status)](https://sonarcloud.io/dashboard?id=domfarr%3AUnionFindAlgorithm) [![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=domfarr%3AUnionFindAlgorithm&metric=sqale_index)](https://sonarcloud.io/dashboard?id=domfarr%3AUnionFindAlgorithm) [![Bugs](https://sonarcloud.io/api/project_badges/measure?project=domfarr%3AUnionFindAlgorithm&metric=bugs)](https://sonarcloud.io/dashboard?id=domfarr%3AUnionFindAlgorithm) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=domfarr%3AUnionFindAlgorithm&metric=coverage)](https://sonarcloud.io/dashboard?id=domfarr%3AUnionFindAlgorithm)


## Quick Find

Cost Model for [Quick Find](src/main/java/domfarr/QuickFind.java) is too expensive.

| Algorithm     | Initialise    | Unicon | Find |
| ------------- |:-------------:| ------:| ---- |
| Quick Find    | N             | N      | 1    |

It takes N<sup>2</sup> array accesses to process a sequence of N union commands on N objects. That is, **Quadratic** time, which does not scale. 