# FastWeb

fastweb is a maven archetype for building a java web project in a very fast way.

## Structure

|--pom.xml

|--{artifact}-common

|--|--src/main/java

|--|--src/main/resources

|--|--src/test/java

|--|--src/test/resources

|--{artifact}-service

|--|--src/main/java

|--|--src/main/resources

|--|--src/test/java

|--|--src/test/resources

|--{artifact}-web

|--|--src/main/java

|--|--src/main/resources

|--|--src/main/webapp

|--|--src/test/java

|--|--src/test/resources

## Install

mvn archetype:generate -DgroupId=com.beiluve -DartifactId=demo -Dversion=0.0.1 -DarchetypeGroupId=com.beiluve -DarchetypeArtifactId=fastweb-archetype -DarchetypeVersion=0.0.1 -DarchetypeCatalog=local