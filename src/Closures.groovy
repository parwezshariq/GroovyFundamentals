/*
def myClosure = { println "In a closure" }

myClosure()
*/

/*
def myClosure = {
    println "In a closure"
    println new Date()
}

for (i in 1..3) {
    myClosure()
    sleep(1000)
}
*/

/*
def myClosure = {
    println "In a closure"
}

(1..3).each({
    myClosure()
})
*/

/*
(1..3).each({
    println "In a closure"
})
*/

/*
(1..3).each({
    println "In a closure: $it"
})
*/

/*
(1..3).each({ i ->
    println "In a closure: $i"
})
*/

/*
(1..10).findAll({ return it%2==0 }).each({ i ->
    println "In a closure: $i"
})
*/

(1..10).findAll({ it%2==0 }).each({
    println "In a closure: $it"
})
