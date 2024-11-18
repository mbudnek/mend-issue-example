This repo demonstrates how we structure many of our Gradle based projects.

* All dependencies are defined in gradle/libs.gradle
* app/build.gradle and main/build.gradle both reference the list of dependencies declared in gradle/libs.gradle

Because of this structure, Mend will not trigger a repository scan when dependencies are updated, since "libs.gradle" isn't one of the pre-defined files that trigger a scan on change.
