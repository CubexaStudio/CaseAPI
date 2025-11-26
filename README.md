# CaseAPI

![Version](https://img.shields.io/badge/version-1.0.0-blue)
[![License: GPL v3](https://img.shields.io/badge/license-GPLv3-blue)](./LICENSE)

CaseAPI is a lightweight API designed to integrate seamlessly with the CaseOpening plugin. It allows other plugins to interact with cases, track statistics, and extend functionality. <br>
This API requires the CaseOpening plugin to be installed and running.

---

## 🔧 Installation

### **Maven**
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.cubexastudio</groupId>
    <artifactId>CaseAPI</artifactId>
    <version>1.0.0</version>
    <scope>provided</scope>
</dependency>
```

### **Gradle (Kotlin DSL)**
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("com.github.cubexastudio:CaseAPI:1.0.0")
}
```

---

## 📘 Documentation & Help

All documentation, including setup guides, API references, and configuration examples, can be found here:

➡️ **[View the Docs](https://cubexa.gitbook.io/docs/caseapi)**

If you need help or want to connect with the community, feel free to join the Discord server:

➡️ **[Join the Discord](https://discord.com/invite/pq7JnGbgJF)**

---

## ❤️ Contributing

Pull requests are welcome! Please refer to the [CONTRIBUTING GUIDELINES](./CONTRIBUTING.md) for a guide.

---

## 📄 License

This project is licensed under the **GNU General Public License v3 (GPLv3)**.

You are free to use, modify, and distribute this software.  
If you distribute this software, whether modified or unmodified (even the same version), you must also release it under the **GPLv3** License.

Please refer to the [LICENSE](./LICENSE) file for the full terms.