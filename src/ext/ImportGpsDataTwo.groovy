def file = new File('../../data/fells_loop.gpx')

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

gpx.with {
	println name
	println ''

	println desc
	println ''

	println attributes()['version']
	println attributes()['creator']
}

//println gpx.@version
//println gpx.@creator