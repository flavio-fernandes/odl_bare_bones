odl_bare_bones
==============

Hello World in ODL's controller

This repo offers a simple example on how to create an OSGI bundle
that can be added to the OpenDayLight's controller.

***NOTE:*** This example has been tailored to work with ODL's Hydrogen
release. Attempting to use 1.2.x may not work, due the the ongoing changes
related to Karaf. Be warned! :)

DIRS
====

- build: contains the parent pom.xml that contains the hello_world and the controller modules.
         This pom.xml also contains all the info needed so the dependencies are grabbed from
         opendaylight's Nexus.

- hello_world: contains the OSGI bundle for this example project. It was intentionally made to
               be simple and dumb.

- controller: a working controller distribution which will include all Hydrogen bundles AND the
              hello_world bundle.

HOW TO BUILD
============

In order to build it's required to have JDK 1.7+ and Maven 3+, to get a build going do this:

cd build && mvn clean install -nsu

HOW TO RUN
============

Upon successful completion of a build

cd runDir && ./run.sh

Wait for the osgi console to startup and then point a browser at 

http:localhost:8080/

