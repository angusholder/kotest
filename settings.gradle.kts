enableFeaturePreview("GRADLE_METADATA")

include("kotest-fp")
include("kotest-mpp")
include("kotest-core")
include("kotest-assertions:kotest-assertions-shared")
include("kotest-assertions:kotest-assertions-core")
include("kotest-assertions:kotest-assertions-arrow")
include("kotest-assertions:kotest-assertions-json")
include("kotest-assertions:kotest-assertions-ktor")
include("kotest-assertions:kotest-assertions-jsoup")
include("kotest-assertions:kotest-assertions-konform")
include("kotest-assertions:kotest-assertions-compiler")
include("kotest-assertions:kotest-assertions-klock")
include("kotest-assertions:kotest-assertions-sql")
include("kotest-property")
include("kotest-property:kotest-property-arrow")
include("kotest-runner:kotest-runner-console")
include("kotest-runner:kotest-runner-junit5")
include("kotest-runner:kotest-runner-junit4")
include("kotest-engine")
include("kotest-extensions")
include("kotest-extensions:kotest-extensions-allure")
include("kotest-extensions:kotest-extensions-http")
include("kotest-extensions:kotest-extensions-junitxml")
include("kotest-extensions:kotest-extensions-koin")
include("kotest-extensions:kotest-extensions-mockserver")
include("kotest-extensions:kotest-extensions-spring")
include("kotest-plugins:kotest-plugins-pitest")
include("kotest-tests:kotest-tests-framework")
include("kotest-tests:kotest-tests-timeout")
include("kotest-tests:kotest-tests-projectlistener")
include("kotest-tests:kotest-tests-autoscan")
include("kotest-tests:kotest-tests-junitxml")
include("kotest-tests:kotest-tests-parallelism")
include("kotest-examples:kotest-examples-javascript")
include("kotest-examples:kotest-examples-jvm")
include("kotest-examples:kotest-examples-allure")
