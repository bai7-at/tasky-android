package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ListIdentityPoolsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListIdentityPoolsRequest)) {
            return false;
        }
        ListIdentityPoolsRequest listIdentityPoolsRequest = (ListIdentityPoolsRequest) obj;
        if ((listIdentityPoolsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listIdentityPoolsRequest.getMaxResults() != null && !listIdentityPoolsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listIdentityPoolsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listIdentityPoolsRequest.getNextToken() == null || listIdentityPoolsRequest.getNextToken().equals(getNextToken());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getMaxResults() == null ? 0 : getMaxResults().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListIdentityPoolsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListIdentityPoolsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
