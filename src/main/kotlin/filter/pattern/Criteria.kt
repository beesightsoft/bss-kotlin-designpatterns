package filter.pattern

interface Criteria {
    fun meetCriteria(persons: ArrayList<Person>): ArrayList<Person>
}