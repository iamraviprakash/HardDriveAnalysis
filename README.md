# HardDriveAnalysis

### Course: Distributed Computing

#### Introduction
> Java codes for data analytics stuffs on Hard disk data using the map-reducer algorithm with Hadoop framework.

#### Data-set Facts
 * <strong>Name</strong>: Hard Drive Test Data

 * <strong>Description</strong>: Each day, Backblaze takes a snapshot of each operational hard drive that includes basic hard drive information (e.g., capacity, failure) and S.M.A.R.T. statistics reported by each drive. This dataset contains data from the first two quarters in 2016.

 * <strong>Url</strong>: https://www.kaggle.com/backblaze/hard-drive-test-data

#### Data-set Contents
> This dataset contains basic hard drive information and 90 columns or raw and normalized values of 45 different S.M.A.R.T. statistics. Each row represents a daily snapshot of one hard drive.

+ date: Date in yyyy-mm-dd format
+ serial_number: Manufacturer-assigned serial number of the drive
+ model: Manufacturer-assigned model number of the drive
+ capacity_bytes: Drive capacity in bytes
+ failure: Contains a “0” if the drive is OK. Contains a “1” if
  this is the last day the drive was operational before failing.
+ 90 variables that begin with 'smart': Raw and Normalized values
  for 45 different SMART stats as reported by the given drive

#### Tasks
+ What is the median survival time of a hard drive w.r.t size?
+ What is the maximum survival time of a model of hard drive?
+ What is the median survival time of a model of hard drive?
+ What is the median survival time of a hard drive?
