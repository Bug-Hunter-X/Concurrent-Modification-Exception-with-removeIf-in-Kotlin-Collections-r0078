fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (item in list) {
        if (item % 2 == 0) {
            toRemove.add(item)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemoveSet = set.filter { it % 2 == 0 }.toSet()
    set.removeAll(toRemoveSet)
    println(set) // Output: [1, 3, 5]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val toRemoveMap = mutableListOf<Int>()
    for ((key, _) in map) {
        if (key % 2 == 0) {
            toRemoveMap.add(key)
        }
    }
    toRemoveMap.forEach { map.remove(it) }
    println(map) // Output: {1=one, 3=three, 5=five}
}