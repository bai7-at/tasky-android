package com.amazonaws.services.cognitosync.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

@Deprecated
/* loaded from: classes.dex */
public class ListDatasetsRequest extends AmazonWebServiceRequest implements Serializable {
    private String identityId;
    private String identityPoolId;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDatasetsRequest)) {
            return false;
        }
        ListDatasetsRequest listDatasetsRequest = (ListDatasetsRequest) obj;
        if ((listDatasetsRequest.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (listDatasetsRequest.getIdentityPoolId() != null && !listDatasetsRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((listDatasetsRequest.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (listDatasetsRequest.getIdentityId() != null && !listDatasetsRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((listDatasetsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listDatasetsRequest.getNextToken() != null && !listDatasetsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listDatasetsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listDatasetsRequest.getMaxResults() == null || listDatasetsRequest.getMaxResults().equals(getMaxResults());
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentityId() == null ? 0 : getIdentityId().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
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
        if (getIdentityPoolId() != null) {
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        }
        if (getIdentityId() != null) {
            sb.append("IdentityId: " + getIdentityId() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListDatasetsRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public ListDatasetsRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public ListDatasetsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListDatasetsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
