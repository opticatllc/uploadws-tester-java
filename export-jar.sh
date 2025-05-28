#!/bin/bash

DEST_DIR="dist"
mkdir -p "$DEST_DIR"

JAR_FILE=$(find target -name "*jar-with-dependencies.jar" | head -n 1)

if [ -z "$JAR_FILE" ]; then
  echo "*-jar-with-dependencies.jar not existing in target/"
  exit 1
fi

cp "$JAR_FILE" "$DEST_DIR/"
echo "*-jar-with-dependencies.jar successfully exported to $DEST_DIR/: $(basename "$JAR_FILE")"
