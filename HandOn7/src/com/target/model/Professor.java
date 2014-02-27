package com.target.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Professor")
public class Professor extends Pessoa{

}
