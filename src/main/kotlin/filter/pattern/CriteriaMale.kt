package filter.pattern

class CriteriaMale : Criteria {
    override fun meetCriteria(persons: ArrayList<Person>): ArrayList<Person> {
        val malePersons = ArrayList<Person>()
        persons.filterTo(malePersons) { it.gender.equals("MALE", true) }
        return malePersons
    }
}