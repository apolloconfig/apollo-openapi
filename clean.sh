#!/bin/bash
set -e
SPRING_BOOT2_DIR="spring-boot2"
JAVA_DIR="java"
PYTHON_DIR="python"
RUST_DIR="rust"
TS_DIR="typescript"


echo "🧹 Cleaning old generated SDKs..."
rm -rf "$JAVA_DIR"
rm -rf "$PYTHON_DIR"
rm -rf "$RUST_DIR"
rm -rf "$TS_DIR"
rm -rf "$SPRING_BOOT2_DIR"
