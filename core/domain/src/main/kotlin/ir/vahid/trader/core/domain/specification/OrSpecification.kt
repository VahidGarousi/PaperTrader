package ir.vahid.trader.core.domain.specification

class OrSpecification<T>(
    private val left: ISpecification<T>,
    private val right: ISpecification<T>,
) : ISpecification<T> {
    override fun isSatisfiedBy(candidate: T): Boolean {
        return left.isSatisfiedBy(candidate) || right.isSatisfiedBy(candidate)
    }
}
