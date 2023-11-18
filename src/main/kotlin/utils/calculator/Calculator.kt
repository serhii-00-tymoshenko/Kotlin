package utils.calculator


fun <T : Number> calculateSum(x: T, y: T): T =
    ((x as Number).toDouble() + (y as Number).toDouble()) as T