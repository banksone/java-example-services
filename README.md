# java-example-services (in progress)

The example provides REST services set exposing movies and recommendations data out of Apache Cassandra database. There is no docker here - jar artifact is meant to be run in a dedicated docker container of spark-dataprocessing project.

The current status: application is tested to connect to the Cassandra cluster (3 nodes) to collect data from the 'movies' table. I'm using Cassandra Spring Data. Then I map the resulting rows onto annotated POJO class.

For now, we will focus on collecting data without pagination. But pagination is possible with Cassandra (and spring-data-cassandra) - for that matter, CassandraPagingRequest should be used, which we will show in the future. 