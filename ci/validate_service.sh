#!/bin/bash
STATUS=$(curl http://localhost:8082/actuator/health)

if [ $STATUS -eq "{"status":"UP"}" ]
then
  echo "Service is UP"
  exit 0
else
  echo "Start service failed" >&2
  exit 1
fi