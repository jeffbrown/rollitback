package demo


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class PersonSpec extends Specification {

    def setup() {
        new Person(name: 'Jeff').save()
    }

    void "test retrieving instance created in setup"() {
        expect:
        Person.count() == 1
    }
}
