package no.mesan.sak

import javax.persistence.{EntityManagerFactory, Persistence, EntityManager}
import org.scalatest.{BeforeAndAfterEach, Suite}

trait DataTest extends BeforeAndAfterEach {
  self : Suite =>

  protected val emf :EntityManagerFactory = Persistence.createEntityManagerFactory("sakPU")
  protected var em :EntityManager = _

  override protected def beforeEach() = {
    em = emf.createEntityManager
    em.getTransaction.begin
  }

  override protected def afterEach() = {
    em.getTransaction.rollback
  }
}
