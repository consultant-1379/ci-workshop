import junit.framework.Assert;

import org.junit.Test;

/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

public class ExampleTest {
	
	TeamExample example = new TeamExample();
	
	@Test
	public void testCheckForXpawpio(){
		Assert.assertTrue("Your signum is not in the signums list", example.getSignumsList().contains("XPAWPIO"));
	}
	
	@Test
	public void testCheckForXmicorz(){
		Assert.assertTrue("Your signum is not in the signums list", example.getSignumsList().contains("XMICORZ"));
	}

    @Test
    public void testCheckForXdarcia(){
        Assert.assertTrue("Your signum is not in the signums list", example.getSignumsList().contains("XDARCIA"));
    }
}
