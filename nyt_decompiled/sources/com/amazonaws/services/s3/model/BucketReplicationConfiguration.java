package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class BucketReplicationConfiguration implements Serializable {
    private String roleARN;
    private Map<String, ReplicationRule> rules = new HashMap();

    public BucketReplicationConfiguration addRule(String str, ReplicationRule replicationRule) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Rule id cannot be null or empty.");
        }
        if (replicationRule == null) {
            throw new IllegalArgumentException("Replication rule cannot be null");
        }
        this.rules.put(str, replicationRule);
        return this;
    }

    public String getRoleARN() {
        return this.roleARN;
    }

    public ReplicationRule getRule(String str) {
        return this.rules.get(str);
    }

    public Map<String, ReplicationRule> getRules() {
        return this.rules;
    }

    public BucketReplicationConfiguration removeRule(String str) {
        this.rules.remove(str);
        return this;
    }

    public void setRoleARN(String str) {
        this.roleARN = str;
    }

    public void setRules(Map<String, ReplicationRule> map) {
        if (map == null) {
            throw new IllegalArgumentException("Replication rules cannot be null");
        }
        this.rules = new HashMap(map);
    }

    public BucketReplicationConfiguration withRoleARN(String str) {
        setRoleARN(str);
        return this;
    }

    public BucketReplicationConfiguration withRules(Map<String, ReplicationRule> map) {
        setRules(map);
        return this;
    }
}
