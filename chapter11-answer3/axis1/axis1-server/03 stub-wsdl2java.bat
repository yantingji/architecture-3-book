set LIB=./lib
set AXIS_CLASSPATH=%LIB%/axis.jar
set AXIS_CLASSPATH=%AXIS_CLASSPATH%;%LIB%/jaxrpc.jar
set AXIS_CLASSPATH=%AXIS_CLASSPATH%;%LIB%/commons-logging-1.0.4.jar
set AXIS_CLASSPATH=%AXIS_CLASSPATH%;%LIB%/commons-discovery-0.2.jar
set AXIS_CLASSPATH=%AXIS_CLASSPATH%;%LIB%/saaj.jar
set AXIS_CLASSPATH=%AXIS_CLASSPATH%;%LIB%/wsdl4j-1.5.1.jar

set CLASSPATH=%AXIS_CLASSPATH%;.

java -cp %CLASSPATH% org.apache.axis.wsdl.WSDL2Java -o src  -p com.itedu.ws.generated  -s  calculator.wsdl

pause