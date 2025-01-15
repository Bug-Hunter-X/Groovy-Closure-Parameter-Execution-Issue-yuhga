```groovy
def methodWithClosure(closure) {
  println "Closure parameter: "+ closure
  closure()
}

methodWithClosure { println "Inside closure" }

// Unexpected behavior:
// The output shows the closure as a closure object, but does not execute it.
// Expected behavior:
// The output should print "Inside closure" after printing the closure object.
```