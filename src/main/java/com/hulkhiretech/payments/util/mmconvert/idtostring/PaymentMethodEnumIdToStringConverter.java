package com.hulkhiretech.payments.util.mmconvert.idtostring;

import org.modelmapper.AbstractConverter;

import com.hulkhiretech.payments.constant.PaymentMethodEnum;

public class PaymentMethodEnumIdToStringConverter extends AbstractConverter<Integer, String> {
    @Override
    protected String convert(Integer source) {
        return PaymentMethodEnum.getById(source).getName();
    }
}