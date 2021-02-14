import pandas as pd
import matplotlib.pyplot as plt

# Opening csv file
data = pd.read_csv("activity.csv")

# C. Inputting missing values
# 1. Calc. and report total number of missing values
# 2. Devise strat for filling in missing values
# 3. Create new dataset that's equal to original dataset but with filled in missing data
# 4. Make histogram of total no. of steps taken each day and
#    calc. and report the mean and median total no. of steps taken per day

# Calculating and reporting total missing values
print("Total number of missing values: " + str(data["steps"].isna().sum()))

# Strat -> Treat NA values as zeroes
newData = data.fillna(0)

# Checking
print("Total number of missing values: " + str(newData["steps"].isna().sum()))

# New data set with filled in missing data
days = [day for day in newData["date"].unique()]
steps = []

for i in days:
    steps.append(newData.loc[newData["date"] == i, "steps"].sum())

frame = pd.DataFrame({"Days": days, "Steps": steps})

# Plotting
graph = frame.plot.bar(x="Days", y="Steps", figsize=(12, 10)) # Figsize set to 12 x 10 inches
plt.title("Total Number of Steps Taken per Day")
plt.xlabel("Days")
plt.ylabel("Steps")
plt.show()

# Report for mean and median
print(f"\nReport:\nMean = {frame.mean().item()}\nMedian = {frame.median().item()}")
