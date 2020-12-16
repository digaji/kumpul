import pandas as pd
import matplotlib.pyplot as plt

# Opening csv file
data = pd.read_csv("activity.csv")

# What is the mean total number of steps taken per day?
# Ignore NA
# 1. Calc. total number of steps taken per day
# 2. Histogram the results
# 3. Calc. and report the mean and median

# Separate days and total steps per day into 2 lists
days = [day for day in data["date"].unique()]
steps = []

for i in days:
    steps.append(data.loc[data["date"] == i, "steps"].dropna().sum())

# Dataframe for plotting
frame = pd.DataFrame({"Days": days, "Steps": steps})

# Plotting
graph = frame.plot.bar(x="Days", y="Steps", figsize=(12, 10)) # Figsize set to 12 x 10 inches
plt.title("Total Number of Steps Taken per Day")
plt.xlabel("Days")
plt.ylabel("Steps")
plt.show()

# Report for mean and median
print(f"Report:\nMean = {frame.mean().item()}\nMedian = {frame.median().item()}")
