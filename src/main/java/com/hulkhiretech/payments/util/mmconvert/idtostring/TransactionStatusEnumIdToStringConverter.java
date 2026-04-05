package com.hulkhiretech.payments.util.mmconvert.idtostring;

import org.modelmapper.AbstractConverter;

import com.hulkhiretech.payments.constant.TransactionStatusEnum;

public class TransactionStatusEnumIdToStringConverter extends AbstractConverter<Integer, String> {
    @Override
    protected String convert(Integer source) {
        return TransactionStatusEnum.getById(source).getName();
    }
}
