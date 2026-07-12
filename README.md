# Zyper Encryption
 
A simple Java console application that encrypts and decrypts text using a custom, self-designed cipher. It combines numeric shifting, position shuffling, and XOR obfuscation, with the final output encoded in Base64.
 
 
## Features
 
- Encrypt any input text from the console
- Decrypt previously encrypted text using its generated key
- Simple interactive menu (Encrypt / Decrypt / Exit)
- Output encoded in Base64 for easy copy-pasting
 
## How It Works
 
Encryption happens in three stages:
 
1. **Key generation** — the longest word in the input text is used to determine the key length; a random key (values 1–26) is generated from it.
2. **Shift + Shuffle** — each character's numeric (ASCII) value is shifted using the key, then the resulting sequence is cyclically shuffled based on the first key value.
3. **XOR pass** — the shuffled values are XOR-ed against the key for an extra layer of obfuscation.
 
The final byte sequence and the key are both Base64-encoded and printed to the console. Decryption reverses these three steps in order, using the same key.
 
## Project Structure
 
```
untitled/
└── src/
    ├── input.java          # Main entry point — CLI menu
    ├── Zyper.java           # Handles encryption logic
    ├── ZyperDecript.java     # Handles decryption logic
    ├── Keycounter.java       # Generates the encryption key
    ├── ShaffleSt2.java       # Shuffles encrypted values
    ├── stringTOint.java      # Converts string -> int array (char codes)
    ├── IntToString.java      # Converts int array -> string
    └── IntToByte.java        # Converts between int[] and byte[]
```
 
## Requirements
 
- Java JDK 8 or later
 
 
 
