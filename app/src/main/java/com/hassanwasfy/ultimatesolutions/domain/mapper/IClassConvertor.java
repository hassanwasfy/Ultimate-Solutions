package com.hassanwasfy.ultimatesolutions.domain.mapper;

public interface IClassConvertor<FROM, TO> {
    TO convertToDomainModel(FROM fromType);
}
