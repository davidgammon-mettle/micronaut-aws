plugins {
    id("io.micronaut.build.internal.aws-module")
}

dependencies {
    api(mn.micronaut.function)
    api(libs.managed.aws.lambda.core)
    implementation(mn.micronaut.json.core)
    testImplementation(mnMongo.micronaut.mongo.sync)
    testImplementation(platform(libs.testcontainers.bom))
    testImplementation(libs.testcontainers.spock)
    testImplementation(libs.testcontainers.mongodb)
    testImplementation(libs.testcontainers)
    testImplementation(projects.micronautAwsLambdaEventsSerde)
    testImplementation(mnSerde.micronaut.serde.jackson)
}
