# java-example-services (in progress)

The example provides REST services set exposing movies and recommendations data out of Apache Cassandra database. There is no docker here - jar artefact is meant to be run in a dedicated docker container of spark-dataprocessing project.

The current status: application is tested to connect to the Cassandra cluster (3 nodes) in order to collect one test row. Cassandra Spring Data was used. I map the resulting row onto annotated POJO class.
