class Author:
    def __init__(self, name, email, gender):
        self.__name = name
        self.__email = email
        self.__gender = gender
        if gender != "m" and gender != "f":
            raise ValueError

    def getName(self):
        return self.__name

    def getEmail(self):
        return self.__email

    def setEmail(self, email):
        self.__email = email

    def getGender(self):
        return self.__gender

    def toString(self):
        return f"Author[name={self.__name},email={self.__email},gender={self.__gender}]"


class Book:
    def __init__(self, name, author, price, qty=0):
        self.__name = name
        self.__author = author
        self.__price = price
        self.__qty = qty

    def getName(self):
        return self.__name

    def getAuthor(self):
        return self.__author

    def getPrice(self):
        return self.__price

    def setPrice(self, price):
        self.__price = price

    def getQty(self):
        return self.__qty

    def setQty(self, qty):
        self.__qty = qty

    def toString(self):
        return f"Book[name={self.__name},{self.__author.toString()},price={self.__price},qty={self.__qty}]"

    def getAuthorName(self):
        return self.__author.getName()

    def getAuthorEmail(self):
        return self.__author.getEmail()

    def getAuthorGender(self):
        return self.__author.getGender()


# radit = Author("Radit", "radit@radit.com", "m")
# cinta = Book("Cinta Brontosaurus", radit, 100, 10)

# print(cinta.toString())
# print(cinta.getAuthor().getName(), cinta.getAuthor().getEmail())
# print(cinta.getAuthorName(), cinta.getAuthorEmail(), cinta.getAuthorGender())


class Book:
    def __init__(self, name, authors, price, qty=0):
        self.__name = name
        self.__authors = authors
        self.__price = price
        self.__qty = qty

    def getName(self):
        return self.__name

    def getAuthors(self):
        return self.__authors

    def getPrice(self):
        return self.__price

    def setPrice(self, price):
        self.__price = price

    def getQty(self):
        return self.__qty

    def setQty(self, qty):
        self.__qty = qty

    def toString(self):
        return (
            f"Book[name={self.__name},"
            "authors="
            "{"
            + str(list(x.toString() for x in self.__authors)).replace("'", "").strip("[]")
            + "]},"
            f"price={self.__price},"
            f"qty={self.__qty}]"
        )

    def getAuthorNames(self):
        return (
            str(list(x.getName() for x in self.__authors)).replace("'", "").replace(" ", "").strip("[]")
        )


# radit = Author("Radit", "radit@radit.com", "m")
# boyke = Author("Boyke", "boyke@boyke.com", "m")
# cinta = Book("Cinta Brontosaurus", [radit, boyke], 100, 10)

# print(cinta.toString())
# print(cinta.getAuthorNames())

import unittest

class TestBook(unittest.TestCase):
    def setUp(self):
        self.radit = Author("Radit", "radit@radit.com", "m")
        self.boyke = Author("Boyke", "boyke@boyke.com", "m")
        self.cinta = Book("Cinta Brontosaurus", [self.radit, self.boyke], 100, 10)

    def test_getName(self):
        self.assertEqual(self.cinta.getName(), "Cinta Brontosaurus")

    def test_getAuthors(self):
        self.assertEqual(self.cinta.getAuthors(), [self.radit, self.boyke])

    def test_getPrice(self):
        self.assertEqual(self.cinta.getPrice(), 100)

    def test_setPrice(self):
        self.cinta.setPrice(80)
        self.assertEqual(self.cinta.getPrice(), 80)

    def test_getQty(self):
        self.assertEqual(self.cinta.getQty(), 10)

    def test_setQty(self):
        self.cinta.setQty(5)
        self.assertEqual(self.cinta.getQty(), 5)

    def test_toString(self):
        self.assertEqual(self.cinta.toString(), 
        "Book[name=Cinta Brontosaurus,"
        "authors={Author[name=Radit,email=radit@radit.com,gender=m], Author[name=Boyke,email=boyke@boyke.com,gender=m]},"
        "price=100,qty=10]")

    def test_getAuthorNames(self):
        self.assertEqual(self.cinta.getAuthorNames(), "Radit,Boyke")


if __name__ == "__main__":
    unittest.main()
