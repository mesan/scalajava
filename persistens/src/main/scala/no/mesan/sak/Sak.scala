package no.mesan {
package sak {

import javax.persistence._


@Entity
class Sak extends Object with Identitet {
  type E = javax.persistence.Entity

  var tittel : String = _

  @ManyToOne
  var sakstype : SakType = _
}

}
}