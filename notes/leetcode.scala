// https://leetcode.com/problems/number-of-good-pairs/
object Solution {
    def numIdenticalPairs(nums: Array[Int]): Int = {
        val indices = nums.zipWithIndex.map(x => x._2)
        indices.map(i => indices.map(j => (i,j))).flatten.filter(t => t._1 < t._2 && nums.apply(t._1) == nums.apply(t._2)).length
    }
}

// https://leetcode.com/problems/running-sum-of-1d-array/
object Solution {
    def runningSum(nums: Array[Int]): Array[Int] = {
        // nums.foldLeft((0, Array[Int]()))((c, d) => (c._1 + d, c._2 ++ Array(c._1 + d)))._2

        nums.foldLeft(Array[Int](0))((a,b) => a ++ Array(b + a.last)).tail
    }
}

// https://leetcode.com/problems/jewels-and-stones/
object Solution {
    def numJewelsInStones(jewels: String, stones: String): Int = {
        stones.filter(x => jewels.contains(x)).length
    }
}

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
object Solution {
    def finalValueAfterOperations(operations: Array[String]): Int = {
        operations.map(x => if (x.apply(1) == '+') 1 else -1).sum
        //operations.foldLeft(0)((acc, next) => acc + (if (next.apply(1) == '+') 1 else -1))
        //operations.foldLeft(0)((acc, next) => acc + (if (next == "++X" || next == "X++") 1 else -1))
    }
}

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
object Solution {
    def mostWordsFound(sentences: Array[String]): Int = {
        sentences.map(x => x.split(" ").length).max
    }
}

// https://leetcode.com/problems/shuffle-the-array/
object Solution {
    def shuffle(nums: Array[Int], n: Int): Array[Int] = {
        val indices = (0 to (2 * n - 1)).toArray.map(x => if (x % 2 == 0) x/2 else (x - 1)/2 + n)
        indices.map(i => nums.apply(i))
    }
}