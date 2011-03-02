package no.mesan.sak {

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{Suite, BeforeAndAfterAll, BeforeAndAfterEach, FunSuite}
import javax.persistence.{EntityManager, EntityManagerFactory, Persistence}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PersistensTest extends FunSuite with ShouldMatchers with DataTest {

  test("sak kan lagres og da får den en ID") {
    val sak = new Sak
    sak.id should be(0)
    em.persist(sak)
    sak.id should not be(0)
  }

  test("saktype kan lagres og få id") {
    val st = new SakType
    st.navn = "typenavn"

    st.id should be(null)
    em.persist(st)
    st.id should not be(0)
  }
}

}
