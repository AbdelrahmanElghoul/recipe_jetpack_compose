package com.example.kcompose.domain.util

interface DomainMapper <T,DomainModel> {

    fun mapToDomainModel(model: T):DomainModel

    fun mapFromDomainModel(domainModel: DomainModel):T

    fun fromDomainList(models:List<DomainModel>):List<T>
    fun toDomainList(entities:List<T>):List<DomainModel>

}