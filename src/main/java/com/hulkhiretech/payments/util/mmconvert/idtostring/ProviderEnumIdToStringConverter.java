package com.hulkhiretech.payments.util.mmconvert.idtostring;

import org.modelmapper.AbstractConverter;

import com.hulkhiretech.payments.constant.ProviderEnum;

public class ProviderEnumIdToStringConverter extends AbstractConverter<Integer, String> {
    @Override
    protected String convert(Integer source) {
        return ProviderEnum.getById(source).getName();
    }
}
