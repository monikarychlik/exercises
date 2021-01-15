class Purchases {

    companion object {

        private val purchases = listOf("notebook", "notebook", "mouse", "keyboard", "mouse")

        fun execute() {
            val result = groupAndSortPurchases(purchases)
            println("Purchases: $purchases")
            println("Grouped and sorted purchases: ${result.toList()}")
        }

        private fun groupAndSortPurchases(purchases: List<String>): Array<String> {
            val wordsCounts = purchases.groupingBy { it }.eachCount()
            wordsCounts.toSortedMap()
            // sorting

            val result: List<String> = wordsCounts.map {
                it.key + " " + it.value
            }
            return result.toTypedArray()
        }
    }
}