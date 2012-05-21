package com.xebia.domain.specification;

public interface ISpecification<T> {
    
    Boolean isSatisfiedBy(T obj, Double money);
}
