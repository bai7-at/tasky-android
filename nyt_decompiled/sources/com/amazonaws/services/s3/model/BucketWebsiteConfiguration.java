package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class BucketWebsiteConfiguration implements Serializable {
    private String errorDocument;
    private String indexDocumentSuffix;
    private RedirectRule redirectAllRequestsTo;
    private List<RoutingRule> routingRules = new LinkedList();

    public BucketWebsiteConfiguration() {
    }

    public String getErrorDocument() {
        return this.errorDocument;
    }

    public String getIndexDocumentSuffix() {
        return this.indexDocumentSuffix;
    }

    public RedirectRule getRedirectAllRequestsTo() {
        return this.redirectAllRequestsTo;
    }

    public List<RoutingRule> getRoutingRules() {
        return this.routingRules;
    }

    public void setErrorDocument(String str) {
        this.errorDocument = str;
    }

    public void setIndexDocumentSuffix(String str) {
        this.indexDocumentSuffix = str;
    }

    public void setRedirectAllRequestsTo(RedirectRule redirectRule) {
        this.redirectAllRequestsTo = redirectRule;
    }

    public void setRoutingRules(List<RoutingRule> list) {
        this.routingRules = list;
    }

    public BucketWebsiteConfiguration withRedirectAllRequestsTo(RedirectRule redirectRule) {
        this.redirectAllRequestsTo = redirectRule;
        return this;
    }

    public BucketWebsiteConfiguration withRoutingRules(List<RoutingRule> list) {
        this.routingRules = list;
        return this;
    }

    public BucketWebsiteConfiguration(String str) {
        this.indexDocumentSuffix = str;
    }

    public BucketWebsiteConfiguration(String str, String str2) {
        this.indexDocumentSuffix = str;
        this.errorDocument = str2;
    }
}
