/*
// Basic XML File Reading
def file = new File('../data/fells_loop.gpx')
println file.exists()

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
println gpx
*/

/*
// Reading XML Fields
def file = new File('../data/fells_loop.gpx')
println file.exists()

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
println gpx.name
println ''
println gpx.desc
*/

/*
// Reading XML Attribute
def file = new File('../data/fells_loop.gpx')
println file.exists()

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
println gpx.name
println ''
println gpx.desc
println ''
println gpx.@version
println gpx.@creator
*/

/*
// Reading XML properties as list
def file = new File('../data/fells_loop.gpx')
println file.exists()

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
println gpx.name
println ''
println gpx.desc
println ''
println gpx.@version
println gpx.@creator

for (point in gpx.rte.rtept) {
    println point.@lat
    println point.@lon
    println point.time
}
*/

// Reading XML properties as list
def file = new File('../data/fells_loop.gpx')
println file.exists()

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
println gpx.name
println ''
println gpx.desc
println ''
println gpx.@version
println gpx.@creator

gpx.rte.rtept.each {
    println it.@lat
    println it.@lon
    println it.time
}