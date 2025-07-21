package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class KeySchemaElement implements Serializable {
    private String attributeName;
    private String keyType;

    public KeySchemaElement() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof KeySchemaElement)) {
            return false;
        }
        KeySchemaElement keySchemaElement = (KeySchemaElement) obj;
        if ((keySchemaElement.getAttributeName() == null) ^ (getAttributeName() == null)) {
            return false;
        }
        if (keySchemaElement.getAttributeName() != null && !keySchemaElement.getAttributeName().equals(getAttributeName())) {
            return false;
        }
        if ((keySchemaElement.getKeyType() == null) ^ (getKeyType() == null)) {
            return false;
        }
        return keySchemaElement.getKeyType() == null || keySchemaElement.getKeyType().equals(getKeyType());
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getKeyType() {
        return this.keyType;
    }

    public int hashCode() {
        return (((getAttributeName() == null ? 0 : getAttributeName().hashCode()) + 31) * 31) + (getKeyType() != null ? getKeyType().hashCode() : 0);
    }

    public void setAttributeName(String str) {
        this.attributeName = str;
    }

    public void setKeyType(String str) {
        this.keyType = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributeName() != null) {
            sb.append("AttributeName: " + getAttributeName() + ",");
        }
        if (getKeyType() != null) {
            sb.append("KeyType: " + getKeyType());
        }
        sb.append("}");
        return sb.toString();
    }

    public KeySchemaElement withAttributeName(String str) {
        this.attributeName = str;
        return this;
    }

    public KeySchemaElement withKeyType(String str) {
        this.keyType = str;
        return this;
    }

    public KeySchemaElement(String str, String str2) {
        setAttributeName(str);
        setKeyType(str2);
    }

    public void setKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
    }

    public KeySchemaElement withKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
        return this;
    }

    public KeySchemaElement(String str, KeyType keyType) {
        setAttributeName(str);
        setKeyType(keyType.toString());
    }
}
