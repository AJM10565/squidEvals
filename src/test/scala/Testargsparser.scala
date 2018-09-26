package wf
import org.junit.Assert._
import org.junit.After
import org.junit.Before
import org.junit.Test

class Testargsparser {

  @Test def Three_input_path(): Unit = {
    var temp = Array("5", "7", "100")
    var fixture = new argsparser(temp)

    assertNotNull(fixture)
    assertEquals(5, fixture.getHowmany)
    assertEquals(7, fixture.getMinlength)
    assertEquals(100, fixture.getLastnwords)
  }

  @Test def Two_input_path(): Unit = {
    var temp = Array("5", "7")
    var fixture = new argsparser(temp)
    assertNotNull(fixture)
    assertEquals(5, fixture.getHowmany)
    assertEquals(7, fixture.getMinlength)
    assertEquals(1000, fixture.getLastnwords)
  }

  @Test def One_input_path(): Unit = {
    var temp = Array("5")
    var fixture = new argsparser(temp)
    assertNotNull(fixture)
    assertEquals(5, fixture.getHowmany)
    assertEquals(6, fixture.getMinlength)
    assertEquals(1000, fixture.getLastnwords)
  }

}
