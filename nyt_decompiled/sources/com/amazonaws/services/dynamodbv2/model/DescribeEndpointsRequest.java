package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class DescribeEndpointsRequest extends AmazonWebServiceRequest implements Serializable {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeEndpointsRequest)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "{}";
    }
}
