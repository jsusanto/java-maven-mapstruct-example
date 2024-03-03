# java-maven-mapstruct-example
Java Maven using MapStruct (NetBeans IDE)

# Example 1 - Source Destination Example using MapStruct
package com.medibank.javamavenmapstruct.source_dest_example <br/>
<ul>
  <li>SimpleDestination.java</li>
  <li>SimpleSource.java</li>
  <li>SimpleSourceDestinationMapper.java</li>
</ul>

![image](https://github.com/jsusanto/java-maven-mapstruct-example/assets/132423461/1208b7ca-9468-4f4d-b1bf-ceef5d5267cc)

Note: <i>Ignore the error indicator in Netbeans (Bug)</i>

![image](https://github.com/jsusanto/java-maven-mapstruct-example/assets/132423461/1430f4e1-ab6b-424d-ab62-6f26527bcb9a)

# Example 1 - How to run and test
Step 1 - Do a clean and build the project <br/>
Step 2 - Run a test <br/>

![image](https://github.com/jsusanto/java-maven-mapstruct-example/assets/132423461/b1bcf2fc-6e7f-4154-9140-98138ab6fc53)

# Create SimpleSourceDestinationMapperImpl automatically when Building the project

Note: <i>No need to create this file because it's automatically created when you compile in the target/generated-sources/</i>
<pre>
package com.medibank.javamavenmapstruct.source_dest_example;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-04T09:53:13+1100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.22 (Amazon.com Inc.)"
)
public class SimpleSourceDestinationMapperImpl implements SimpleSourceDestinationMapper {

    @Override
    public SimpleDestination sourceToDestination(SimpleSource source) {
        if ( source == null ) {
            return null;
        }

        SimpleDestination simpleDestination = new SimpleDestination();

        simpleDestination.setName( source.getName() );
        simpleDestination.setDescription( source.getDescription() );

        return simpleDestination;
    }

    @Override
    public SimpleSource destinationToSource(SimpleDestination destination) {
        if ( destination == null ) {
            return null;
        }

        SimpleSource simpleSource = new SimpleSource();

        simpleSource.setName( destination.getName() );
        simpleSource.setDescription( destination.getDescription() );

        return simpleSource;
    }
}  
</pre>
