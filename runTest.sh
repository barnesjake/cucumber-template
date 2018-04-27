#! /bin/sh

#############################################
## Add the browser name, i.e. chromeDriver ##
#############################################

driverPath=/usr/local/bin/driverLocation
sbt -Denvironment=local -Dbrowser=browsgit staerName -Dwebdriver.chrome.driver=${driverPath} clean 'test-only runners.runner'