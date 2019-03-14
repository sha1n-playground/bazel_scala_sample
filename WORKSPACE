workspace(name = "basic_scala")

#rules_scala_version="326b4ce252c36aeff2232e241ff4bfd8d6f6e071" # update this as needed
#http_archive(
#             name = "io_bazel_rules_scala",
#             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
#             type = "zip",
#             strip_prefix= "rules_scala-%s" % rules_scala_version
#             )

local_repository(
    name = "io_bazel_rules_scala",
    path = "/Users/shain/code/rules_scala"
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()


load("@io_bazel_rules_scala//scala:scala_maven_import_external.bzl", "scala_maven_import_external")

#
# local second party code repository
#
local_repository(
    name = "second_party_example",
    path = "/Users/shain/code/bazel_scala_2nd_party"
)

scala_maven_import_external(
    name = "com_typesafe_akka_akka_http_2_12",
    artifact = "com.typesafe.akka:akka-http_2.12:10.1.4",
    jar_sha256 = "9b8bdc14c3be4ac3f0032f664036a5d43d0c96c27bf693fba1fc5eeaf74d079b",
    srcjar_sha256 = "55110c6acf0ddf5e1d19964d220a6823e928197009db3ee2bd62d4eb5ccecf24",
    licenses = ["notice"],
    fetch_sources = True,
    server_urls = [
      "https://repo.maven.apache.org/maven2/",
    ],
    deps = [
        "@com_typesafe_akka_akka_http_core_2_12//jar",
    ],
)

scala_maven_import_external(
    name = "com_typesafe_akka_akka_http_core_2_12",
    artifact = "com.typesafe.akka:akka-http-core_2.12:10.1.4",
    jar_sha256 = "108f5d6ecb207921fd804eccec7da9853eb0011e540640ef45289cd7c3f1f26d",
    srcjar_sha256 = "e532c4922c58c5c7ece0654694ea4d6f69cb732b5ca833d3466c360abdd82864",
    deps = [
      "@com_typesafe_akka_akka_parsing_2_12//jar",
    ],
    licenses = ["notice"],
    fetch_sources = True,
    server_urls = [
      "https://repo.maven.apache.org/maven2/",
    ],
  )

scala_maven_import_external(
    name = "com_typesafe_akka_akka_parsing_2_12",
    artifact = "com.typesafe.akka:akka-parsing_2.12:10.1.4",
    jar_sha256 = "d21165ea458ecd78bbb7a92cb2225c0a82e0f3f8c1a543224597b592985ef3c8",
    srcjar_sha256 = "a1e3a7954195497a4f6acd938829a8abe3eba80dc947a2b86b412b70d51b5ab7",
    deps = [
    ],
    licenses = ["notice"],
    fetch_sources = True,
    server_urls = [
      "https://repo.maven.apache.org/maven2/",
    ],
  )