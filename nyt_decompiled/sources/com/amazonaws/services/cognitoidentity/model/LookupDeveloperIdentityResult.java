package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class LookupDeveloperIdentityResult implements Serializable {
    private List<String> developerUserIdentifierList;
    private String identityId;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LookupDeveloperIdentityResult)) {
            return false;
        }
        LookupDeveloperIdentityResult lookupDeveloperIdentityResult = (LookupDeveloperIdentityResult) obj;
        if ((lookupDeveloperIdentityResult.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (lookupDeveloperIdentityResult.getIdentityId() != null && !lookupDeveloperIdentityResult.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((lookupDeveloperIdentityResult.getDeveloperUserIdentifierList() == null) ^ (getDeveloperUserIdentifierList() == null)) {
            return false;
        }
        if (lookupDeveloperIdentityResult.getDeveloperUserIdentifierList() != null && !lookupDeveloperIdentityResult.getDeveloperUserIdentifierList().equals(getDeveloperUserIdentifierList())) {
            return false;
        }
        if ((lookupDeveloperIdentityResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return lookupDeveloperIdentityResult.getNextToken() == null || lookupDeveloperIdentityResult.getNextToken().equals(getNextToken());
    }

    public List<String> getDeveloperUserIdentifierList() {
        return this.developerUserIdentifierList;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getIdentityId() == null ? 0 : getIdentityId().hashCode()) + 31) * 31) + (getDeveloperUserIdentifierList() == null ? 0 : getDeveloperUserIdentifierList().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setDeveloperUserIdentifierList(Collection<String> collection) {
        if (collection == null) {
            this.developerUserIdentifierList = null;
        } else {
            this.developerUserIdentifierList = new ArrayList(collection);
        }
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityId() != null) {
            sb.append("IdentityId: " + getIdentityId() + ",");
        }
        if (getDeveloperUserIdentifierList() != null) {
            sb.append("DeveloperUserIdentifierList: " + getDeveloperUserIdentifierList() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public LookupDeveloperIdentityResult withDeveloperUserIdentifierList(String... strArr) {
        if (getDeveloperUserIdentifierList() == null) {
            this.developerUserIdentifierList = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.developerUserIdentifierList.add(str);
        }
        return this;
    }

    public LookupDeveloperIdentityResult withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public LookupDeveloperIdentityResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public LookupDeveloperIdentityResult withDeveloperUserIdentifierList(Collection<String> collection) {
        setDeveloperUserIdentifierList(collection);
        return this;
    }
}
