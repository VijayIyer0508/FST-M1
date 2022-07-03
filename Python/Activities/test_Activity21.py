import pytest
a=2
b=10

def test_addition():
    "Addition test"
    a =20
    b=10
    x = a+b 
    assert x


def test_substraction():
    "Substraction test"
    a =20
    b=10
    diff = a-b
    assert diff ==10

def test_product():
    "Multify test"
    a =20
    b=10 
    multipy = a*b
    assert multipy ==200

def test_division():
    "Division test"
    a=20
    b=10
    z =a/b
    assert z
