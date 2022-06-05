package com.example.recyclerview_crud

import java.io.Serializable


object peopleDB {
    val list: MutableList<PeopleData> = mutableListOf(
        PeopleData("조이", "이유리"),
        PeopleData("춘배", "김지훈"),
        PeopleData("마누", "송지혁"),
        PeopleData("줄리", "최유정"),
        PeopleData("루한", "이은진"),
        PeopleData("조예", "서수현"),
        PeopleData("조이", "이유리"),
        PeopleData("춘배", "김지훈"),
        PeopleData("마누", "송지혁"),
        PeopleData("줄리", "최유정"),
        PeopleData("루한", "이은진"),
        PeopleData("조예", "서수현"),
        PeopleData("조이", "이유리"),
        PeopleData("춘배", "김지훈"),
        PeopleData("마누", "송지혁"),
        PeopleData("줄리", "최유정"),
        PeopleData("루한", "이은진"),
        PeopleData("조예", "서수현"),
        PeopleData("조이", "이유리"),
        PeopleData("춘배", "김지훈"),
        PeopleData("마누", "송지혁"),
        PeopleData("줄리", "최유정"),
        PeopleData("루한", "이은진"),
        PeopleData("조예", "서수현"),
        PeopleData("조이", "이유리"),
        PeopleData("춘배", "김지훈"),
        PeopleData("마누", "송지혁"),
        PeopleData("줄리", "최유정"),
        PeopleData("루한", "이은진"),
        PeopleData("조예", "서수현"),
        PeopleData("조이", "이유리"),
        PeopleData("춘배", "김지훈"),
        PeopleData("마누", "송지혁"),
        PeopleData("줄리", "최유정"),
        PeopleData("루한", "이은진"),
        PeopleData("조예", "서수현"),
        PeopleData("조이", "이유리"),
        PeopleData("춘배", "김지훈"),
        PeopleData("마누", "송지혁"),
        PeopleData("줄리", "최유정"),
        PeopleData("루한", "이은진"),
        PeopleData("조예", "서수현"),

        )
}


data class PeopleData(
    val id: String,
    val name: String
) : Serializable {
}