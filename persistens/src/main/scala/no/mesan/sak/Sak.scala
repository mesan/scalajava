package no.mesan.sak

import javax.persistence._

@Entity
class Sak extends Identitet {
  var tittel : String = _

  @ManyToOne
  var sakstype : SakType = _

  @ManyToOne
  var eier : Person = _
}

import java.util.{List => JList}

@Entity
class Person extends Identitet {
  var navn : String = _

  @OneToMany(mappedBy = "eier")
  var saker : JList[Sak] = _
}
