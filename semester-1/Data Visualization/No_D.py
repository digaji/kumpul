import pandas as pd
import matplotlib.pyplot as plt
import datetime
import numpy as np

# Opening csv file
data = pd.read_csv("activity.csv")

# D. Are there differences in activity patterns between weekdays and weekends?
# 1. Create a new factor var in the dataset - "weekday" and "weekend"
#    indicating whether a given date is a weekday or weekend
# 2. Make a plot containing time series plot of 5-minute intervals (x)
#    and avg. number of steps taken, averaged across all weekdays or weekend days (y)

# Append weekdays and weekends into 1 list
weekdates = []

for i in data["date"]:
    if datetime.datetime.strptime(i, r"%Y-%m-%d").weekday() in range(5): # 0 - 4 are weekdays in this format
        weekdates.append("Weekday")
    else:
        weekdates.append("Weekend")

# New factor variable in the dataset
data["day"] = weekdates

# Separate interval and mean total steps every 5 minutes per weekday and weekend into lists
interval = [interval for interval in data["interval"].unique()]
stepsWeekday = [] # Will be averaged data
stepsWeekend = [] # Will be averaged data

for i in interval:
    stepsWeekday.append(data.loc[(data["interval"] == i) & (data["day"] == "Weekday"), "steps"].dropna().mean())
    stepsWeekend.append(data.loc[(data["interval"] == i) & (data["day"] == "Weekend"), "steps"].dropna().mean())

frame = pd.DataFrame({"Interval": interval, "Weekday": stepsWeekday, "Weekend": stepsWeekend})

# Plotting
frame.plot.line(x="Interval", figsize=(12, 10)) # Figsize set to 12 x 10 inches
plt.title("Average number of steps in 5-minute intervals")
plt.xlabel("Interval")
plt.ylabel("Average steps")
plt.xticks(np.linspace(0, 2355, 20)) # 20 step intervals max visible with predetermined figsize
plt.show()
