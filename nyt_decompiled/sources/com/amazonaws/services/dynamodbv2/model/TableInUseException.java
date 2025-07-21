package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonServiceException;

/* loaded from: classes2.dex */
public class TableInUseException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public TableInUseException(String str) {
        super(str);
    }
}
