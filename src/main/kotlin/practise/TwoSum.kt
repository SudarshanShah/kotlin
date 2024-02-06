package practise

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that
* they add up to target.
You may assume that each input would have exactly one solution,
* and you may not use the same element twice.
You can return the answer in any order.
* */
fun main() {
    val nums = arrayOf(3, 3)
    println(twoSum(nums, 6).contentToString())
}

fun twoSum(nums: Array<Int>, target: Int): Array<Int> {
    val map = mutableMapOf<Int, Int>()
    val ans = arrayOf<Int>(-1, -1)

    for (i in nums.indices) {
        if (map.containsKey(target - nums[i])) {
            ans[0] = map[target - nums[i]]!!
            ans[1] = i
        } else {
            map.putIfAbsent(nums[i], i)
        }
    }

    return ans
}