package se2ue11_k1648066;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class JUnitTests {

	  private Folder resource1;
	  private SourceFile resource2;
	  private SourceFile resource3;
	  private SourceFile resource4;
	  private BinaryFile resource5;
	  private BinaryFile resource6;
	  private BinaryFile resource7;
	  private Folder resource8;
	  private SourceFile resource9;

	  void setUp() {
		  resource1 = new Folder("root", null);
		  resource2 = new SourceFile("file1", resource1);
		  resource3 = new SourceFile("file2", resource1);
		  resource4 = new SourceFile("file3", resource1);
		  resource5 = new BinaryFile("file1bin", resource1, resource2);
		  resource6 = new BinaryFile("file2bin", resource1, resource3);
		  resource7 = new BinaryFile("file3bin", resource1, resource4);
		  resource8 = new Folder("folder1", resource1);
		  resource9 = new SourceFile("file8", resource8);
	  }

	  @AfterEach
	  void tearDown() {
		  resource1 = null;
		  resource2 = null;
		  resource3 = null;
		  resource4 = null;
		  resource5 = null;
		  resource6 = null;
		  resource7 = null;
		  resource8 = null;
		  resource9 = null;
	  }

	  @Test
	  void testCompileVisitor() {
		 this.setUp();
	       assertEquals(null, resource9.getBinary());
	       CompileVisitor visitor = new CompileVisitor();
	       visitor.visit(resource9);
	       assertEquals(resource9.getName() + ".binary", resource9.getBinary().getName());
	  }

}
