plugins {
	java
}

repositories {
	mavenCentral()
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter:5.11.1")
	testImplementation("org.assertj:assertj-core:3.26.3")
}

tasks.named<Test>("test") {
	useJUnitPlatform()
}