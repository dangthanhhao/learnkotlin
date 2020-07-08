fun aFunctionCallCallback(param: Int, callback: (res: Int) -> Int) {
    println("callid: ${param}, result: ${callback(param)}")
}

fun main() {
    aFunctionCallCallback(15) {
        print("call back called $it")
        it
    }

    aFunctionCallCallback(15) {
        print("call back called $it")
        return@aFunctionCallCallback it
    }
    aFunctionCallCallback(30, { item -> item });

    aFunctionCallCallback(45) { arg ->
        run {
            println("callbacl called")
            println("callbacl called2")
            arg
        }
    }
}