package filter.pattern

class CriteriaSingle : Criteria {
    override fun meetCriteria(persons: ArrayList<Person>): ArrayList<Person> {
        val singlePersons = ArrayList<Person>()
        persons.filterTo(singlePersons) { it.maritalStatus.equals("SINGLE", true) }
        return singlePersons
    }
}