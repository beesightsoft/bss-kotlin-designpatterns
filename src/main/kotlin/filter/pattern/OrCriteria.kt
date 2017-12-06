package filter.pattern

class OrCriteria(val criteria: Criteria, val otherCriterial: Criteria) : Criteria {
    override fun meetCriteria(persons: ArrayList<Person>): ArrayList<Person> {
        val firstCriteriaPersons = criteria.meetCriteria(persons)
        val otherCriteriaPersons = otherCriterial.meetCriteria(persons)

        for (otherCriteriaPerson in otherCriteriaPersons) {
            if (!firstCriteriaPersons.contains(otherCriteriaPerson)) {
                firstCriteriaPersons.add(otherCriteriaPerson)
            }
        }
        return firstCriteriaPersons
    }

}