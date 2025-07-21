package com.amazonaws.auth.policy;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class Condition {
    protected String conditionKey;

    /* renamed from: type, reason: collision with root package name */
    protected String f35type;
    protected List<String> values;

    public String getConditionKey() {
        return this.conditionKey;
    }

    public String getType() {
        return this.f35type;
    }

    public List<String> getValues() {
        return this.values;
    }

    public void setConditionKey(String str) {
        this.conditionKey = str;
    }

    public void setType(String str) {
        this.f35type = str;
    }

    public void setValues(List<String> list) {
        this.values = list;
    }

    public Condition withConditionKey(String str) {
        setConditionKey(str);
        return this;
    }

    public Condition withType(String str) {
        setType(str);
        return this;
    }

    public Condition withValues(String... strArr) {
        setValues(Arrays.asList(strArr));
        return this;
    }

    public Condition withValues(List<String> list) {
        setValues(list);
        return this;
    }
}
