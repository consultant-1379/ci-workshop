import java.util.Arrays;
import java.util.List;

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

public class TeamExample {

	public String teamName = "C";

	public List<String> signumsList = Arrays.asList("XDARCIA", "XPAWPIO", "XMICORZ", "SOMEOTHERSIGNUM");
	
	public List<String> getSignumsList(){
		return signumsList;
	}
}
