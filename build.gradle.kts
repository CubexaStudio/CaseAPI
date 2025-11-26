plugins {
    id("java")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

group = "net.cubexa.caseapi"
version = "1.0.2"

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
    compileTestJava {
        options.encoding = "UTF-8"
    }
    javadoc {
        options.encoding = "UTF-8"
    }
}

tasks {
    jar {
        archiveFileName.set("CaseAPI-${version}.jar")
    }
}