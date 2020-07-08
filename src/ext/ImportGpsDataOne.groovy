def file = new File('../../data/fells_loop.gpx')

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
println gpx.name
println ''

println 'Beginning dump...'
println gpx.name.value.dump()

println 'Beginning inspect...'
println gpx.name.inspect()