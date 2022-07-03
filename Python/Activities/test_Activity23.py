import pytest

def test_sum(number_list):
    sum = 0
    for n in number_list:
        sum += n
    assert sum == 55