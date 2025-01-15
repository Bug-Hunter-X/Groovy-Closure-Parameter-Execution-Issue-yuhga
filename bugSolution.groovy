```groovy
def methodWithClosure(closure) {
  println "Closure parameter: "+ closure
  closure.call()
}

methodWithClosure { println "Inside closure" }

// Correct behavior:
// Prints the closure object AND executes the closure code, printing "Inside closure".
```