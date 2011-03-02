package no.mesan {
package sak {


import javax.persistence.{GenerationType, GeneratedValue, Id, Entity}


@Entity
class Sak {
  type E = javax.persistence.Entity

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id : Long = _
  var tittel : String = _
}

}
}