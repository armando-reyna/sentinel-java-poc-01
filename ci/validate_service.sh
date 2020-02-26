#!/bin/bash

logfile="/home/ec2-user/ci/poc01.log"

(tail -f -n0 $logfile &) | grep -q "Started Poc01Application"

STATUS=$(curl http://localhost:8082/actuator/health)

if [[ STATUS == *"UP"* ]]; then
  echo "Service is UP"
  exit 0
else
  echo "Start service failed" >&2
  exit 1
fi
