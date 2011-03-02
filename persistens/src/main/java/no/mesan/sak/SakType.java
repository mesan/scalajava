package no.mesan.sak;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SakType {

    @Id
    @GeneratedValue
    public Long id = null;

    public String navn = "";
}
