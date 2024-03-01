package source_dest_example;


import com.medibank.javamavenmapstruct.source_dest_example.SimpleDestination;
import com.medibank.javamavenmapstruct.source_dest_example.SimpleSource;
import com.medibank.javamavenmapstruct.source_dest_example.SimpleSourceDestinationMapperImpl;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 606041
 */
public class SimpleSourceDestinationMapperIntegrationTest {

    SimpleSourceDestinationMapperImpl simpleSourceDestinationMapper;

    public SimpleSourceDestinationMapperIntegrationTest(){
        //Create a new instance of the mapper
        simpleSourceDestinationMapper = new SimpleSourceDestinationMapperImpl();
    }

    @Test
    public void shouldApplyConversions() {
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");

        SimpleDestination destination = simpleSourceDestinationMapper.sourceToDestination(simpleSource);

        assertEquals(simpleSource.getName(), destination.getName());
        assertEquals(simpleSource.getDescription(), destination.getDescription());
    }
}
