package com.github.havardh.javaflow.ast.builders;

/**
 * Interface for builders of the type {@code T}.
 *
 * @param <T> the type to build
 */
public interface Builder<T> {

  /**
   * Build a {@code T} type
   *
   * @return the new {@code T}
   */
  T build();

}