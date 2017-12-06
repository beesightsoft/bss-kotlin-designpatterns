package filter.pattern

class AndCriteria(val criteria: Criteria, val otherCriterial: Criteria) : Criteria {
    override fun meetCriteria(persons: ArrayList<Person>): ArrayList<Person> {
        val firstCriteriaPersons = criteria.meetCriteria(persons)
        return otherCriterial.meetCriteria(firstCriteriaPersons)
    }

}