package no.mesan.sak

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

  test("sak skal kunne ha sakstype") {
    val st = new SakType
    st.navn = "type"
    em.persist(st)
//    val str : java.lang.String = "aa"
//    str.toInt
//    "test".toInt

    val sak = new Sak
    sak.tittel = "tittel"
    sak.sakstype = st
    em.persist(sak)

    em.flush
    em.clear

    val hentetSak = em.find(classOf[Sak], sak.id)
    hentetSak should not be(sak)
    hentetSak.sakstype should not be(null)
    hentetSak.sakstype should not be(st)
  }
}
