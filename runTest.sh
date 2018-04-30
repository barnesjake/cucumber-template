#! /bin/sh

#############################################
## Add the browser name, i.e. chromeDriver ##
#############################################

driver_path=/usr/local/bin/chromedriver
sbt -Denvironment=local -Dbrowser=chrome -Dwebdriver.chrome.driver=${driver_path} clean test