package com.target.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cliente")
public class Cliente extends Pessoa{

}
