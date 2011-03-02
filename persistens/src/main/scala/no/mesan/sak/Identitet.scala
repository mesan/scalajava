package no.mesan.sak

import javax.persistence._

trait Identitet {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id : Long = _
}