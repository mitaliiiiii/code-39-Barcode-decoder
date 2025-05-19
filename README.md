# Code 39 Barcode Decoder (Java + ZXing)

A lightweight Java application that uses the ZXing ("Zebra Crossing") library to decode Code 39 barcodes from images. Ideal for integration into backend systems, desktop applications, or learning purposes.

## 🚀 Features

- 📦 Supports decoding of **Code 39** barcode format.
- 🖼️ Accepts image files as input (`.png`, `.jpg`, `.jpeg`, etc.)
- ⚡ Fast and efficient decoding using ZXing.
- 🧩 Easy to integrate with other Java projects.
- 🧪 Simple CLI and code structure for quick testing.

## 🛠️ Technologies Used

- **Java**
- **ZXing Core Library** (https://github.com/zxing/zxing)
- Optional: **Maven** or **Gradle** for dependency management.

## 📥 Installation

### Clone the Repository

```bash
git clone https://github.com/mitaliiiiii/code-39-Barcode-decoder.git
cd code39-barcode-decoder
javac -cp "lib/*" -d bin src/Code39BarcodeDecoder.java - //compilation
//echo "test img/barcode.png" | java -cp "lib/*;bin" Code39BarcodeDecoder-- if you are in windows
//echo "test img/barcode.png" | java -cp "lib/*:bin" Code39BarcodeDecoder-- if you are in mac or linux
