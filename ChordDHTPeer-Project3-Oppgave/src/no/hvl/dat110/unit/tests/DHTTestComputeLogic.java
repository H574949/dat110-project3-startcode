package no.hvl.dat110.unit.tests;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;
import java.rmi.RemoteException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat110.util.Util;

class DHTTestComputeLogic {
	
	@BeforeEach
	void setUp() throws Exception {
		

	}

	@Test
	void test() throws InterruptedException, RemoteException {
		
		// lower1 < id1 < upper1  (false bcos lower1 > id)
		BigInteger id1 =    new BigInteger("8256520967608282605234844990226290265");
		BigInteger lower1 = new BigInteger("15618062003214643351512781541041391612");
		BigInteger upper1 = new BigInteger("210821560651360572675896360671414673172");
		
		// lower2 < id2 < upper2 (true)
		BigInteger id2 = new BigInteger("66481538825926898419352978747807121875");
		BigInteger lower2 = new BigInteger("53937554629190552131995290006614509577");
		BigInteger upper2 = new BigInteger("66910184482037901621933403444034052414");
		
		// lower3 <= id3 < upper3 (true)
		BigInteger id3 = new BigInteger("121411138451101288395601026024677976156");
		BigInteger lower3 = new BigInteger("121411138451101288395601026024677976156");
		BigInteger upper3 = new BigInteger("210821560651360572675896360671414673172");
		
		// lower4 < id4 <= upper4 (true)
		BigInteger id4 =    new BigInteger("15618062003214643351512781541041391612");
		BigInteger lower4 = new BigInteger("210821560651360572675896360671414673172");
		BigInteger upper4 = new BigInteger("15618062003214643351512781541041391612");
		
		// lower5 < id5 < upper5  (true)
		BigInteger id5 = new BigInteger("8256520967608282605234844990226290265");
		BigInteger lower5 = new BigInteger("210821560651360572675896360671414673172");
		BigInteger upper5 = new BigInteger("15618062003214643351512781541041391612");
		
		assertFalse(Util.computeLogic(id1, lower1, upper1));
		assertTrue(Util.computeLogic(id2, lower2, upper2));
		assertTrue(Util.computeLogic(id3, lower3, upper3));
	

		assertTrue(Util.computeLogic(id4, lower4, upper4));
		
		assertTrue(Util.computeLogic(id5, lower5, upper5));
	}

}
