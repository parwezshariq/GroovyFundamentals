/*
def inFile = new File('../data/fells_loop.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(inFile)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind{
    gpx.rte.rtept.each {
        latitude(it.@lat)
        longitude(it.@lon)
    }
}

def outFile =  new File('../data/fells_loop_truncated.xml')
outFile.write(xml.toString())
*/

/*
// Define in element (route) lat and long

def inFile = new File('../data/fells_loop.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(inFile)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind{
    route {
        gpx.rte.rtept.each {
            latitude(it.@lat)
            longitude(it.@lon)
        }
    }
}

def outFile =  new File('../data/fells_loop_truncated.xml')
outFile.write(xml.toString())
*/

/*
// Define lat long in element (routepoint) lat and long

def inFile = new File('../data/fells_loop.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(inFile)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind{
    route {
        gpx.rte.rtept.each { point ->
            routepoint {
                latitude(point.@lat)
                longitude(point.@lon)
            }
        }
    }
}

def outFile =  new File('../data/fells_loop_truncated.xml')
outFile.write(xml.toString())
*/

/*
// Added timestamp

def inFile = new File('../data/fells_loop.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(inFile)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind{
    route {
        gpx.rte.rtept.each { point ->
            routepoint(timestamp: point.time.toString()) {
                latitude(point.@lat)
                longitude(point.@lon)
            }
        }
    }
}

def outFile =  new File('../data/fells_loop_truncated.xml')
outFile.write(xml.toString())
*/

// Add comment

def inFile = new File('../data/fells_loop.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(inFile)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind{
    route {
        mkp.comment(gpx.name)
        gpx.rte.rtept.each { point ->
            routepoint(timestamp: point.time.toString()) {
                latitude(point.@lat)
                longitude(point.@lon)
            }
        }
    }
}

def outFile =  new File('../data/fells_loop_truncated.xml')
outFile.write(xml.toString())