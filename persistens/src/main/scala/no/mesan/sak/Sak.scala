package no.mesan {
package sak {

import javax.persistence._


@Entity
class Sak {
  type E = javax.persistence.Entity

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id : Long = _
  var tittel : String = _

  @ManyToOne
  var sakstype : SakType = _
}

}
}