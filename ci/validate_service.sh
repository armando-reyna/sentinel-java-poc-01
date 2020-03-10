#!/bin/bash

logfile="/home/ec2-user/ci/poc01.log"

(tail -f -n0 $logfile &) | grep -q "Tomcat started on port"

health=$(curl http://localhost:8082/actuator/health)

if [[ $health == *"UP"* ]]; then
  echo "Service is UP"
  exit 0
else
  echo "Start service failed" >&2
  exit 1
fi
