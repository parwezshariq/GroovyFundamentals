@Grapes(
        @Grab(group='joda-time', module='joda-time', version='2.5')
)
import org.joda.time.DateTime

import groovy.util.GroovyTestCase

class DateParserTests extends GroovyTestCase {
	private DateParser parser

	def void setUp() {
		parser = new DateParser()
	}

	def void testCanParseDateTime() {
		def dateTime = new DateTime(2013,1,1,9,30)
		def result = parser.parse(dateTime.toString())

		assert '01/01/2013 - 09:30 AMcat' == result
	}

	def void testWillThrowAnErrorWhenNullDateTimeIsProvided() {
		shouldFail(IllegalArgumentException) {
			parser.parse(null)
		}
	}
}