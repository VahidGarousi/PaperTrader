package ir.vahid.trader.core.domain.specification

interface ISpecification<T> {
    fun isSatisfiedBy(candidate: T): Boolean
}
