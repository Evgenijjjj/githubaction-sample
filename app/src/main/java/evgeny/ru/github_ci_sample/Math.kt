package evgeny.ru.github_ci_sample

infix fun Int.pow(x: Int): Int {
    if (x == 0) return 1
    var res = this
    for (i in 0 until x - 1) {
        res *= this
    }
    return res
}
