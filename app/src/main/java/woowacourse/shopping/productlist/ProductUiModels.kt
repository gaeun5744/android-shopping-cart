package woowacourse.shopping.productlist

data class ProductUiModels(
    val products: List<ProductUiModel>,
) {
    fun totalProductCount(): Int = products.size

    fun updateProduct(product: ProductUiModel): ProductUiModels =
        products.map { if (it.id == product.id) product else it }.let(::ProductUiModels)

    fun addProduct(product: List<ProductUiModel>): ProductUiModels = (products + product).let(::ProductUiModels)

    companion object {
        fun default(): ProductUiModels = ProductUiModels(emptyList())
    }
}
