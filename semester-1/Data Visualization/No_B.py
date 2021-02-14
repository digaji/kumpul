import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# Opening csv file
data = pd.read_csv("activity.csv")

# What is the average daily activity pattern?
# 1. Make time series plot of 5-minute intervals (x) 
#    and avg. number of steps taken, averaged across all days (y)
# 2. Which 5-minute interval, on average across all days, contains max number of steps?

# Separate interval and mean total steps every 5 minutes per day into 2 lists
interval = [interval for interval in data["interval"].unique()]
steps = [] # Will be averaged data

for i in interval:
    steps.append(data.loc[data["interval"] == i, "steps"].dropna().mean())

# Dataframe for plotting
frame = pd.DataFrame({"Interval": interval, "Steps": steps})

# Plotting
frame.plot.line(x="Interval", y="Steps", figsize=(12, 10)) # Figsize set to 12 x 10 inches
plt.title("Average number of steps in 5-minute intervals")
plt.xlabel("Interval")
plt.ylabel("Average steps")
plt.xticks(np.linspace(0, 2355, 20)) # 20 step intervals max visible with predetermined figsize
plt.show()

# Determining interval with max average
print(f"Interval with the max avg. steps is {interval[steps.index(max(steps))]}")
