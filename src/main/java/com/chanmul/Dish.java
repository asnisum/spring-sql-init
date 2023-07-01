package com.chanmul;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "dish2")
public class Dish {
  @Column
  @Id
  private Long id;
  @Column
  private String name;
}
