#!/bin/bash
SERVICE_NAME=danpaopin
export APP_NAME=$SERVICE_NAME
if [[ -z "$JAVA_HOME" && -d /usr/java/latest/ ]]; then
    export JAVA_HOME=/usr/java/latest/
fi

cd `dirname $0`/..

if [[ ! -f $SERVICE_NAME".war" && -d current ]]; then
    cd current
fi

if [[ -f $SERVICE_NAME".war" ]]; then
  chmod a+x $SERVICE_NAME".war"
  ./$SERVICE_NAME".war" stop
fi
