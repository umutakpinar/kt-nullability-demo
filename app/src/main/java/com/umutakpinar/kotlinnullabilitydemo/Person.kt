package com.umutakpinar.kotlinnullabilitydemo

class Person(_name: String?, _age: Int?, _job : String?) {
    private var name: String?
    private var age: Int?
    private var job: String?

    init {
        this.job = _job;
        this.name = _name;
        this.age = _age;
    }

    fun getName() : String?{
        return this.name;
    }
    fun getAge() : Int?{
        return this.age;
    }
    fun getJob() : String?{
        return this.job;
    }

}

