load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary")

scala_library(
    name = "scala_example",
    srcs = [
        "Example.scala",
        "Trait.scala",
        ],
    visibility = ["//visibility:public"],
    deps = [
        "@com_typesafe_akka_akka_http_core_2_12//jar",
        "@com_typesafe_akka_akka_parsing_2_12//jar"
    ]
)