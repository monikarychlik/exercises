class FinalInstances {

    companion object {

        fun execute() {


        }

        fun finalInstances(instances: Int, averageUtil: Array<Int>): Int {
            val halfMaxInstances = 100000000
            var finalInstances = instances
            var second = 0

            while (second < averageUtil.size) {
                val value = averageUtil[second]

                if (value < 25) {
                    if (instances > 1) {
                        finalInstances /= 2
                        second += 10
                        continue
                    }
                } else if (value > 60) {
                    finalInstances = if (halfMaxInstances > finalInstances) {
                        halfMaxInstances*2
                    } else {
                        finalInstances*2
                    }

                    second +=10
                    continue
                }
                second++
            }
            return finalInstances
        }
    }
}