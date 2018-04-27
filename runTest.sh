#! /bin/sh

#############################################
## Add the browser name, i.e. chromeDriver ##
#############################################

driverPath=/usr/local/bin/driverLocation
sbt -Denvironment=local -Dbrowser=browserName -Dwebdriver.chrome.driver=${driverPath} clean 'test-only runners.runner'