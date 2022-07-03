import pytest
a=20
b=10

def test_addition():
    "Addition test"
    a =20
    b=10
    x = a+b 
    assert x

def test_add():
  a =30
  b=10
  x = a+b 
  assert x

@pytest.mark.activity
def test_substraction():
    "Substraction test"
    a =20
    b=10
    diff = a-b
    assert diff

@pytest.mark.activity
def test_product():
    "Multify test"
    a =20
    b=10 
    multipy = a*b
    assert multipy

def test_division():
    "Division test"
    a=20
    b=10
    z =a/b
    assert z
