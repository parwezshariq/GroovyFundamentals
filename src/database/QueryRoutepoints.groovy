@GrabConfig(systemClassLoader=true)
@Grapes([
	@Grab(group='mysql', module='mysql-connector-java', version='5.1.26'),
	])
import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/gps", "root", "root", 
	"com.mysql.jdbc.Driver")

/*
// To Fetch all rows
sql.eachRow('select * from routepoints') {
	println "Latitude: ${it.latitude}, Longitude: ${it.longitude}, " +
		"Timestep: ${it.timestep}, Temperature: ${it.temperature}"
}
*/

/*
// To Fetch one rows
def row = sql.firstRow('select latitude, longitude from routepoints')
println "Latitude: ${row.latitude}, Longitude: ${row.longitude}"
*/

// To update row(s)
def newTemperature = 100
sql.executeUpdate("update routepoints set temperature = ${newTemperature}")

sql.close()