package com.hulkhiretech.payments.util.mmconvert.idtostring;

import org.modelmapper.AbstractConverter;

import com.hulkhiretech.payments.constant.PaymentTypeEnum;

public class PaymentTypeEnumIdToStringConverter extends AbstractConverter<Integer, String> {
    @Override
    protected String convert(Integer source) {
        return PaymentTypeEnum.getById(source).getName();
    }
}