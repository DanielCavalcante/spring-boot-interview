package com.spring.boot.interview.springbootinterview.enums;

import lombok.Getter;

@Getter
public enum StateEnum {
	
	AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Ceará"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Minas Gerais"),
    PA("Pará"),
    PB("Paraíba"),
    PR("Paraná"),
    PE("Pernambuco"),
    PI("Piauí"),
    RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    RO("Rondônia"),
    RR("Roraima"),
    SC("Santa Catarina"),
    SP("São Paulo"),
    SE("Sergipe"),
    TO("Tocantins");

	private final String value;

	StateEnum(String value) {
		this.value = value;
	}

	public static StateEnum get(String label) {
		for (StateEnum stateEnum : values()) {
			if (stateEnum.value.equals(label)) {
				return stateEnum;
			}
		}
		return null;
	}

}
