#!/bin/bash

while true
do
    echo "Making curl request..."
    result=$(curl -sS http://10.200.10.162:30000/hash)
    echo "Curl Response:"
    echo "$result"
#    sleep 1  # Adjust the interval between requests as needed
done
