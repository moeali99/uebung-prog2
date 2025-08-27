# Makefile für C-Übungen
CC = gcc
CFLAGS = -Wall -Wextra -std=c99

# Standardziel
all: hello

# Hello World Programm
hello: hello.c
	$(CC) $(CFLAGS) -o hello hello.c

# Aufräumen
clean:
	rm -f hello

# Hilfe anzeigen
help:
	@echo "Verfügbare Ziele:"
	@echo "  all     - Kompiliert alle C-Programme"
	@echo "  clean   - Löscht alle kompilierten Programme"
	@echo "  help    - Zeigt diese Hilfe an"

.PHONY: all clean help
