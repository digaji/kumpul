# Lambda func to extract year, month, date, and time
import datetime
rightNow = datetime.datetime.now()

def extract(y):
    year = lambda x: x.year
    month = lambda x: x.month
    date = lambda x: x.day
    time = lambda x: x.time()
    print("Year: {}, Month: {}, Date: {}, Time: {}".format(year(y), month(y), date(y), time(y)))

extract(rightNow)