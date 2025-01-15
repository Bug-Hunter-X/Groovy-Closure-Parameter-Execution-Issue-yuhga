# Groovy Closure Parameter Execution Issue

This repository demonstrates a subtle bug in Groovy involving the execution of closures passed as parameters to a method.  The closure is correctly received, but its code doesn't execute as expected.

## Bug Description
The `methodWithClosure` function takes a closure as an argument. While it correctly prints the closure object, it fails to execute the closure's code.  This unexpected behavior leads to incomplete functionality.

## Solution
The provided solution modifies the function to explicitly invoke the closure using the `call()` method.