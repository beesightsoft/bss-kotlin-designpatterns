package filter.pattern

class CriteriaFemale : Criteria {
    override fun meetCriteria(persons: ArrayList<Person>): ArrayList<Person> {
        val femalePersons = ArrayList<Person>()
        persons.filterTo(femalePersons) { it.gender.equals("FEMALE", true) }
        return femalePersons
    }
}