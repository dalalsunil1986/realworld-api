object Version {
  const val arrow = "0.9.0"
  const val flyway = "6.0.1"
  const val jacksonKotlin =  "2.9.9"
  const val jasypt = "1.9.3"
  const val java = "1.8"
  const val jaxb = "2.3.1"
  const val jjwt = "0.9.1"
  const val kotlin = "1.3.50"
  const val ktlint = "0.34.2"
  const val ktlintPlugin = "8.2.0"
  const val restAssured = "4.1.1"
  const val slugify = "2.4"
  const val springBoot = "2.1.8.RELEASE"
  const val versionsPlugin = "0.24.0"
}

object Libs {
  const val arrowCoreData = "io.arrow-kt:arrow-core-data:${Version.arrow}"
  const val arrowCoreExt = "io.arrow-kt:arrow-core-extensions:${Version.arrow}"
  const val arrowEffectsData = "io.arrow-kt:arrow-effects-data:${Version.arrow}"
  const val arrowEffectsExt = "io.arrow-kt:arrow-effects-extensions:${Version.arrow}"
  const val arrowEffectsExtIO = "io.arrow-kt:arrow-effects-io-extensions:${Version.arrow}"
  const val arrowExtrasData = "io.arrow-kt:arrow-extras-data:${Version.arrow}"
  const val arrowExtrasExt = "io.arrow-kt:arrow-extras-extensions:${Version.arrow}"
  const val arrowSyntax = "io.arrow-kt:arrow-syntax:${Version.arrow}"
  const val arrowTypeclasses = "io.arrow-kt:arrow-typeclasses:${Version.arrow}"
  const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Version.jacksonKotlin}"
  const val jasypt = "org.jasypt:jasypt:${Version.jasypt}"
  const val jaxb = "javax.xml.bind:jaxb-api:${Version.jaxb}"
  const val jjwt = "io.jsonwebtoken:jjwt:${Version.jjwt}"
  const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api"
  const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine"
  const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlin}"
  const val kotlinStd = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"
  const val postgresql = "org.postgresql:postgresql"
  const val restassured = "io.rest-assured:rest-assured"
  const val slugify = "com.github.slugify:slugify:${Version.slugify}"
}

object Starters {
  const val actuator = "org.springframework.boot:spring-boot-starter-actuator"
  const val jdbc = "org.springframework.boot:spring-boot-starter-jdbc"
  const val test = "org.springframework.boot:spring-boot-starter-test"
  const val undertow = "org.springframework.boot:spring-boot-starter-undertow"
  const val web = "org.springframework.boot:spring-boot-starter-web"
}

const val implementation = "implementation"
const val testImplementation = "testImplementation"
const val runtime = "runtime"
