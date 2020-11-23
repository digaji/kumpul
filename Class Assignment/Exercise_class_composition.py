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

    def __str__(self):
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

    def __str__(self):
        return f"Book[name={self.__name},{self.__author},price={self.__price},qty={self.__qty}]"

    def getAuthorName(self):
        return self.__author.getName()

    def getAuthorEmail(self):
        return self.__author.getEmail()

    def getAuthorGender(self):
        return self.__author.getGender()


radit = Author("Radit", "radit@radit.com", "m")
cinta = Book("Cinta Brontosaurus", radit, 100, 10)

print(cinta)
print(cinta.getAuthor().getName(), cinta.getAuthor().getEmail())
print(cinta.getAuthorName(), cinta.getAuthorEmail(), cinta.getAuthorGender())


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

    def __str__(self):
        return (
            f"Book[name={self.__name},"
            f"authors="
            + "{"
            + str(list(map(lambda x: str(x), self.__authors))).replace("'", "").strip("[]")
            + "]},"
            + f"price={self.__price},"
            f"qty={self.__qty}]"
        )

    def getAuthorNames(self):
        return (
            str(list(map(lambda x: x.getName(), self.__authors))).replace("'", '"').strip("[]")
        )


radit = Author("Radit", "radit@radit.com", "m")
boyke = Author("Boyke", "boyke@boyke.com", "m")
cinta = Book("Cinta Brontosaurus", [radit, boyke], 100, 10)

print(cinta)
print(cinta.getAuthorNames())
