#!/usr/bin/env sh

DIR="$(CDPATH= cd -- "$(dirname "$0")" && pwd)"
exec gradle -p "$DIR" "$@"
