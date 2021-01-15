class ClosedPaths {

    companion object {

        private val digitsClosedPaths = listOf(1, 0, 0, 0, 1, 0, 1, 0, 2, 1)
        private const val INPUT_NUMBER = 630480127

        fun execute() {
            val start = System.currentTimeMillis()
            val closedPaths = getClosedPathsInNumber(INPUT_NUMBER)
            val time = System.currentTimeMillis() - start

            val start2 = System.currentTimeMillis()
            val closedPaths2 = getClosedPathsInNumber2(INPUT_NUMBER)
            val time2 = System.currentTimeMillis() - start2

            println("Number: $INPUT_NUMBER")
            println("closed paths: $closedPaths, time: $time")
            println("closed paths2: $closedPaths2, time2: $time2")
        }

        private fun getClosedPathsInNumber(number: Int): Int {
            val digits: List<Int> = number.toString().chunked(1) {
                    digit: CharSequence -> digit[0].toString().toInt()
            }

            var closedPathsInNumber = 0
            digits.forEach { closedPathsInNumber += digitsClosedPaths[it] }
            return closedPathsInNumber
        }

        private fun getClosedPathsInNumber2(inputNumber: Int): Int {
            var closedPathsInNumber = 0
            var number = inputNumber
            while (number > 0) {
                val digit = number%10
                number /= 10
                closedPathsInNumber += digitsClosedPaths[digit]
            }
            return closedPathsInNumber
        }
    }
}