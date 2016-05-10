package test;

import java.util.*;
import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import pack1.*;


@RunWith(CdiTestRunner.class)
public class DeltaspikeTest {
	
	private Log log = LogFactory.getLog( this.getClass() );

	@Inject private SomethingDao somethingDao;
	
	@org.junit.Test
	public void test1(){
		Something something = new Something();
		something.setName( "Name" );
		somethingDao.save( something );
	}
	
	@org.junit.Test
	public void test2(){
		Something something = new Something();
		something.setName( "Name" );
		somethingDao.save( something );
		log.info( something.getId() );
		somethingDao.remove( somethingDao.findBy( something.getId() ) );
	}

}