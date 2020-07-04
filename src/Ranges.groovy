/*
def numbers = 1..10

for (num in numbers) {
    println num
}
*/

/*
def range = 'a'..'g'

for (var in range) {
    println var
}
*/

/*
enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}

def weekdays = DAYS.MON..DAYS.FRI

for (var in weekdays) {
    println var
}
*/

enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}

def weekdays = DAYS.MON..DAYS.FRI

for (var in weekdays) {
    println var
}

println "Extents: "
println weekdays.from
println weekdays.to