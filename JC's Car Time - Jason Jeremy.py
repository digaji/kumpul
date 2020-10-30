class Car:
    counter = 0
    def __init__(self, model, speed, tank_capacity, fuel_usage):
        self.model = model
        self.speed = speed
        self.tank_capacity = tank_capacity
        self.fuel_usage = fuel_usage
    
    def max_distance(self) -> float:
        km_l = 100 / self.fuel_usage
        return km_l * self.tank_capacity

    def max_duration(self) -> float:
        return (self.max_distance() / self.speed) * 60

    def is_better_than(self, other_car):
        if self.max_distance() > other_car.max_distance() and self.max_duration() > other_car.max_duration():
            return "yes"
        elif self.max_distance() > other_car.max_distance() or self.max_duration() > other_car.max_duration():
            return "maybe"
        else:
            return "no"

    def compare_cars(self, other_company):
        for car in other_company.cars:
            if self.is_better_than(car) == "yes":
                self.counter += 1
        return(f"Our car, {self.model} is better than {self.counter} out of {len(other_company.cars)} of all the cars in their company.")

class Company:
    def __init__(self, name, cars = []):
        self.name = name
        self.cars = cars


car1 = Car("Model S", 50, 37, 8.5)
car2 = Car("Model 3", 45, 40, 10.2)
car3 = Car("Model X", 55, 46, 7.9)

car4 = Car("Rock", 50, 45, 9.4)

company1 = Company("Tebsla", [car1, car2, car3])

print(car4.is_better_than(car1)) # Prints "yes"
print(car2.is_better_than(car3)) # Prints "no"
print(car1.is_better_than(car2)) # Prints "maybe"

print(car4.compare_cars(company1)) # Prints "Our car, Rock is better than 2 out of 3 of all the cars in their company."