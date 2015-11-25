# SOAPServer
a demo SOAP server using Jersey to be used by RestInPeace app

Only contains a basic place holder as soap server to be used by RestInPeace App.

Was developed using the video https://www.youtube.com/watch?v=fE1pVSiXNkU

to create a SOAP client class from wsdl use command:
wsimport -keep -verbose -s ./src/main/java -d ./build/libs http://localhost:4500/soap/accounts?wsdl
