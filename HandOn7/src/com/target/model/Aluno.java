package com.target.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Aluno")
public class Aluno extends Cliente{

}
